package com.directi.training.srp.exercise;

import java.util.List;

/**
 * Created by shubham.jh on 27/07/16.
 */
public class CarFormatter {

    public String getCarsNames(List<Car> carList) {
        StringBuilder sb = new StringBuilder();
        for (Car car : carList) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() -2);
    }
}
