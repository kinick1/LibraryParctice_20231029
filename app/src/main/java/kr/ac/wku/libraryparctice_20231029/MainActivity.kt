package kr.ac.wku.libraryparctice_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.libraryparctice_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.imgPro.setOnClickListener {

//            이미지뷰도 클릭 이벤트 지원

//            ViewPhotoActivity로 이동

            val myIntent = Intent( this, ViewPhotoActivity::class.java )
            startActivity(myIntent)

        }
    }
}