package com.example.mymovie.festival;

import android.app.ProgressDialog;
import android.media.tv.TvContract;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.EventLogTags;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymovie.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class FestivalActivity extends AppCompatActivity {

    private RecyclerView rcv;
    private ArrayList<FestivalModel> list = new ArrayList<>();

    private static final String TAG = FestivalActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);

        rcv = findViewById(R.id.rcvMF);

        new Description().execute();
    }

    private class Description extends AsyncTask<Void, Void, Void>{

        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute(){
            super.onPreExecute();

            progressDialog = new ProgressDialog(FestivalActivity.this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setMessage("Loading...");
            progressDialog.show();

        }

        @Override
        protected Void doInBackground(Void... voids) {

            try{
                Document doc = Jsoup.connect("https://www.kmdb.or.kr/db/festival/").get();
                //필요한 것들 목록
                Elements elements = doc.select("div[class=mImage10]").select("ul").select("li");
                //목록 갯수
                int elementsSize = elements.size();

                for(Element elem : elements){
                    //필요한 정보, 위치 찾아서 추출
                    String mImgUrl = elem.select("li a span[class=mImg1] span")
                            .attr("style").replace("background-image: url(","").replace(")","");
                    String mTitle = elem.select("li a span[class=mImg1] span[class=text]").text();
                    //ArrayList에 계속 추가
                    list.add(new FestivalModel(mImgUrl, mTitle));
                }

                Log.d("debug :", "List " + elements);

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result){
            //ArrayList를 인자로 하여 어댑터와 연결
            FestivalAdapter festivalAdapter = new FestivalAdapter(list);
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(FestivalActivity.this, 2);
            rcv.setLayoutManager(layoutManager);
            rcv.setAdapter(festivalAdapter);

            Log.d(TAG, "layout success");

            progressDialog.dismiss();
        }
    }
}
