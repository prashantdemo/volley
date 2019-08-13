package com.example.volly_demo.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.volly_demo.db.Entity.Users;
import java.util.List;


    @Dao
    public interface myDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        void addUser(Users user);

        @Query("select * from Users")
        List<Users> getUsers();
    }
