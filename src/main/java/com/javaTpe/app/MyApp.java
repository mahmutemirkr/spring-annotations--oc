package com.javaTpe.app;

import com.javaTpe.AppConfiguration;
import com.javaTpe.domain.Car;
import com.javaTpe.service.IFirstParkService;
import com.javaTpe.service.ISecondParkService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Honda");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ISecondParkService service = context.getBean("secondParkService", ISecondParkService.class);
        service.secondPark(car);
        service.secondLotParking(car);

    }
}
