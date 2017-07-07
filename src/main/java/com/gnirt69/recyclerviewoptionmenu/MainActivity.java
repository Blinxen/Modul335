package com.gnirt69.recyclerviewoptionmenu;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.gnirt69.recyclerviewoptionmenu.R.attr.title;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    public static List<RecyclerItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();


        adapter = new MyAdapter(listItems, this);
       recyclerView.setAdapter(adapter);
    }
    public static RecyclerItem getRa(){
        RecyclerItem item = new RecyclerItem("", "");
        item.setTitle("title");
        item.setDescription("subtitles");
        return item;
    }

    public void sendMessage(View view){
        Intent intent = new Intent(MainActivity.this, meldenAc.class);
        startActivity(intent);
    }
}