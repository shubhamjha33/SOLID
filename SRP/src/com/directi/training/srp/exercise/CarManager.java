package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    CarDatabase carDatabase;
    CarComparator carComparator;
    CarFormatter carFormatter;

    public CarManager(){
        carDatabase=new CarDatabase();
        carComparator=new CarComparator();
        carFormatter=new CarFormatter();
        carDatabase.add(new Car("1", "Golf III", "Volkswagen"));
        carDatabase.add(new Car("2", "Multipla", "Fiat"));
        carDatabase.add(new Car("3", "Megane", "Renault"));
    }

    public String getCarsNames() {
        return carFormatter.getCarsNames(carDatabase.getCarList());
    }

    public Car getFromDb(final String carId) {
        return carDatabase.getFromDb(carId);
    }

    public Car getBestCar(){
        return carComparator.getBestCar(carDatabase.getCarList());
    }

}
