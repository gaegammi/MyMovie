package com.example.mymovie.openmoviedb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.mymovie.R;
import com.example.mymovie.appclasses.Datum;
import com.example.mymovie.appclasses.ResponseModel;
import com.example.mymovie.appclasses.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    ResponseModel responseModel;
    List<Datum> data;
    //직접적으로 가져올 정보 리스트
    List<Result> results;

    RecyclerView rcv;
    RecyclerAdapter rcvAdapter;
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDataSet();
        //팀에서 직접 만든 서버로 어플만들때 처음 Null이기 때문에 nullpoint error 방지용

        rcv = findViewById(R.id.rcv);

        getMovie();

        rcv.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        rcv.setLayoutManager(linearLayoutManager);
        rcvAdapter = new RecyclerAdapter();
        rcv.setAdapter(rcvAdapter);
        rcv.scrollToPosition(0);

    }

    private void getMovie() {

        apiService = ApiClient.getClient().create(ApiService.class);

        Call<ResponseModel> call = apiService.getMovieInfo("TLQ5TI39F0XW4O5C6KA1", "kmdb_new2");
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

                if(response.isSuccessful()){

                    responseModel = response.body();
                    data = responseModel.getData();
                    results = data.get(0).getResult();

                    rcvAdapter = new RecyclerAdapter(results, MainActivity.this);
                    rcv.setAdapter(rcvAdapter);
                    rcv.setItemAnimator(new DefaultItemAnimator());
                    Log.d(TAG, "onResponse : Success, 결과\n" + responseModel.toString());

                }else{
                    Log.d(TAG, "onResponse : Fail");
                }

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Log.d(TAG, "onFailure : " + t.getMessage());
            }
        });

    }

    private void initDataSet(){
        results = new ArrayList<>();
        results.add(new Result());
    }
}