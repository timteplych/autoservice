package ru.ttv.dao;

import ru.ttv.accountentities.CarModel;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleCarModelsDAO implements CarModelsDAO {
    @Override
    public int insertModel() {
        return 0;
    }

    @Override
    public boolean deleteModel() {
        return false;
    }

    @Override
    public CarModel findModel() {
        return null;
    }

    @Override
    public boolean updateModel() {
        return false;
    }
}
