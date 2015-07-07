package ru.ttv.dao;

import ru.ttv.accountentities.ContactHistoryRecord;

/**
 * Created by user1 on 03.07.2015.
 */
public interface ContactHistoryDAO {
    public int insertContactHistoryRecord();
    public boolean deleteContactHistoryRecord();
    public ContactHistoryRecord findContactHistoryRecord();
    public boolean updateContactHistoryRecord();
    //public RowSet selectCarsRS();
}
