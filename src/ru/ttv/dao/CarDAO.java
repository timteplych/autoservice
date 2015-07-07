package ru.ttv.dao;

import ru.ttv.accountentities.Car;

import javax.sql.RowSet;

/**
 * Created by user1 on 30.06.2015.
 */
public interface CarDAO {
    public int insertCar();
    public boolean deleteCar();
    public Car findCar();
    public boolean updateCar();
    //public RowSet selectCarsRS();
}
