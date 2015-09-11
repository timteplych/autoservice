package ru.ttv.dao;

import ru.ttv.accountentities.Job;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleJobDAO implements JobDAO {
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    Statement statement = null;
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
        String query = "select ID,\n" +
                "  NAME,\n" +
                "  DESCRIPTION,\n" +
                "  RATE\n" +
                "from JOB where id = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                Job job = new Job();
                job.setId(rs.getInt("ID"));
                job.setName(rs.getString("NAME"));
                job.setDescription(rs.getString("DESCRIPTION"));
                job.setRate(rs.getFloat("RATE"));

                return job;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }

    @Override
    public boolean updateJob() {
        return false;
    }

    @Override
    public Map<Integer, String> getJobList(Connection conn) {
        Map<Integer,String> jobList = new HashMap<>();
        String query = "select id, name as name from JOB";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                jobList.put((Integer) rs.getInt("id"), rs.getString("name"));
            }
        }catch (SQLException ex){

        }

        return jobList;
    }
}
