package ru.ttv.dao;

import ru.ttv.accountentities.User;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public interface UserDAO {
    public int insertUser();
    public boolean deleteUser();
    public User findUser(String id, Connection conn);
    public boolean updateUser();
    public Map<Integer,String> getUsersList(Connection conn);
    //public RowSet selectCarsRS();
}
