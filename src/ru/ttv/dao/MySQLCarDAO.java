package ru.ttv.dao;

import ru.ttv.accountentities.Car;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLCarDAO implements CarDAO {
    @Override
    public int insertCar() {
        return 1;
    }

    @Override
    public boolean deleteCar() {
        return true;
    }

    @Override
    public Car findCar(String id, Connection conn) {
        return null;
    }

    @Override
    public Map<Integer, String> getCarList(Connection conn) {
        return null;
    }

    @Override
    public boolean updateCar() {
        return true;
    }
}
