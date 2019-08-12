package com.example.volly_demo.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

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

public class Splash extends AppCompatActivity {

    MyAppDatabase myAppDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "myDao").allowMainThreadQueries().build();

                //get data from webservice and store locally


                getData();
            }
        }, 500);
    }

    private void getData() {
        //Creating a string request
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Config.DATA_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                Log.e("response", response.toString());
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);

                        Users users = new Users();

                        //Set fields in Districts object.
                        users.setLogin(jsonObject.getString(Config.TAG_Login));
                        users.setId(jsonObject.getInt(Config.TAG_Id));
                        users.setNode_id(jsonObject.getString(Config.TAG_Node));
                        users.setAvatar_url(jsonObject.getString(Config.TAG_Avatar));
                        users.setGravatar_id(jsonObject.getString(Config.TAG_Gravatar_id));
                        users.setUrl(jsonObject.getString(Config.TAG_url));
                        users.setHtml_url(jsonObject.getString(Config.TAG_htmi_url));
                        users.setFollowers_url(jsonObject.getString(Config.TAG_Followers_url));
                        users.setFollowing_url(jsonObject.getString(Config.TAG_Following_url));
                        users.setGists_url(jsonObject.getString(Config.TAG_Gists_url));
                        users.setStarred_url(jsonObject.getString(Config.TAG_Starred_url));
                        users.setSubscriptions_url(jsonObject.getString(Config.TAG_Subscriptions_url));
                        users.setOrganizations_url(jsonObject.getString(Config.TAG_Organizations_url));
                        users.setRepos_url(jsonObject.getString(Config.TAG_Repos_url));
                        users.setReceived_events_url(jsonObject.getString(Config.TAG_Received_events_url));
                        users.setType(jsonObject.getString(Config.TAG_Type));
                        users.setSite_admin(jsonObject.getString(Config.TAG_Site_admin));


                        myAppDatabase.myDao().addUser(users);



//                        Intent intent = new Intent(Splash.this, Spinner.class);
//                        intent.putExtra("remember", "true");
//                        startActivity(intent);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", error.toString());
            }
        });
    }
}
