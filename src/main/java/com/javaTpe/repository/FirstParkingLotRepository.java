package com.javaTpe.repository;

import com.javaTpe.domain.Car;
import org.springframework.stereotype.Component;

@Component("firstParkingRepo")
public class FirstParkingLotRepository implements IParkRepository {

    @Override
    public void theParkingLot(Car car) {
        System.out.println(car.getModel()  + " first parking area entered");
    }

}
