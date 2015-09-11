package ru.ttv.dao;

import ru.ttv.accountentities.User;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLUserDAO implements UserDAO {
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
        return null;
    }

    @Override
    public boolean updateUser() {
        return false;
    }

    @Override
    public Map<Integer, String> getUsersList(Connection conn) {
        return null;
    }
}
