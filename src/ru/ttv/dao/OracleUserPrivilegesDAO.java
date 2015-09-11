package ru.ttv.dao;

import ru.ttv.accountentities.UserPrivilege;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleUserPrivilegesDAO implements UserPrivilegesDAO {
    @Override
    public int insertUserPrivilege() {
        return 0;
    }

    @Override
    public boolean deleteUserPrivilege() {
        return false;
    }

    @Override
    public UserPrivilege findUserPrivilege() {
        return null;
    }

    @Override
    public boolean updateUserPrivilege() {
        return false;
    }
}
