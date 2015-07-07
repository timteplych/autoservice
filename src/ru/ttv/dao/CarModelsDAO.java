package ru.ttv.dao;

import ru.ttv.accountentities.CarModel;

/**
 * Created by user1 on 03.07.2015.
 */
public interface CarModelsDAO {
    public int insertModel();
    public boolean deleteModel();
    public CarModel findModel();
    public boolean updateModel();
    //public RowSet selectCarsRS();
}
