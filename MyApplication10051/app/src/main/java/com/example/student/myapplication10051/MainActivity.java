package com.example.student.myapplication10051;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickWrite(View v)
    {
        SharedPreferences sp=getSharedPreferences("data" , MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("myvalue","123");
        ed.commit();


    }


}
