package com.javaTpe.repository;

import com.javaTpe.domain.Car;
import org.springframework.stereotype.Component;

@Component
public class SecondParkingLotRepository implements IParkRepository {

    @Override
    public void theParkingLot(Car car) {
        System.out.println(car.getModel()  + " second parking area entered");

    }

}
