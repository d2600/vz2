package com.test.vz2;

import com.test.vz2.functionals.InterfaceOne;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

}
