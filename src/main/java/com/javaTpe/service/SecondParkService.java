package com.javaTpe.service;

import com.javaTpe.domain.Car;
import com.javaTpe.repository.IParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SecondParkService implements ISecondParkService{

    @Autowired
    @Qualifier("secondParkingLotRepository")
    private IParkRepository repository;

    @Override
    public void secondPark(Car car) {
        System.out.println(car.getModel() + " diverted to second parking area");
    }

    @Override
    public void secondLotParking(Car car) {

        repository.theParkingLot(car);

    }
}
