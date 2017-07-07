package com.gnirt69.recyclerviewoptionmenu;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import static com.gnirt69.recyclerviewoptionmenu.MainActivity.listItems;
import static com.gnirt69.recyclerviewoptionmenu.R.id.spinner;

public class meldenAc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melden);

        Spinner countryView = (Spinner) findViewById(spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.zugN, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countryView.setAdapter(adapter);

        Spinner countryView1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.richtung, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countryView1.setAdapter(adapter1);
    }
    public void sendMessage(View view)
    {
        Intent intent = new Intent(meldenAc.this, MainActivity.class);
        startActivity(intent);

        Button but = (Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            addItemtoList();
            }

            private void addItemtoList() {
                RecyclerItem item = MainActivity.getRa();
            }
        });
    }

}
