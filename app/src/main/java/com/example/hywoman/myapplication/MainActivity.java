package com.example.hywoman.myapplication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.hywoman.myapplication.R.id.seekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
    int size;
    ViewGroup rootContainer;
    Scene scene1;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //Button button1 = (Button) findViewById(R.id.buttonlog); //해당 버튼을 지정합니다.
     // button1.setOnClickListener(new View.OnClickListener() {
      //      @Override
        //    public void onClick(View v) { //버튼이 눌렸을 때
        //     Intent intent = new Intent(MainActivity.this,Teacher_Activity.class);
       //        startActivity(intent); //액티비티 이동
       //   }
      //  });




       // rootContainer = (ViewGroup) findViewById(R.id.MainActivity);
       // scene1 = Scene.getSceneForLayout(rootContainer,R.layout.activity_teacher_,this);
        //scene1.enter();
       // TransitionManager.go(scene1);

        final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
        Button b = (Button)findViewById(R.id.buttonlog);
        final TextView tv = (TextView)findViewById(R.id.textView2);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int id = rg.getCheckedRadioButtonId();
                //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
                RadioButton rb = (RadioButton) findViewById(id);
                tv.setText("결과: " + rb.getText().toString());


            } // end onClick()
        });  // end Listener



        Button button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    public  void onClick(View v){
                        TextView textView3 = (TextView)findViewById(R.id.textView3);
                        textView3.setText("Welcome kindergarten");
                    }
                }
        );

        Log.i("TAG","HYWU on Create ");







    }

    public void NextScreen(View aaa){
        Intent i = new  Intent(this,Teacher_Activity.class);
        startActivity(i);

        Toast toast = Toast.makeText(getApplicationContext(), "환영합니다", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG","HYWU on Pause ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG","HYWU on Stop ");
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    class SeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

        public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
            setBrightness(progress);
        }

        public void onStartTrackingTouch(SeekBar arg0) {

        }

        public void onStopTrackingTouch(SeekBar arg0) {

        }

    }

    private void setBrightness(int value){
        if (value < 10) {
            value = 0;
        }else if (value > 100){
            value = 100;
        }

        //nBrightness = value;

        // 밝기 설정
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.screenBrightness = (float)value / 100;
        getWindow().setAttributes(params);
    }





    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
    //public void buttonlog(View v){
    //    Intent i = new Intent(this, Teacher_Activity.class);
    //    startActivity(i);
   // }



}





