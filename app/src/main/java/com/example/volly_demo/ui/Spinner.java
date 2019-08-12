package com.example.volly_demo.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.volly_demo.R;
import com.example.volly_demo.db.Config;
import com.example.volly_demo.db.Entity.Users;
import com.example.volly_demo.db.MyAppDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Spinner extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


    }

}