package com.three.var_val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val : 값이 한 번 할당되면 변경할 수 없는 변수 (상수, 설정 값 등)
        val value1 = "이것은 value1"
        val value2 = "이것은 value2"

        // Error
        // value1 = "value1 아니야"

        // var : 값이 여러 번 할당될 수 있는 변수 (사용자 입력 값 저장, 동적인 데이터 저장 시)
        var value3 = "이것은 value3"
        value3 = "value3 아닌데?"

        // Log : 디버깅 및 로그 출력을 위한 클래스 (프로그램 동작 파악 시)
        Log.e("MainActivity", "Log"); // 오류
        Log.w("MainActivity", "Log"); // 경고
        Log.i("MainActivity", "Log"); // 정보 (프로그램 동작 파악 시, 중요 이벤트 기록 시)
        Log.d("MainActivity", "Log"); // 디버그 (개발 중 출력, 배포 시 출력 X)
        Log.v("MainActivity", "Log"); // 상세 (프로그램 실행 흐름, 상세한 변수 확인 시)
    }
}