package com.example.volly_demo.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.volly_demo.db.Entity.Users;


@Database(entities = {Users.class}, version = 1, exportSchema = false)
public abstract class MyAppDatabase extends RoomDatabase {
        public abstract com.example.volly_demo.db.myDao myDao();
    }

