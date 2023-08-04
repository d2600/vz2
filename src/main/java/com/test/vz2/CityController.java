package com.test.vz2;

import com.test.vz2.functionals.Calculator;
import com.test.vz2.functionals.InterfaceOne;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class CityController  {


//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody Employee newEmployee) {
//        return repository.save(newEmployee);
//    }
    @PostMapping("/city")
    public String returnCity (@RequestBody Map<String, Integer> cityPopulation){
        String returnName = "";
        int smallPopulation = Integer.MAX_VALUE;

//        List <cities> orderCitys = cities.stream()
//                .sorted(Comparator.comparing((cities::get)))
        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()){
            if (entry.getValue() < smallPopulation){
                smallPopulation = entry.getValue();
                returnName = entry.getKey();
            }
        }
        SetInterface imprimir1 = new SetInterface();
        imprimir1.printSomething();

        InterfaceOne imprimir2 = new InterfaceOne() {
            @Override
            public void printSomething() {
                System.out.println("imprimir 2");
            }
        };
        imprimir2.printSomething();

        InterfaceOne imprmir3 = () -> System.out.println("imprimir con lambda");
        imprmir3.printSomething();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };
//        ;
        System.out.println(calculator.calculate(5,6));
        IntBinaryOperator calc2 = (x,y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };
        System.out.println("imprimit con Interface local: "+calc2.applyAsInt(5,6));
        return returnName;
    }

    @PostMapping(value = "/ciudades/ordenar", consumes = "application/json")
    public List<City> ordenarCiudadesPorPoblacion(@RequestBody List<City> ciudades) {
        // Ordenamos la lista de ciudades de forma ascendente basándonos en la población
        List<City> ciudadesOrdenadas = ciudades.stream()
                .sorted(Comparator.comparing(City::getNombre))
                .collect(Collectors.toList());

        return ciudadesOrdenadas;
    }
    @PostMapping(value = "/examples/stream"/*, consumes = "application/json"*/)
    public String  StreamSimpleExample (@RequestBody int index) {
        String stringFinal = "";

        Integer [] scores = new Integer[]{80,50,47,40,60};

        List <String> shoppingList = new ArrayList<>();
        shoppingList.add("coffe");
        shoppingList.add("bread");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        shoppingList.add("tacos");
        shoppingList.add("tacos");


        Stream<Integer> streamScore = Arrays.stream(scores);
//        Stream<String> streamShop =  shoppingList.stream();

        List <String> shoppingSorted = shoppingList.stream()
                .sorted()
                .map(item -> item.toUpperCase())
//                filter(item ->  item.startsWith("P")).
                .collect(Collectors.toList());
        Stream<String>  streamLetter = Stream.of("a","b", "c");

        System.out.println(shoppingSorted);


        stringFinal = shoppingList.get(index);
        return stringFinal;
    }

}
