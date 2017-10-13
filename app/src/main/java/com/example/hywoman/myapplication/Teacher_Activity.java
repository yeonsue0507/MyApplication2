package com.example.hywoman.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Teacher_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_); //해당 아이디에 자신이 만든 레이아웃의 이름을 쓴다
    }
    public void onButtonClick(View v){
        Toast.makeText(this, "학생을 추가하겠습니까?", Toast.LENGTH_SHORT).show();
    }

}
