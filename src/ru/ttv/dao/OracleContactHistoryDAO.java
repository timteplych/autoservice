package ru.ttv.dao;

import ru.ttv.accountentities.ContactHistoryRecord;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleContactHistoryDAO implements ContactHistoryDAO {
    @Override
    public int insertContactHistoryRecord() {
        return 0;
    }

    @Override
    public boolean deleteContactHistoryRecord() {
        return false;
    }

    @Override
    public ContactHistoryRecord findContactHistoryRecord() {
        return null;
    }

    @Override
    public boolean updateContactHistoryRecord() {
        return false;
    }
}
