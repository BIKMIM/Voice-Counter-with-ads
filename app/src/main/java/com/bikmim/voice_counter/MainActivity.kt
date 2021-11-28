package com.bikmim.voice_counter

import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.WindowManager
import android.widget.Toast
import com.bikmim.voice_counter.databinding.ActivityMainBinding
import com.google.android.gms.ads.*
import com.google.android.gms.ads.MobileAds


class MainActivity : AppCompatActivity(), SensorEventListener {


    // 전역 변수로 바인딩 객체 선언
    private lateinit var mBinding: ActivityMainBinding



    private lateinit var mAdView : AdView

    private val tag: String = "로그"

    private var pCount = 0  // 카운트 초기화

    private lateinit var soundPool: SoundPool

    private var sound1: Int = 0
    private var sound2: Int = 0
    private var sound3: Int = 0
    private var sound4: Int = 0
    private var sound5: Int = 0
    private var sound6: Int = 0
    private var sound7: Int = 0
    private var sound8: Int = 0
    private var sound9: Int = 0
    private var sound10: Int = 0
    private var sound11: Int = 0
    private var sound12: Int = 0
    private var sound13: Int = 0
    private var sound14: Int = 0
    private var sound15: Int = 0
    private var sound16: Int = 0
    private var sound17: Int = 0
    private var sound18: Int = 0
    private var sound19: Int = 0
    private var sound20: Int = 0
    private var sound21: Int = 0
    private var sound22: Int = 0
    private var sound23: Int = 0
    private var sound24: Int = 0
    private var sound25: Int = 0
    private var sound26: Int = 0
    private var sound27: Int = 0
    private var sound28: Int = 0
    private var sound29: Int = 0
    private var sound30: Int = 0
    private var sound31: Int = 0
    private var sound32: Int = 0
    private var sound33: Int = 0
    private var sound34: Int = 0
    private var sound35: Int = 0
    private var sound36: Int = 0
    private var sound37: Int = 0
    private var sound38: Int = 0
    private var sound39: Int = 0
    private var sound40: Int = 0
    private var sound41: Int = 0
    private var sound42: Int = 0
    private var sound43: Int = 0
    private var sound44: Int = 0
    private var sound45: Int = 0
    private var sound46: Int = 0
    private var sound47: Int = 0
    private var sound48: Int = 0
    private var sound49: Int = 0
    private var sound50: Int = 0
    private var sound51: Int = 0
    private var sound52: Int = 0
    private var sound53: Int = 0
    private var sound54: Int = 0
    private var sound55: Int = 0
    private var sound56: Int = 0
    private var sound57: Int = 0
    private var sound58: Int = 0
    private var sound59: Int = 0
    private var sound60: Int = 0
    private var sound61: Int = 0
    private var sound62: Int = 0
    private var sound63: Int = 0
    private var sound64: Int = 0
    private var sound65: Int = 0
    private var sound66: Int = 0
    private var sound67: Int = 0
    private var sound68: Int = 0
    private var sound69: Int = 0
    private var sound70: Int = 0
    private var sound71: Int = 0
    private var sound72: Int = 0
    private var sound73: Int = 0
    private var sound74: Int = 0
    private var sound75: Int = 0
    private var sound76: Int = 0
    private var sound77: Int = 0
    private var sound78: Int = 0
    private var sound79: Int = 0
    private var sound80: Int = 0
    private var sound81: Int = 0
    private var sound82: Int = 0
    private var sound83: Int = 0
    private var sound84: Int = 0
    private var sound85: Int = 0
    private var sound86: Int = 0
    private var sound87: Int = 0
    private var sound88: Int = 0
    private var sound89: Int = 0
    private var sound90: Int = 0
    private var sound91: Int = 0
    private var sound92: Int = 0
    private var sound93: Int = 0
    private var sound94: Int = 0
    private var sound95: Int = 0
    private var sound96: Int = 0
    private var sound97: Int = 0
    private var sound98: Int = 0
    private var sound99: Int = 0
    private var sound100: Int = 0
    private var sound100c: Int = 0
    private var sound100fc: Int = 0
    private var sound200: Int = 0
    private var sound200c: Int = 0
    private var sound300: Int = 0
    private var sound300c: Int = 0
    private var sound400: Int = 0
    private var sound400c: Int = 0
    private var sound500: Int = 0
    private var sound500c: Int = 0
    private var sound600: Int = 0
    private var sound600c: Int = 0
    private var sound700: Int = 0
    private var sound700c: Int = 0
    private var sound800: Int = 0
    private var sound800c: Int = 0
    private var sound900: Int = 0
    private var sound900c: Int = 0
    private var sound1000: Int = 0

    private var soundtoggle: Boolean = true   // 음소거용 사운드토글 버튼 (테스트중)

