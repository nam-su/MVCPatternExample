package com.example.designpattern_mvc_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var model: Model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 모델 객체 초기화
        model = Model()

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        // 버튼 입력을 받았을 때
        button.setOnClickListener {

            // 텍스트 뷰에 model의 randomName() 메서드값을 할당해준다.
            textView.text = model.randomName()

        }

    }

}