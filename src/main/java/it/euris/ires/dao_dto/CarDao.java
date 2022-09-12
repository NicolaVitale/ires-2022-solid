package it.euris.ires.dao_dto;

import java.util.Collections;

public class CarDao {

  public Car readCar(String targa) {
    /** qui dovrei connettermi a un database */
    Car car = new Car();
    car.setTarga(targa);
    // ritorno il risultato
    return car;
  }

  public void deleteCar(String targa) {
    System.out.println("Ho cancellato la macchina con targa " + targa);
  }

  public CarDto searchByModel(String model){

    CarDto dto =  new CarDto();
    // questo lo dovrebbe riempire il db
    dto.setCars(Collections.singletonList(new Car()));
    dto.setModello(model);
    return dto;
  }
}
