package com.adycoder.cicd1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.adycoder.cicd1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mAMBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        mAMBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mAMBinding.sayHelloButton.setOnClickListener(view ->{
            String helloMessage = mAMBinding.nameEditText.getText().toString().trim();
            mAMBinding.helloTextView.setText(helloMessage + "!! How are you today?");
        });



    }

}










































