package ru.ttv.dao;

import ru.ttv.accountentities.Job;

/**
 * Created by user1 on 03.07.2015.
 */
public interface JobDAO {
    public int insertJob();
    public boolean deleteJob();
    public Job findJob();
    public boolean updateJob();
    //public RowSet selectCarsRS();
}
