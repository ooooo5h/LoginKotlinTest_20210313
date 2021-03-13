package com.neppplus.loginkotlintest_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        버튼 클릭 이벤트

        LoginBtn.setOnClickListener {



//        그 안에서 1. 아이디/비번에 적힌 값 > 변수 2개로 저장

             val inputId = typeID.text.toString()
             val inputPw = typePw.text.toString()


//          2.  두 변수를 갖고 조건문 활용
//            id : admin / pw : qwer 두개가 다 맞아야 로그인 성공 - AND!!!

            if (inputId == "admin" && inputPw == "qwer") {
//                 관리자입니다. 토스트

                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
                

            else{
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }



        }




    }
}