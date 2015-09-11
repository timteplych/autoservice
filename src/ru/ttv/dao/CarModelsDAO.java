package ru.ttv.dao;

import ru.ttv.accountentities.CarModel;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public interface CarModelsDAO {
    public int insertModel();
    public boolean deleteModel();
    public CarModel findModel(String id, Connection conn);
    public boolean updateModel();
    public Map<Integer,String> getCarModelsList(Connection conn);
    //public RowSet selectCarsRS();
}
