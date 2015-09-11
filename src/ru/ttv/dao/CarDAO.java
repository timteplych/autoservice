package ru.ttv.dao;

import ru.ttv.accountentities.Car;
import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 30.06.2015.
 */
public interface CarDAO {
    public int insertCar();
    public boolean deleteCar();
    public Car findCar(String id, Connection conn);
    public boolean updateCar();
    public Map<Integer,String> getCarList(Connection conn);
    //public RowSet selectCarsRS();
}
