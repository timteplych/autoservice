package ru.ttv.dao;

import ru.ttv.accountentities.Staff;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleStaffDAO implements StaffDAO {
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    Statement statement = null;

    @Override
    public int insertStaff() {
        return 0;
    }

    @Override
    public boolean deleteStaff() {
        return false;
    }

    @Override
    public Staff findStaff(String id, Connection conn) {
        String query = "select ID,\n" +
                "  NAME,\n" +
                "  DATEOFBIRTH,\n" +
                "  USER_REF\n" +
                "from STAFF where id = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                Staff staff = new Staff();
                staff.setId(rs.getInt("ID"));
                staff.setName(rs.getString("NAME"));
                staff.setDateOfBirth(rs.getDate("DATEOFBIRTH"));
                staff.setUser(rs.getInt("USER_REF"));
                return staff;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }

    @Override
    public boolean updateStaff() {
        return false;
    }

    @Override
    public Map<Integer, String> getStaffList(Connection conn) {
        Map<Integer,String> staffList = new HashMap<>();
        String query = "select id, name as name from STAFF";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                staffList.put((Integer) rs.getInt("id"), rs.getString("name"));
            }
        }catch (SQLException ex){

        }

        return staffList;
    }
}
