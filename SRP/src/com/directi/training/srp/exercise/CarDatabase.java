package com.directi.training.srp.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shubham.jh on 27/07/16.
 */
public class CarDatabase {

    private List<Car> carList;

    public CarDatabase(){
        carList=new ArrayList<>();
    }

    public void add(Car c){
        carList.add(c);
    }

    public void remove(int index){
        carList.remove(index);
    }

    public List<Car> getCarList(){
        return carList;
    }

    public Car getFromDb(final String carId)
    {
        for (Car car : carList) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }


}
