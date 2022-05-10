package uz.lab.lesson.service;

import uz.lab.lesson.DTO.CarDTO;

import java.util.ArrayList;

public class CarService {
    private static final ArrayList<String> carservice =new ArrayList<String>(){{
        add("bently");
        add("porsha");
        add("tesla");
        add("jp");
        add("limo");
    }};
    public ArrayList<String> getCarService(){  return carservice; }

    public String saveCar(CarDTO name) {
        carservice.add(name.getCarName());
        return ("da saved");
    }
}
