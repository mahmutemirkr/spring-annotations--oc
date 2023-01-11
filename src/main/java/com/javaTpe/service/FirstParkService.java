package com.javaTpe.service;

import com.javaTpe.domain.Car;
import com.javaTpe.repository.IParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("firstpark_service")
public class FirstParkService implements IFirstParkService {

    private IParkRepository iParkRepository;
    @Autowired
    public FirstParkService(@Qualifier("firstParkingRepo") IParkRepository iParkRepository) {
        this.iParkRepository = iParkRepository;
    }

    @Override
    public void firstPark(Car car) {

        System.out.println(car.getModel() + " diverted to first parking area");

    }

    @Override
    public void firstLotParking(Car car) {

        iParkRepository.theParkingLot(car);
    }

}
