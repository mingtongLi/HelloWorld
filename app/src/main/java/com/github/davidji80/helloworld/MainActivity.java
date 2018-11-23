package com.github.davidji80.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,DisplayMessageActivity.class);
        EditText editText=(EditText)findViewById(R.id.edit_message);
        String message=editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }

    public void btnFrameClick(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,FrameLayoutActivity.class);
        startActivity(intent);
    }

    public void btnLinearClick(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void btnTableClick(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,TabIeLayoutActivity.class);
        startActivity(intent);
    }

    public void btnGridClick(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,GridLayoutActivity.class);
        startActivity(intent);
    }






}
