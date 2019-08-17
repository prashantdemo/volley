package com.example.volly_demo.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.volly_demo.R;
import com.example.volly_demo.db.Entity.Users;
import com.example.volly_demo.db.MyAppDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static com.example.volly_demo.db.Config.DATA_URL;

public class Home extends AppCompatActivity {

    MyAppDatabase myAppDatabase;

    //To add into spinner
    private ArrayList<String> userdata;
    Spinner spinner;
    //List of users from Db
    List<Users> usersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        userdata = new ArrayList<>();

        spinner = findViewById(R.id.spinner_Data);

        myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class,"userdb").allowMainThreadQueries().build();
//get data from Db and put into arrayList for spinner
        putData();
    }

    private void putData() {
        usersList = myAppDatabase.myDao().getUsers();
       userdata.add("select user");
        for (int i = 0; i < usersList.size(); i++) {
            userdata.add(usersList.get(i).getLogin());
            Log.e("userNames", usersList.get(i).getLogin());
        }
       spinner.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,userdata));
    }
}


