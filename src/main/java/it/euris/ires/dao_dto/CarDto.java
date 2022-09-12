package it.euris.ires.dao_dto;

import java.util.List;

public class CarDto {

    private String modello;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    private List<Car> cars;
}
