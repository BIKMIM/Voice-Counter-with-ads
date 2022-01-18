package com.bikmim.voice_counter

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.transition.Slide
import android.view.Gravity
import android.view.View
import android.view.Window
import android.widget.Toast
import com.bikmim.voice_counter.databinding.ActivityHelpBinding
import com.bikmim.voice_counter.databinding.ActivityWelcomeBinding

class HelpActivity : AppCompatActivity() {

    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityHelpBinding? = null

    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    private val binding get() = mBinding!!



    // 뒤로가기 2번 눌러야 종료 되는 변수 선언
    private var doubleBackToExit = false

    override fun onBackPressed() {
        if (doubleBackToExit) {
            finishAffinity()
        } else {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
            doubleBackToExit = true
            runDelayed(1500L) {
                doubleBackToExit = false
            }
        }
    }


    fun runDelayed(millis: Long, function: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed(function, millis)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContentView(R.layout.activity_welcome)
        // 기존 setcontentView는 뷰바인딩을 위해서 제거.
        // 자동 생성된 뷰 바인딩 클래스에서의 inflate 라는 메서드를 활용해서
        // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        mBinding = ActivityHelpBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시 합니다.
        setContentView(binding.root)

        // 이제부터 binding 바인딩 변수를 활용하여 마음 껏 xml 파일 내의 뷰 id 접근이 가능해집니다.
        // 뷰 id도 파스칼케이스 + 카멜케이스의 네이밍규칙 적용으로 인해서
        // tv_message -> tvMessage로 자동 변경 됩니다.


        // 좌우로 Intent 하기 위한 함수.
        // 웰컴 페이지로 전환
        fun backButtonWelcome() {
            this.finish()
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left)
        }


        // WelcomeActivity로 이동
        binding.ivLeft2.setOnClickListener {
            backButtonWelcome()
        }
    }
}