    // 사운드 파일 실행을 함수로 만들어놓고 불러다 쓸 예정
    private fun playSound1() {
        if (sound1 != 0) {
            soundPool.play(sound1, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound2() {
        if (sound2 != 0) {
            soundPool.play(sound2, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound3() {
        if (sound3 != 0) {
            soundPool.play(sound3, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound4() {
        if (sound4 != 0) {
            soundPool.play(sound4, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound5() {
        if (sound5 != 0) {
            soundPool.play(sound5, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound6() {
        if (sound6 != 0) {
            soundPool.play(sound6, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound7() {
        if (sound7 != 0) {
            soundPool.play(sound7, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound8() {
        if (sound8 != 0) {
            soundPool.play(sound8, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound9() {
        if (sound9 != 0) {
            soundPool.play(sound9, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound10() {
        if (sound10 != 0) {
            soundPool.play(sound10, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound11() {
        if (sound11 != 0) {
            soundPool.play(sound11, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound12() {
        if (sound12 != 0) {
            soundPool.play(sound12, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound13() {
        if (sound13 != 0) {
            soundPool.play(sound13, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound14() {
        if (sound14 != 0) {
            soundPool.play(sound14, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound15() {
        if (sound15 != 0) {
            soundPool.play(sound15, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound16() {
        if (sound16 != 0) {
            soundPool.play(sound16, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound17() {
        if (sound17 != 0) {
            soundPool.play(sound17, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound18() {
        if (sound18 != 0) {
            soundPool.play(sound18, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound19() {
        if (sound19 != 0) {
            soundPool.play(sound19, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound20() {
        if (sound20 != 0) {
            soundPool.play(sound20, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound21() {
        if (sound21 != 0) {
            soundPool.play(sound21, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound22() {
        if (sound22 != 0) {
            soundPool.play(sound22, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound23() {
        if (sound23 != 0) {
            soundPool.play(sound23, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound24() {
        if (sound24 != 0) {
            soundPool.play(sound24, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound25() {
        if (sound25 != 0) {
            soundPool.play(sound25, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound26() {
        if (sound26 != 0) {
            soundPool.play(sound26, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound27() {
        if (sound27 != 0) {
            soundPool.play(sound27, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound28() {
        if (sound28 != 0) {
            soundPool.play(sound28, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound29() {
        if (sound29 != 0) {
            soundPool.play(sound29, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound30() {
        if (sound30 != 0) {
            soundPool.play(sound30, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound31() {
        if (sound31 != 0) {
            soundPool.play(sound31, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound32() {
        if (sound32 != 0) {
            soundPool.play(sound32, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound33() {
        if (sound33 != 0) {
            soundPool.play(sound33, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound34() {
        if (sound34 != 0) {
            soundPool.play(sound34, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound35() {
        if (sound35 != 0) {
            soundPool.play(sound35, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound36() {
        if (sound36 != 0) {
            soundPool.play(sound36, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound37() {
        if (sound37 != 0) {
            soundPool.play(sound37, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound38() {
        if (sound38 != 0) {
            soundPool.play(sound38, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound39() {
        if (sound39 != 0) {
            soundPool.play(sound39, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound40() {
        if (sound40 != 0) {
            soundPool.play(sound40, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound41() {
        if (sound41 != 0) {
            soundPool.play(sound41, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound42() {
        if (sound42 != 0) {
            soundPool.play(sound42, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound43() {
        if (sound43 != 0) {
            soundPool.play(sound43, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound44() {
        if (sound44 != 0) {
            soundPool.play(sound44, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound45() {
        if (sound45 != 0) {
            soundPool.play(sound45, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound46() {
        if (sound46 != 0) {
            soundPool.play(sound46, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound47() {
        if (sound47 != 0) {
            soundPool.play(sound47, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound48() {
        if (sound48 != 0) {
            soundPool.play(sound48, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound49() {
        if (sound49 != 0) {
            soundPool.play(sound49, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound50() {
        if (sound50 != 0) {
            soundPool.play(sound50, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound51() {
        if (sound51 != 0) {
            soundPool.play(sound51, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound52() {
        if (sound52 != 0) {
            soundPool.play(sound52, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound53() {
        if (sound53 != 0) {
            soundPool.play(sound53, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound54() {
        if (sound54 != 0) {
            soundPool.play(sound54, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound55() {
        if (sound55 != 0) {
            soundPool.play(sound55, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound56() {
        if (sound56 != 0) {
            soundPool.play(sound56, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound57() {
        if (sound57 != 0) {
            soundPool.play(sound57, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound58() {
        if (sound58 != 0) {
            soundPool.play(sound58, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound59() {
        if (sound59 != 0) {
            soundPool.play(sound59, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound60() {
        if (sound60 != 0) {
            soundPool.play(sound60, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound61() {
        if (sound61 != 0) {
            soundPool.play(sound61, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound62() {
        if (sound62 != 0) {
            soundPool.play(sound62, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound63() {
        if (sound63 != 0) {
            soundPool.play(sound63, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound64() {
        if (sound64 != 0) {
            soundPool.play(sound64, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound65() {
        if (sound65 != 0) {
            soundPool.play(sound65, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound66() {
        if (sound66 != 0) {
            soundPool.play(sound66, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound67() {
        if (sound67 != 0) {
            soundPool.play(sound67, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound68() {
        if (sound68 != 0) {
            soundPool.play(sound68, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound69() {
        if (sound69 != 0) {
            soundPool.play(sound69, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound70() {
        if (sound70 != 0) {
            soundPool.play(sound70, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound71() {
        if (sound71 != 0) {
            soundPool.play(sound71, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound72() {
        if (sound72 != 0) {
            soundPool.play(sound72, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound73() {
        if (sound73 != 0) {
            soundPool.play(sound73, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound74() {
        if (sound74 != 0) {
            soundPool.play(sound74, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound75() {
        if (sound75 != 0) {
            soundPool.play(sound75, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound76() {
        if (sound76 != 0) {
            soundPool.play(sound76, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound77() {
        if (sound77 != 0) {
            soundPool.play(sound77, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound78() {
        if (sound78 != 0) {
            soundPool.play(sound78, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound79() {
        if (sound79 != 0) {
            soundPool.play(sound79, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound80() {
        if (sound80 != 0) {
            soundPool.play(sound80, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound81() {
        if (sound81 != 0) {
            soundPool.play(sound81, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound82() {
        if (sound82 != 0) {
            soundPool.play(sound82, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound83() {
        if (sound83 != 0) {
            soundPool.play(sound83, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound84() {
        if (sound84 != 0) {
            soundPool.play(sound84, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound85() {
        if (sound85 != 0) {
            soundPool.play(sound85, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound86() {
        if (sound86 != 0) {
            soundPool.play(sound86, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound87() {
        if (sound87 != 0) {
            soundPool.play(sound87, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound88() {
        if (sound88 != 0) {
            soundPool.play(sound88, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound89() {
        if (sound89 != 0) {
            soundPool.play(sound89, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound90() {
        if (sound90 != 0) {
            soundPool.play(sound90, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound91() {
        if (sound91 != 0) {
            soundPool.play(sound91, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound92() {
        if (sound92 != 0) {
            soundPool.play(sound92, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound93() {
        if (sound93 != 0) {
            soundPool.play(sound93, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound94() {
        if (sound94 != 0) {
            soundPool.play(sound94, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound95() {
        if (sound95 != 0) {
            soundPool.play(sound95, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound96() {
        if (sound96 != 0) {
            soundPool.play(sound96, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound97() {
        if (sound97 != 0) {
            soundPool.play(sound97, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound98() {
        if (sound98 != 0) {
            soundPool.play(sound98, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound99() {
        if (sound99 != 0) {
            soundPool.play(sound99, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound100() {
        if (sound100 != 0) {
            soundPool.play(sound100, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound100c() {
        if (sound100c != 0) {
            soundPool.play(sound100c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound100fc() {
        if (sound100fc != 0) {
            soundPool.play(sound100fc, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound200() {
        if (sound200 != 0) {
            soundPool.play(sound200, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound200c() {
        if (sound200c != 0) {
            soundPool.play(sound200c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound300() {
        if (sound300 != 0) {
            soundPool.play(sound300, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound300c() {
        if (sound300c != 0) {
            soundPool.play(sound300c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound400() {
        if (sound400 != 0) {
            soundPool.play(sound400, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound400c() {
        if (sound400c != 0) {
            soundPool.play(sound400c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound500() {
        if (sound500 != 0) {
            soundPool.play(sound500, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound500c() {
        if (sound500c != 0) {
            soundPool.play(sound500c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound600() {
        if (sound600 != 0) {
            soundPool.play(sound600, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound600c() {
        if (sound600c != 0) {
            soundPool.play(sound600c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound700() {
        if (sound700 != 0) {
            soundPool.play(sound700, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound700c() {
        if (sound700c != 0) {
            soundPool.play(sound700c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound800() {
        if (sound800 != 0) {
            soundPool.play(sound800, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound800c() {
        if (sound800c != 0) {
            soundPool.play(sound800c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound900() {
        if (sound900 != 0) {
            soundPool.play(sound900, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound900c() {
        if (sound900c != 0) {
            soundPool.play(sound900c, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    private fun playSound1000() {
        if (sound1000 != 0) {
            soundPool.play(sound1000, 1.0f, 1.0f, 1, 0, 1.0f)
        }
    }

    // 센서 매니저
    private lateinit var mysensorManager: SensorManager


    // 뒤로가기 2번 눌러야 종료 되는 변수 선언
    private var doubleBackToExit = false

    override fun onBackPressed() {
        if (doubleBackToExit) {
            finishAffinity()
        } else {
            Toast.makeText(this, "종료하시려면 뒤로가기를 한번 더 눌러주세요.", Toast.LENGTH_SHORT).show()
            doubleBackToExit = true
            runDelayed(1500L) {
                doubleBackToExit = false
            }
        }
    }

    // 여기까지 뒤로 가기 2번 끝
    fun runDelayed(millis: Long, function: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed(function, millis)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 기존 setcontentView 는 뷰바인딩을 위해서 제거.
        // setContentView(R.layout.activity_main)

        // 자동 생성된 뷰 바인딩 클래스에서의 inflate 라는 메서드를 활용해서
        // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시 합니다.
        setContentView(mBinding.root)

        val plusBtn = mBinding.ivPlusBtn // 카운트 + 버튼
        val minusBtn = mBinding.ivMinusBtn // 카운트 - 버튼
        val resetBtn = mBinding.resetBtn // 리셋 버튼

        // 이제부터 binding 바인딩 변수를 활용하여 마음 껏 xml 파일 내의 뷰 id 접근이 가능해집니다.
        // 뷰 id도 파스칼케이스 + 카멜케이스의 네이밍규칙 적용으로 인해서
        // tv_message -> tvMessage 로 자동 변경 됩니다.

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)  // 화면이 켜진채로 유지되게 함.

        MobileAds.initialize(this) {}

        loadBannerAd()   // 구글 애드몹 함수 호출

        // 리셋 버튼 누르면 숫자 0 으로 리셋
        resetBtn.setOnClickListener {
            pCount = 0
            mBinding.tvCount.text = pCount.toString()
        }

        // + 버튼 누르면 숫자 1 더하기
        plusBtn.setOnClickListener {
            pCount += 1
            mBinding.tvCount.text = pCount.toString()
        }

        // - 버튼 누르면 숫자 1 빼기
        minusBtn.setOnClickListener {
            pCount -= 1
            mBinding.tvCount.text = pCount.toString()
        }

        // 센서 매니저 호출
        this.mysensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        val audioAttrs: AudioAttributes = AudioAttributes.Builder()
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(3)   // 최대 동시 재생 숫자
            .setAudioAttributes(audioAttrs)
            .build()

        // 좌우로 Intent 하기 위한 함수.
        // 웰컴 페이지로 전환
        fun backButtonWelcome() {
            this.finish()
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left)
        }


        // WelcomeActivity로 이동
        mBinding.ivLeft1.setOnClickListener {
            backButtonWelcome()
        }


        Log.d(tag, "MainActivity - onCreate() called")
        // 각각 사운드 파일 연결
        sound1 = soundPool.load(this, R.raw.voice1, 1)
        sound2 = soundPool.load(this, R.raw.voice2, 1)
        sound3 = soundPool.load(this, R.raw.voice3, 1)
        sound4 = soundPool.load(this, R.raw.voice4, 1)
        sound5 = soundPool.load(this, R.raw.voice5, 1)
        sound6 = soundPool.load(this, R.raw.voice6, 1)
        sound7 = soundPool.load(this, R.raw.voice7, 1)
        sound8 = soundPool.load(this, R.raw.voice8, 1)
        sound9 = soundPool.load(this, R.raw.voice9, 1)
        sound10 = soundPool.load(this, R.raw.voice10, 1)
        sound11 = soundPool.load(this, R.raw.voice11, 1)
        sound12 = soundPool.load(this, R.raw.voice12, 1)
        sound13 = soundPool.load(this, R.raw.voice13, 1)
        sound14 = soundPool.load(this, R.raw.voice14, 1)
        sound15 = soundPool.load(this, R.raw.voice15, 1)
        sound16 = soundPool.load(this, R.raw.voice16, 1)
        sound17 = soundPool.load(this, R.raw.voice17, 1)
        sound18 = soundPool.load(this, R.raw.voice18, 1)
        sound19 = soundPool.load(this, R.raw.voice19, 1)
        sound20 = soundPool.load(this, R.raw.voice20, 1)
        sound21 = soundPool.load(this, R.raw.voice21, 1)
        sound22 = soundPool.load(this, R.raw.voice22, 1)
        sound23 = soundPool.load(this, R.raw.voice23, 1)
        sound24 = soundPool.load(this, R.raw.voice24, 1)
        sound25 = soundPool.load(this, R.raw.voice25, 1)
        sound26 = soundPool.load(this, R.raw.voice26, 1)
        sound27 = soundPool.load(this, R.raw.voice27, 1)
        sound28 = soundPool.load(this, R.raw.voice28, 1)
        sound29 = soundPool.load(this, R.raw.voice29, 1)
        sound30 = soundPool.load(this, R.raw.voice30, 1)
        sound31 = soundPool.load(this, R.raw.voice31, 1)
        sound32 = soundPool.load(this, R.raw.voice32, 1)
        sound33 = soundPool.load(this, R.raw.voice33, 1)
        sound34 = soundPool.load(this, R.raw.voice34, 1)
        sound35 = soundPool.load(this, R.raw.voice35, 1)
        sound36 = soundPool.load(this, R.raw.voice36, 1)
        sound37 = soundPool.load(this, R.raw.voice37, 1)
        sound38 = soundPool.load(this, R.raw.voice38, 1)
        sound39 = soundPool.load(this, R.raw.voice39, 1)
        sound40 = soundPool.load(this, R.raw.voice40, 1)
        sound41 = soundPool.load(this, R.raw.voice41_1, 1)
        sound42 = soundPool.load(this, R.raw.voice42_1, 1)
        sound43 = soundPool.load(this, R.raw.voice43_1, 1)
        sound44 = soundPool.load(this, R.raw.voice44_1, 1)
        sound45 = soundPool.load(this, R.raw.voice45_1, 1)
        sound46 = soundPool.load(this, R.raw.voice46_1, 1)
        sound47 = soundPool.load(this, R.raw.voice47_1, 1)
        sound48 = soundPool.load(this, R.raw.voice48_1, 1)
        sound49 = soundPool.load(this, R.raw.voice49_1, 1)
        sound50 = soundPool.load(this, R.raw.voice50, 1)
        sound51 = soundPool.load(this, R.raw.voice51_1, 1)
        sound52 = soundPool.load(this, R.raw.voice52_1, 1)
        sound53 = soundPool.load(this, R.raw.voice53_1, 1)
        sound54 = soundPool.load(this, R.raw.voice54_1, 1)
        sound55 = soundPool.load(this, R.raw.voice55_1, 1)
        sound56 = soundPool.load(this, R.raw.voice56_1, 1)
        sound57 = soundPool.load(this, R.raw.voice57_1, 1)
        sound58 = soundPool.load(this, R.raw.voice58_1, 1)
        sound59 = soundPool.load(this, R.raw.voice59_1, 1)
        sound60 = soundPool.load(this, R.raw.voice60_1, 1)
        sound61 = soundPool.load(this, R.raw.voice61_1, 1)
        sound62 = soundPool.load(this, R.raw.voice62_1, 1)
        sound63 = soundPool.load(this, R.raw.voice63_1, 1)
        sound64 = soundPool.load(this, R.raw.voice64_1, 1)
        sound65 = soundPool.load(this, R.raw.voice65_1, 1)
        sound66 = soundPool.load(this, R.raw.voice66_1, 1)
        sound67 = soundPool.load(this, R.raw.voice67_1, 1)
        sound68 = soundPool.load(this, R.raw.voice68_1, 1)
        sound69 = soundPool.load(this, R.raw.voice69_1, 1)
        sound70 = soundPool.load(this, R.raw.voice70, 1)
        sound71 = soundPool.load(this, R.raw.voice71, 1)
        sound72 = soundPool.load(this, R.raw.voice72, 1)
        sound73 = soundPool.load(this, R.raw.voice73, 1)
        sound74 = soundPool.load(this, R.raw.voice74, 1)
        sound75 = soundPool.load(this, R.raw.voice75, 1)
        sound76 = soundPool.load(this, R.raw.voice76, 1)
        sound77 = soundPool.load(this, R.raw.voice77, 1)
        sound78 = soundPool.load(this, R.raw.voice78, 1)
        sound79 = soundPool.load(this, R.raw.voice79, 1)
        sound80 = soundPool.load(this, R.raw.voice80, 1)
        sound81 = soundPool.load(this, R.raw.voice81, 1)
        sound82 = soundPool.load(this, R.raw.voice82, 1)
        sound83 = soundPool.load(this, R.raw.voice83, 1)
        sound84 = soundPool.load(this, R.raw.voice84, 1)
        sound85 = soundPool.load(this, R.raw.voice85, 1)
        sound86 = soundPool.load(this, R.raw.voice86, 1)
        sound87 = soundPool.load(this, R.raw.voice87, 1)
        sound88 = soundPool.load(this, R.raw.voice88, 1)
        sound89 = soundPool.load(this, R.raw.voice89, 1)
        sound90 = soundPool.load(this, R.raw.voice90, 1)
        sound91 = soundPool.load(this, R.raw.voice91, 1)
        sound92 = soundPool.load(this, R.raw.voice92, 1)
        sound93 = soundPool.load(this, R.raw.voice93, 1)
        sound94 = soundPool.load(this, R.raw.voice94, 1)
        sound95 = soundPool.load(this, R.raw.voice95, 1)
        sound96 = soundPool.load(this, R.raw.voice96, 1)
        sound97 = soundPool.load(this, R.raw.voice97, 1)
        sound98 = soundPool.load(this, R.raw.voice98, 1)
        sound99 = soundPool.load(this, R.raw.voice99, 1)
        sound100 = soundPool.load(this, R.raw.voice100, 1)
        sound100c = soundPool.load(this, R.raw.voice100c, 1)
        sound100fc = soundPool.load(this, R.raw.voice100fc, 1)
        sound200 = soundPool.load(this, R.raw.voice200, 1)
        sound200c = soundPool.load(this, R.raw.voice200c, 1)
        sound300 = soundPool.load(this, R.raw.voice300, 1)
        sound300c = soundPool.load(this, R.raw.voice300c, 1)
        sound400 = soundPool.load(this, R.raw.voice400, 1)
        sound400c = soundPool.load(this, R.raw.voice400c, 1)
        sound500 = soundPool.load(this, R.raw.voice500, 1)
        sound500c = soundPool.load(this, R.raw.voice500c, 1)
        sound600 = soundPool.load(this, R.raw.voice600, 1)
        sound600c = soundPool.load(this, R.raw.voice600c, 1)
        sound700 = soundPool.load(this, R.raw.voice700, 1)
        sound700c = soundPool.load(this, R.raw.voice700c, 1)
        sound800 = soundPool.load(this, R.raw.voice800, 1)
        sound800c = soundPool.load(this, R.raw.voice800c, 1)
        sound900 = soundPool.load(this, R.raw.voice900, 1)
        sound900c = soundPool.load(this, R.raw.voice900c, 1)
        sound1000 = soundPool.load(this, R.raw.voice1000, 1)

    }


    // 구글 애드몹 로딩 함수
    private fun loadBannerAd() {
        MobileAds.initialize(this) {}

        mAdView = mBinding.adView
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mAdView.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.

            }
        }
    }


    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
        Log.d(tag, "MainActivity - onAccuracyChanged() called")
    }


    // 센서값이 변했을때의 함수
    override fun onSensorChanged(event: SensorEvent?) {


        val toggleBtn = mBinding.toggleButton1 // 토글 버튼




        // 토글 버튼 눌러서 ON/OFF 상태 확인 및 반환
        toggleBtn.setOnCheckedChangeListener { _, ischecked ->
            soundtoggle = ischecked
        }

        val x: Float = event?.values?.get(0) as Float   // 근접센서값을 Float 으로 받아오기
        val x2Int = x.toInt()  // Float 값을 정수인 Int 으로 변경

        if (x2Int == 0) {  // 센서값이 근접값이면
            pCount += 1 // 카운트에 1을 더하고
            mBinding.tvCount.text = pCount.toString() // Int 를 String 으로 바꿔서 화면에 표시

            // 토글버튼이 false 면 soundPool 볼륨을 0으로 설정.
            if (!soundtoggle) {
                soundPool.setVolume(0, 0f, 0f)
            } else {  // 토글버튼이 true 면 when 구문에 따른 사운드 출력
                when (pCount) {   // 숫자에 해당하는 음성 출력
                    1 -> playSound1()
                    2 -> playSound2()
                    3 -> playSound3()
                    4 -> playSound4()
                    5 -> playSound5()
                    6 -> playSound6()
                    7 -> playSound7()
                    8 -> playSound8()
                    9 -> playSound9()
                    10 -> playSound10()
                    11 -> playSound11()
                    12 -> playSound12()
                    13 -> playSound13()
                    14 -> playSound14()
                    15 -> playSound15()
                    16 -> playSound16()
                    17 -> playSound17()
                    18 -> playSound18()
                    19 -> playSound19()
                    20 -> playSound20()
                    21 -> playSound21()
                    22 -> playSound22()
                    23 -> playSound23()
                    24 -> playSound24()
                    25 -> playSound25()
                    26 -> playSound26()
                    27 -> playSound27()
                    28 -> playSound28()
                    29 -> playSound29()
                    30 -> playSound30()
                    31 -> playSound31()
                    32 -> playSound32()
                    33 -> playSound33()
                    34 -> playSound34()
                    35 -> playSound35()
                    36 -> playSound36()
                    37 -> playSound37()
                    38 -> playSound38()
                    39 -> playSound39()
                    40 -> playSound40()
                    41 -> playSound41()
                    42 -> playSound42()
                    43 -> playSound43()
                    44 -> playSound44()
                    45 -> playSound45()
                    46 -> playSound46()
                    47 -> playSound47()
                    48 -> playSound48()
                    49 -> playSound49()
                    50 -> playSound50()
                    51 -> playSound51()
                    52 -> playSound52()
                    53 -> playSound53()
                    54 -> playSound54()
                    55 -> playSound55()
                    56 -> playSound56()
                    57 -> playSound57()
                    58 -> playSound58()
                    59 -> playSound59()
                    60 -> playSound60()
                    61 -> playSound61()
                    62 -> playSound62()
                    63 -> playSound63()
                    64 -> playSound64()
                    65 -> playSound65()
                    66 -> playSound66()
                    67 -> playSound67()
                    68 -> playSound68()
                    69 -> playSound69()
                    70 -> playSound70()
                    71 -> playSound71()
                    72 -> playSound72()
                    73 -> playSound73()
                    74 -> playSound74()
                    75 -> playSound75()
                    76 -> playSound76()
                    77 -> playSound77()
                    78 -> playSound78()
                    79 -> playSound79()
                    80 -> playSound80()
                    81 -> playSound81()
                    82 -> playSound82()
                    83 -> playSound83()
                    84 -> playSound84()
                    85 -> playSound85()
                    86 -> playSound86()
                    87 -> playSound87()
                    88 -> playSound88()
                    89 -> playSound89()
                    90 -> playSound90()
                    91 -> playSound91()
                    92 -> playSound92()
                    93 -> playSound93()
                    94 -> playSound94()
                    95 -> playSound95()
                    96 -> playSound96()
                    97 -> playSound97()
                    98 -> playSound98()
                    99 -> playSound99()
                    100 -> playSound100()
                    101 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 250)
                    }
                    102 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 250)
                    }
                    103 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 250)
                    }
                    104 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 250)
                    }
                    105 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 250)
                    }
                    106 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 250)
                    }
                    107 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 250)
                    }
                    108 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 250)
                    }
                    109 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 250)
                    }
                    110 -> {
                        playSound100fc()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    111 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    112 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    113 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    114 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    115 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    116 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    117 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    118 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    119 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    120 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    121 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    122 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    123 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    124 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    125 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    126 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    127 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    128 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    129 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    130 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    131 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    132 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    133 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    134 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    135 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    136 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    137 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    138 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    139 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    140 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    141 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    142 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    143 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    144 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    145 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    146 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    147 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    148 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    149 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    150 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    151 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    152 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    153 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    154 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    155 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    156 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    157 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    158 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    159 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    160 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 300)
                    }
                    161 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 300)
                    }
                    162 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 300)
                    }
                    163 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 300)
                    }
                    164 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 300)
                    }
                    165 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 300)
                    }
                    166 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 300)
                    }
                    167 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 300)
                    }
                    168 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 300)
                    }
                    169 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 300)
                    }
                    170 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 350)
                    }
                    171 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 350)
                    }
                    172 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 350)
                    }
                    173 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 350)
                    }
                    174 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 350)
                    }
                    175 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 350)
                    }
                    176 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 350)
                    }
                    177 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 350)
                    }
                    178 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 350)
                    }
                    179 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 350)
                    }
                    180 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 350)
                    }
                    181 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 350)
                    }
                    182 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 350)
                    }
                    183 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 350)
                    }
                    184 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 350)
                    }
                    185 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 350)
                    }
                    186 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 350)
                    }
                    187 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 350)
                    }
                    188 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 350)
                    }
                    189 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 350)
                    }
                    190 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 350)
                    }
                    191 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 350)
                    }
                    192 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 350)
                    }
                    193 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 350)
                    }
                    194 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 350)
                    }
                    195 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 350)
                    }
                    196 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 350)
                    }
                    197 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 350)
                    }
                    198 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 350)
                    }
                    199 -> {
                        playSound100c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 350)
                    }
                    200 -> playSound200()
                    201 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 250)
                    }
                    202 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 250)
                    }
                    203 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 250)
                    }
                    204 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 250)
                    }
                    205 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 250)
                    }
                    206 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 250)
                    }
                    207 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 250)
                    }
                    208 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 250)
                    }
                    209 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 250)
                    }
                    210 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    211 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    212 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    213 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    214 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    215 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    216 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    217 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    218 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    219 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    220 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    221 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    222 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    223 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    224 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    225 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    226 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    227 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    228 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    229 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    230 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    231 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    232 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    233 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    234 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    235 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    236 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    237 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    238 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    239 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    240 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    241 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    242 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    243 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    244 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    245 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    246 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    247 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    248 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    249 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    250 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    251 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    252 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    253 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    254 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    255 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    256 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    257 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    258 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    259 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    260 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 350)
                    }
                    261 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 350)
                    }
                    262 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 350)
                    }
                    263 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 350)
                    }
                    264 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 350)
                    }
                    265 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 350)
                    }
                    266 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 350)
                    }
                    267 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 350)
                    }
                    268 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 350)
                    }
                    269 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 350)
                    }
                    270 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 350)
                    }
                    271 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 350)
                    }
                    272 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 350)
                    }
                    273 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 350)
                    }
                    274 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 350)
                    }
                    275 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 350)
                    }
                    276 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 350)
                    }
                    277 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 350)
                    }
                    278 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 350)
                    }
                    279 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 350)
                    }
                    280 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 350)
                    }
                    281 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 350)
                    }
                    282 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 350)
                    }
                    283 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 350)
                    }
                    284 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 350)
                    }
                    285 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 350)
                    }
                    286 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 350)
                    }
                    287 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 350)
                    }
                    288 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 350)
                    }
                    289 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 350)
                    }
                    290 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 350)
                    }
                    291 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 350)
                    }
                    292 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 350)
                    }
                    293 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 350)
                    }
                    294 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 350)
                    }
                    295 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 350)
                    }
                    296 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 350)
                    }
                    297 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 350)
                    }
                    298 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 350)
                    }
                    299 -> {
                        playSound200c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 350)
                    }
                    300 -> playSound300()
                    301 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 350)
                    }
                    302 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 350)
                    }
                    303 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 350)
                    }
                    304 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 350)
                    }
                    305 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 350)
                    }
                    306 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 350)
                    }
                    307 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 350)
                    }
                    308 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 350)
                    }
                    309 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 350)
                    }
                    310 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 350)
                    }
                    311 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 350)
                    }
                    312 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 350)
                    }
                    313 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 350)
                    }
                    314 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 350)
                    }
                    315 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 350)
                    }
                    316 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 350)
                    }
                    317 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 350)
                    }
                    318 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 350)
                    }
                    319 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 350)
                    }
                    320 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 350)
                    }
                    321 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 350)
                    }
                    322 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 350)
                    }
                    323 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 350)
                    }
                    324 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 350)
                    }
                    325 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 350)
                    }
                    326 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 350)
                    }
                    327 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 350)
                    }
                    328 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 350)
                    }
                    329 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 350)
                    }
                    330 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 350)
                    }
                    331 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 350)
                    }
                    332 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 350)
                    }
                    333 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 350)
                    }
                    334 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 350)
                    }
                    335 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 350)
                    }
                    336 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 350)
                    }
                    337 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 350)
                    }
                    338 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 350)
                    }
                    339 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 350)
                    }
                    340 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 350)
                    }
                    341 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 350)
                    }
                    342 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 350)
                    }
                    343 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 350)
                    }
                    344 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 350)
                    }
                    345 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 350)
                    }
                    346 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 350)
                    }
                    347 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 350)
                    }
                    348 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 350)
                    }
                    349 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 350)
                    }
                    350 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 350)
                    }
                    351 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 350)
                    }
                    352 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 350)
                    }
                    353 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 350)
                    }
                    354 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 350)
                    }
                    355 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 350)
                    }
                    356 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 350)
                    }
                    357 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 350)
                    }
                    358 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 350)
                    }
                    359 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 350)
                    }
                    360 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 350)
                    }
                    361 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 350)
                    }
                    362 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 350)
                    }
                    363 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 350)
                    }
                    364 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 350)
                    }
                    365 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 350)
                    }
                    366 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 350)
                    }
                    367 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 350)
                    }
                    368 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 350)
                    }
                    369 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 350)
                    }
                    370 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 350)
                    }
                    371 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 350)
                    }
                    372 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 350)
                    }
                    373 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 350)
                    }
                    374 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 350)
                    }
                    375 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 350)
                    }
                    376 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 350)
                    }
                    377 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 350)
                    }
                    378 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 350)
                    }
                    379 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 350)
                    }
                    380 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 350)
                    }
                    381 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 350)
                    }
                    382 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 350)
                    }
                    383 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 350)
                    }
                    384 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 350)
                    }
                    385 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 350)
                    }
                    386 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 350)
                    }
                    387 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 350)
                    }
                    388 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 350)
                    }
                    389 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 350)
                    }
                    390 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 350)
                    }
                    391 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 350)
                    }
                    392 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 350)
                    }
                    393 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 350)
                    }
                    394 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 350)
                    }
                    395 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 350)
                    }
                    396 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 350)
                    }
                    397 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 350)
                    }
                    398 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 350)
                    }
                    399 -> {
                        playSound300c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 350)
                    }
                    400 -> playSound400()
                    401 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 350)
                    }
                    402 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 350)
                    }
                    403 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 350)
                    }
                    404 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 350)
                    }
                    405 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 350)
                    }
                    406 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 350)
                    }
                    407 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 350)
                    }
                    408 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 350)
                    }
                    409 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 350)
                    }
                    410 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 350)
                    }
                    411 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 350)
                    }
                    412 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 350)
                    }
                    413 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 350)
                    }
                    414 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 350)
                    }
                    415 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 350)
                    }
                    416 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 350)
                    }
                    417 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 350)
                    }
                    418 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 350)
                    }
                    419 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 350)
                    }
                    420 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 350)
                    }
                    421 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 350)
                    }
                    422 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 350)
                    }
                    423 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 350)
                    }
                    424 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 350)
                    }
                    425 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 350)
                    }
                    426 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 350)
                    }
                    427 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 350)
                    }
                    428 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 350)
                    }
                    429 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 350)
                    }
                    430 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 350)
                    }
                    431 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 350)
                    }
                    432 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 350)
                    }
                    433 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 350)
                    }
                    434 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 350)
                    }
                    435 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 350)
                    }
                    436 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 350)
                    }
                    437 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 350)
                    }
                    438 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 350)
                    }
                    439 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 350)
                    }
                    440 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 350)
                    }
                    441 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 350)
                    }
                    442 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 350)
                    }
                    443 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 350)
                    }
                    444 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 350)
                    }
                    445 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 350)
                    }
                    446 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 350)
                    }
                    447 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 350)
                    }
                    448 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 350)
                    }
                    449 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 350)
                    }
                    450 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 350)
                    }
                    451 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 350)
                    }
                    452 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 350)
                    }
                    453 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 350)
                    }
                    454 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 350)
                    }
                    455 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 350)
                    }
                    456 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 350)
                    }
                    457 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 350)
                    }
                    458 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 350)
                    }
                    459 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 350)
                    }
                    460 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 350)
                    }
                    461 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 350)
                    }
                    462 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 350)
                    }
                    463 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 350)
                    }
                    464 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 350)
                    }
                    465 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 350)
                    }
                    466 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 350)
                    }
                    467 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 350)
                    }
                    468 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 350)
                    }
                    469 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 350)
                    }
                    470 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 350)
                    }
                    471 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 350)
                    }
                    472 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 350)
                    }
                    473 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 350)
                    }
                    474 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 350)
                    }
                    475 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 350)
                    }
                    476 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 350)
                    }
                    477 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 350)
                    }
                    478 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 350)
                    }
                    479 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 350)
                    }
                    480 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 350)
                    }
                    481 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 350)
                    }
                    482 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 350)
                    }
                    483 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 350)
                    }
                    484 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 350)
                    }
                    485 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 350)
                    }
                    486 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 350)
                    }
                    487 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 350)
                    }
                    488 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 350)
                    }
                    489 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 350)
                    }
                    490 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 350)
                    }
                    491 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 350)
                    }
                    492 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 350)
                    }
                    493 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 350)
                    }
                    494 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 350)
                    }
                    495 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 350)
                    }
                    496 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 350)
                    }
                    497 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 350)
                    }
                    498 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 350)
                    }
                    499 -> {
                        playSound400c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 350)
                    }
                    500 -> playSound500()
                    501 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 250)
                    }
                    502 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 250)
                    }
                    503 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 250)
                    }
                    504 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 250)
                    }
                    505 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 250)
                    }
                    506 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 250)
                    }
                    507 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 250)
                    }
                    508 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 250)
                    }
                    509 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 250)
                    }
                    510 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    511 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    512 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    513 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    514 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    515 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    516 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    517 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    518 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    519 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    520 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    521 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    522 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    523 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    524 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    525 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    526 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    527 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    528 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    529 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    530 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    531 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    532 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    533 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    534 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    535 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    536 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    537 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    538 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    539 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    540 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    541 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    542 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    543 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    544 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    545 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    546 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    547 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    548 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    549 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    550 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    551 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    552 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    553 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    554 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    555 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    556 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    557 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    558 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    559 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    560 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 250)
                    }
                    561 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 250)
                    }
                    562 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 250)
                    }
                    563 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 250)
                    }
                    564 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 250)
                    }
                    565 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 250)
                    }
                    566 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 250)
                    }
                    567 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 250)
                    }
                    568 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 250)
                    }
                    569 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 250)
                    }
                    570 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 250)
                    }
                    571 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 250)
                    }
                    572 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 250)
                    }
                    573 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 250)
                    }
                    574 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 250)
                    }
                    575 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 250)
                    }
                    576 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 250)
                    }
                    577 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 250)
                    }
                    578 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 250)
                    }
                    579 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 250)
                    }
                    580 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 250)
                    }
                    581 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 250)
                    }
                    582 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 250)
                    }
                    583 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 250)
                    }
                    584 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 250)
                    }
                    585 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 250)
                    }
                    586 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 250)
                    }
                    587 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 250)
                    }
                    588 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 250)
                    }
                    589 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 250)
                    }
                    590 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 250)
                    }
                    591 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 250)
                    }
                    592 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 250)
                    }
                    593 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 250)
                    }
                    594 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 250)
                    }
                    595 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 250)
                    }
                    596 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 250)
                    }
                    597 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 250)
                    }
                    598 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 250)
                    }
                    599 -> {
                        playSound500c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 250)
                    }
                    600 -> playSound600()
                    601 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 300)
                    }
                    602 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 300)
                    }
                    603 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 300)
                    }
                    604 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 300)
                    }
                    605 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 300)
                    }
                    606 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 300)
                    }
                    607 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 300)
                    }
                    608 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 300)
                    }
                    609 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 300)
                    }
                    610 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    611 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    612 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    613 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    614 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    615 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    616 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    617 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    618 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    619 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    620 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    621 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    622 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    623 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    624 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    625 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    626 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    627 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    628 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    629 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    630 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    631 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    632 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    633 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    634 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    635 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    636 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    637 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    638 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    639 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    640 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    641 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    642 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    643 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    644 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    645 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    646 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    647 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    648 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    649 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    650 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    651 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    652 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    653 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    654 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    655 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    656 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    657 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    658 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    659 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    660 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 250)
                    }
                    661 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 250)
                    }
                    662 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 250)
                    }
                    663 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 250)
                    }
                    664 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 250)
                    }
                    665 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 250)
                    }
                    666 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 250)
                    }
                    667 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 250)
                    }
                    668 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 250)
                    }
                    669 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 250)
                    }
                    670 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 250)
                    }
                    671 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 250)
                    }
                    672 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 250)
                    }
                    673 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 250)
                    }
                    674 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 250)
                    }
                    675 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 250)
                    }
                    676 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 250)
                    }
                    677 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 250)
                    }
                    678 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 250)
                    }
                    679 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 250)
                    }
                    680 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 250)
                    }
                    681 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 250)
                    }
                    682 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 250)
                    }
                    683 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 250)
                    }
                    684 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 250)
                    }
                    685 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 250)
                    }
                    686 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 250)
                    }
                    687 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 250)
                    }
                    688 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 250)
                    }
                    689 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 250)
                    }
                    690 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 250)
                    }
                    691 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 250)
                    }
                    692 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 250)
                    }
                    693 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 250)
                    }
                    694 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 250)
                    }
                    695 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 250)
                    }
                    696 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 250)
                    }
                    697 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 250)
                    }
                    698 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 250)
                    }
                    699 -> {
                        playSound600c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 250)
                    }
                    700 -> playSound700()
                    701 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 250)
                    }
                    702 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 250)
                    }
                    703 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 250)
                    }
                    704 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 250)
                    }
                    705 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 250)
                    }
                    706 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 250)
                    }
                    707 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 250)
                    }
                    708 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 250)
                    }
                    709 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 250)
                    }
                    710 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    711 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    712 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    713 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    714 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    715 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    716 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    717 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    718 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    719 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    720 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    721 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    722 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    723 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    724 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    725 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    726 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    727 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    728 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    729 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    730 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    731 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    732 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    733 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    734 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    735 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    736 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    737 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    738 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    739 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    740 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    741 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    742 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    743 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    744 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    745 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    746 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    747 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    748 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    749 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    750 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    751 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    752 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    753 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    754 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    755 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    756 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    757 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    758 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    759 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    760 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 250)
                    }
                    761 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 250)
                    }
                    762 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 250)
                    }
                    763 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 250)
                    }
                    764 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 250)
                    }
                    765 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 250)
                    }
                    766 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 250)
                    }
                    767 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 250)
                    }
                    768 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 250)
                    }
                    769 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 250)
                    }
                    770 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 250)
                    }
                    771 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 250)
                    }
                    772 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 250)
                    }
                    773 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 250)
                    }
                    774 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 250)
                    }
                    775 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 250)
                    }
                    776 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 250)
                    }
                    777 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 250)
                    }
                    778 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 250)
                    }
                    779 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 250)
                    }
                    780 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 250)
                    }
                    781 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 250)
                    }
                    782 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 250)
                    }
                    783 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 250)
                    }
                    784 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 250)
                    }
                    785 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 250)
                    }
                    786 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 250)
                    }
                    787 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 250)
                    }
                    788 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 250)
                    }
                    789 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 250)
                    }
                    790 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 250)
                    }
                    791 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 250)
                    }
                    792 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 250)
                    }
                    793 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 250)
                    }
                    794 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 250)
                    }
                    795 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 250)
                    }
                    796 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 250)
                    }
                    797 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 250)
                    }
                    798 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 250)
                    }
                    799 -> {
                        playSound700c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 250)
                    }
                    800 -> playSound800()
                    801 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 250)
                    }
                    802 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 250)
                    }
                    803 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 250)
                    }
                    804 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 250)
                    }
                    805 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 250)
                    }
                    806 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 250)
                    }
                    807 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 250)
                    }
                    808 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 250)
                    }
                    809 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 250)
                    }
                    810 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    811 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    812 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    813 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    814 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    815 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    816 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    817 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    818 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    819 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    820 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    821 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    822 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    823 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    824 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    825 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    826 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    827 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    828 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    829 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    830 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    831 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    832 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    833 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    834 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    835 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    836 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    837 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    838 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    839 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    840 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    841 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    842 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    843 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    844 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    845 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    846 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    847 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    848 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    849 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    850 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    851 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    852 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    853 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    854 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    855 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    856 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    857 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    858 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    859 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    860 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 250)
                    }
                    861 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 250)
                    }
                    862 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 250)
                    }
                    863 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 250)
                    }
                    864 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 250)
                    }
                    865 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 250)
                    }
                    866 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 250)
                    }
                    867 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 250)
                    }
                    868 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 250)
                    }
                    869 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 250)
                    }
                    870 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 250)
                    }
                    871 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 250)
                    }
                    872 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 250)
                    }
                    873 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 250)
                    }
                    874 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 250)
                    }
                    875 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 250)
                    }
                    876 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 250)
                    }
                    877 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 250)
                    }
                    878 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 250)
                    }
                    879 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 250)
                    }
                    880 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 250)
                    }
                    881 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 250)
                    }
                    882 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 250)
                    }
                    883 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 250)
                    }
                    884 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 250)
                    }
                    885 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 250)
                    }
                    886 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 250)
                    }
                    887 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 250)
                    }
                    888 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 250)
                    }
                    889 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 250)
                    }
                    890 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 250)
                    }
                    891 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 250)
                    }
                    892 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 250)
                    }
                    893 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 250)
                    }
                    894 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 250)
                    }
                    895 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 250)
                    }
                    896 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 250)
                    }
                    897 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 250)
                    }
                    898 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 250)
                    }
                    899 -> {
                        playSound800c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 250)
                    }
                    900 -> playSound900()
                    901 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound1()
                        }, 250)
                    }
                    902 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound2()
                        }, 250)
                    }
                    903 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound3()
                        }, 250)
                    }
                    904 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound4()
                        }, 250)
                    }
                    905 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound5()
                        }, 250)
                    }
                    906 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound6()
                        }, 250)
                    }
                    907 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound7()
                        }, 250)
                    }
                    908 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound8()
                        }, 250)
                    }
                    909 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound9()
                        }, 250)
                    }
                    910 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound10()
                        }, 250)
                    }
                    911 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound11()
                        }, 250)
                    }
                    912 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound12()
                        }, 250)
                    }
                    913 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound13()
                        }, 250)
                    }
                    914 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound14()
                        }, 250)
                    }
                    915 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound15()
                        }, 250)
                    }
                    916 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound16()
                        }, 250)
                    }
                    917 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound17()
                        }, 250)
                    }
                    918 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound18()
                        }, 250)
                    }
                    919 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound19()
                        }, 250)
                    }
                    920 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound20()
                        }, 250)
                    }
                    921 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound21()
                        }, 250)
                    }
                    922 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound22()
                        }, 250)
                    }
                    923 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound23()
                        }, 250)
                    }
                    924 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound24()
                        }, 250)
                    }
                    925 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound25()
                        }, 250)
                    }
                    926 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound26()
                        }, 250)
                    }
                    927 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound27()
                        }, 250)
                    }
                    928 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound28()
                        }, 250)
                    }
                    929 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound29()
                        }, 250)
                    }
                    930 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound30()
                        }, 250)
                    }
                    931 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound31()
                        }, 250)
                    }
                    932 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound32()
                        }, 250)
                    }
                    933 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound33()
                        }, 250)
                    }
                    934 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound34()
                        }, 250)
                    }
                    935 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound35()
                        }, 250)
                    }
                    936 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound36()
                        }, 250)
                    }
                    937 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound37()
                        }, 250)
                    }
                    938 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound38()
                        }, 250)
                    }
                    939 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound39()
                        }, 250)
                    }
                    940 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound40()
                        }, 250)
                    }
                    941 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound41()
                        }, 250)
                    }
                    942 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound42()
                        }, 250)
                    }
                    943 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound43()
                        }, 250)
                    }
                    944 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound44()
                        }, 250)
                    }
                    945 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound45()
                        }, 250)
                    }
                    946 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound46()
                        }, 250)
                    }
                    947 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound47()
                        }, 250)
                    }
                    948 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound48()
                        }, 250)
                    }
                    949 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound49()
                        }, 250)
                    }
                    950 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound50()
                        }, 250)
                    }
                    951 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound51()
                        }, 250)
                    }
                    952 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound52()
                        }, 250)
                    }
                    953 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound53()
                        }, 250)
                    }
                    954 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound54()
                        }, 250)
                    }
                    955 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound55()
                        }, 250)
                    }
                    956 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound56()
                        }, 250)
                    }
                    957 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound57()
                        }, 250)
                    }
                    958 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound58()
                        }, 250)
                    }
                    959 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound59()
                        }, 250)
                    }
                    960 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound60()
                        }, 250)
                    }
                    961 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound61()
                        }, 250)
                    }
                    962 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound62()
                        }, 250)
                    }
                    963 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound63()
                        }, 250)
                    }
                    964 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound64()
                        }, 250)
                    }
                    965 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound65()
                        }, 250)
                    }
                    966 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound66()
                        }, 250)
                    }
                    967 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound67()
                        }, 250)
                    }
                    968 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound68()
                        }, 250)
                    }
                    969 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound69()
                        }, 250)
                    }
                    970 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound70()
                        }, 250)
                    }
                    971 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound71()
                        }, 250)
                    }
                    972 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound72()
                        }, 250)
                    }
                    973 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound73()
                        }, 250)
                    }
                    974 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound74()
                        }, 250)
                    }
                    975 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound75()
                        }, 250)
                    }
                    976 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound76()
                        }, 250)
                    }
                    977 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound77()
                        }, 250)
                    }
                    978 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound78()
                        }, 250)
                    }
                    979 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound79()
                        }, 250)
                    }
                    980 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound80()
                        }, 250)
                    }
                    981 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound81()
                        }, 250)
                    }
                    982 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound82()
                        }, 250)
                    }
                    983 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound83()
                        }, 250)
                    }
                    984 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound84()
                        }, 250)
                    }
                    985 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound85()
                        }, 250)
                    }
                    986 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound86()
                        }, 250)
                    }
                    987 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound87()
                        }, 250)
                    }
                    988 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound88()
                        }, 250)
                    }
                    989 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound89()
                        }, 250)
                    }
                    990 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound90()
                        }, 250)
                    }
                    991 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound91()
                        }, 250)
                    }
                    992 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound92()
                        }, 250)
                    }
                    993 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound93()
                        }, 250)
                    }
                    994 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound94()
                        }, 250)
                    }
                    995 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound95()
                        }, 250)
                    }
                    996 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound96()
                        }, 250)
                    }
                    997 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound97()
                        }, 250)
                    }
                    998 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound98()
                        }, 250)
                    }
                    999 -> {
                        playSound900c()
                        Handler(Looper.getMainLooper()).postDelayed({
                            playSound99()
                        }, 250)
                    }
                    1000 -> playSound1000()

                    // 1000 이후에는 음성 없음
                }
            }
        }
    }


    override fun onResume() {
        Log.d(tag, "MainActivity - onResume() called")
        mysensorManager.registerListener(
            this,
            mysensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY),
            SensorManager.SENSOR_DELAY_NORMAL
        )
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "MainActivity - onPause() called")
        mysensorManager.unregisterListener(this)
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        // soundPool.release()  // Stop 되면 soundPool 메모리 해제
    }
}