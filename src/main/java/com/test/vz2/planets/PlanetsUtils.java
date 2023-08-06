package com.test.vz2.planets;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetsUtils {

    public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
        List <Planet> returnList = planets.stream()
                        .filter(planet -> planet.getName().startsWith("M"))
                                .collect(Collectors.toList());
//        planets.stream()
        return returnList;
    }

    public List<Planet> getPlanetsWithRings(List<Planet> planets) {
        List <Planet> returnList = planets.stream()
                .filter(planet -> planet.isHasRings())
                .collect(Collectors.toList());
//        planets.stream()
        return returnList;
    }

    public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        List <Planet> returnList = planets.stream()
                .filter(planet -> planet.getNumberOfMoons() > 3)
                .collect(Collectors.toList());
//        planets.stream()
        return returnList;
//        return null;
    }

    public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
        List <Planet> returnList = planets.stream()
                .filter(planet -> planet.getDensity() > 5 )
                .collect(Collectors.toList());
//        planets.stream()
        return returnList;
    }

}