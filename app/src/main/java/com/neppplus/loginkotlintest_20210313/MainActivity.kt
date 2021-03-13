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

            if (typeID = admin) {

                Log.d("", "관리자입니다")
            }

            if (typePw = qwer) {

                Log.d("", "로그인에 실패했습니다")

            }



            Toast.makeText(this, "토스트버", Toast.LENGTH_SHORT).show()

        }




    }
}