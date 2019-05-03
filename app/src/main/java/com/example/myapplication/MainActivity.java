package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radioGroupId);
        textView1=findViewById(R.id.textView1Id);
        textView2=findViewById(R.id.textView2Id);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.settingId){
            Toast.makeText(MainActivity.this,"Setting",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.feedbackId){
            Toast.makeText(MainActivity.this,"Feedback",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.aboutusId){
            Toast.makeText(MainActivity.this,"About us",Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
