package com.lux.ex079databinding;

import android.view.View;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class User {
    //일반 자료형은 데이터 바인딩에 의해 값 변경이 감시되지 않음.
    //관찰이 가능한 자료형으로 만들어야 값 변경이 감지되어 뷰가 갱신됨.
    public ObservableField<String> name=new ObservableField<>(); //기본형이 아닌 자료형
    public ObservableInt age=new ObservableInt();   //기본형인 경우

    //생성자

    public User(String name, int age) {

        this.name.set(name);
        this.age.set(age);
    }

    //멤버변수 값을 변경하는 기능 메소드 - onClick 속성에 의해 발동하는 특별한 콜백메소드
    //규칙 : public, 리턴은 반드시 void, 파라미터는 무조건 View view
    public void changeData(View view){
        this.name.set("hong");
        this.age.set(30);
    }
}
