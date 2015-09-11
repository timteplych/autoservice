package ru.ttv.dao;

import ru.ttv.accountentities.Job;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public interface JobDAO {
    public int insertJob();
    public boolean deleteJob();
    public Job findJob(String id, Connection conn);
    public boolean updateJob();
    public Map<Integer,String> getJobList(Connection conn);
    //public RowSet selectCarsRS();
}
