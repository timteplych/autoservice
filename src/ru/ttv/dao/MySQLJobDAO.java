package ru.ttv.dao;

import ru.ttv.accountentities.Job;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLJobDAO implements JobDAO {
    @Override
    public int insertJob() {
        return 0;
    }

    @Override
    public boolean deleteJob() {
        return false;
    }

    @Override
    public Job findJob(String id, Connection conn) {
        return null;
    }

    @Override
    public boolean updateJob() {
        return false;
    }

    @Override
    public Map<Integer, String> getJobList(Connection conn) {
        return null;
    }
}
