package com.neppplus.loginpracticehard_20220706

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그인 버튼을 누른 후에 로직 작성
        loginBtn.setOnClickListener {
            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

////            id가 admin인지? password가 asdf인지?
//            if (inputId == "admin") {
////                id가 admin이 맞는 경우 + 추가질문 : password가 asdf가 맞는지?
//                if (inputPw == "asdf") {
////                    id가 admin이 맞고 + password도 admin이 맞는 경우
//                    Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
//                }
//                else {
////                    id는 맞지만, password가 틀릴경우
//                    Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
//                }
//            }
//            else {
////                id가 admin이 아닌 경우
//                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
//            }

////            if / else if / else 문 활용 => 틀린 값으로 계산할때는 그 값만 계산이 된다.
//            if (inputId != "admin") {
////                id가 admin이 아닌경우
//                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
//            }
////            id는 admin이 맞는경우
//            else if (inputPw != "asdf") {
////                id는 admin이 맞지만, pw가 asdf가 아닌경우
//                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
//            }
//            else {
//                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
//            }

//            논리 연산자를 활용해서 id와 pw를 한 번에 분기처리
            if (inputId == "admin" && inputPw == "asdf") {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}