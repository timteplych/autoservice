package ru.ttv.dao;

import ru.ttv.accountentities.User;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleUserDAO implements UserDAO {
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    Statement statement = null;
    @Override
    public int insertUser() {
        return 0;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }

    @Override
    public User findUser(String id, Connection conn) {
        String query = "select ID,\n" +
                "  USERNAME,\n" +
                "  USERPRIVILEGE,\n" +
                "  USERPASSWORD\n" +
                "from USERS where id = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setUsername(rs.getString("USERNAME"));
                user.setUserprivilege(rs.getInt("USERPRIVILEGE"));
                user.setUserPassword(rs.getString("USERPASSWORD"));
                return user;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }

    @Override
    public boolean updateUser() {
        return false;
    }

    @Override
    public Map<Integer, String> getUsersList(Connection conn) {
        Map<Integer,String> usersList = new HashMap<>();
        String query = "select id, username as name from USERS";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                usersList.put((Integer) rs.getInt("id"), rs.getString("name"));
            }
        }catch (SQLException ex){

        }

        return usersList;
    }

}
