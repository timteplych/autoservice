package ru.ttv.dao;

import ru.ttv.accountentities.CarModel;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLCarModelsDAO implements CarModelsDAO {
    @Override
    public int insertModel() {
        return 0;
    }

    @Override
    public boolean deleteModel() {
        return false;
    }

    @Override
    public CarModel findModel(String id, Connection conn) {
        return null;
    }

    @Override
    public boolean updateModel() {
        return false;
    }

    @Override
    public Map<Integer, String> getCarModelsList(Connection conn) {
        return null;
    }
}
