package com.example.mygrocery.Repository;

import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public interface IRepository<T> {
    List<T> GetAll();
    long Insert(T entity, boolean closeContext);
    long Insert(T entity, boolean closeContext, SQLiteDatabase db);
    T Get(long id);
    void Close();
}
