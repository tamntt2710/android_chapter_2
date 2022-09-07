package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.myapplication.adapter.UserAdapter;
import com.example.myapplication.api.getUser;
import com.example.myapplication.model.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private List<User> mListUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvUser=findViewById(R.id.recyclerviewUser);

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        rcvUser.setLayoutManager(linearLayoutManager);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvUser.addItemDecoration(itemDecoration);

        mListUser=new ArrayList<>();
        getApiUser();

    }
    private void getApiUser(){
        getUser.getUser.getListUser().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                mListUser=response.body();
                UserAdapter userAdapter = new UserAdapter(mListUser);
                rcvUser.setAdapter(userAdapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }
}