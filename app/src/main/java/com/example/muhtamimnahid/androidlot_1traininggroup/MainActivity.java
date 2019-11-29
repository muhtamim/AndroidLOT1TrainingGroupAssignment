package com.example.muhtamimnahid.androidlot_1traininggroup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView Student_List,Teacher_List,Facebook_group,Contuct_US;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student_List = (TextView) findViewById(R.id.Student_List);
        Teacher_List = (TextView) findViewById(R.id.Teacher_List);
        Facebook_group = (TextView) findViewById(R.id.Facebook_Group);
        Contuct_US = (TextView) findViewById(R.id.Contact_Us);


        Student_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Student_List.class);
                startActivity(intent);
            }
        });

        Teacher_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Teacher_List.class);
                startActivity(intent);
            }
        });

        Facebook_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Facebook_Group.class);
                startActivity(intent);
            }
        });

        Contuct_US.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Contact_US.class);
                startActivity(intent);
            }
        });
    }
}
