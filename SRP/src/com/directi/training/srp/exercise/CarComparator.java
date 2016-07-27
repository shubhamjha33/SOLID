package com.directi.training.srp.exercise;

import java.util.List;

/**
 * Created by shubham.jh on 27/07/16.
 */
public class CarComparator {

    public Car getBestCar(List<Car> carList)
    {
        Car bestCar = null;
        for (Car car : carList) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}
