package com.lux.ex079databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.lux.ex079databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //데이터 바인딩은 뷰바인딩의 업그레이드 버전(데이터 바인딩을 하면 뷰바인딩은 자동으로 적용됨)
    //데이터 바인딩 기능 on - build.gradle

    //뷰바인딩과 다르게 xml 문서의 root(최상위)가 <layout>이라는 요소로 되어 있어야
    //바인딩 클래스가 자동으로 만들어짐.

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        //뷰와 연결된 데이터를 가진 User 객체 생성
        User user=new User("sam",20);
        binding.setUser(user);

        //이런 식의 작업은 뷰 바인딩의 기법
        binding.btn.setOnClickListener(view -> binding.setUser(new User("robin",23)));
    }

}