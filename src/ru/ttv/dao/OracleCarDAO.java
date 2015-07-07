package ru.ttv.dao;

import ru.ttv.accountentities.Car;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleCarDAO implements CarDAO {
    @Override
    public int insertCar() {
        return 1;
    }

    @Override
    public boolean deleteCar() {
        return true;
    }

    @Override
    public Car findCar() {
        return new Car();
    }

    @Override
    public boolean updateCar() {
        return true;
    }
}
