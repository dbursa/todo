package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//         inicializace bindingView nutne udelat jeste pred setContentView
//         inflate metoda - When you design a layout for your Android app using XML, the inflate() method is used to convert that XML layout into the corresponding View objects in your app's memory. This allows you to dynamically create and modify the user interface based on predefined XML layouts.
        binding = ActivityMainBinding.inflate(layoutInflater)

//         R jako resources folder
//         pokud bychom nepouzivali binding, bude tam cesta ke konkretnimu view tzn treba setContentView(R.layout.main_activity)
        setContentView(binding.root)

//      findViewById - Button je typ view a v zavorkach davam id buttonu.
//    Id buttonu mam v activity_main jako android:id="@+id/ClickBtn". Tzn diky @+id muzu volat id tak, jak volam nize
//    Nicmene toto se uz spis nepouziva, misto toho se pouziva viewBinding
        val clickBtnValue = findViewById<Button>(R.id.clickBtn)

//         lepsi je to volat pred viewBinding
//         binding.clickBtn

        binding.clickBtn.setOnClickListener {
//            toString proto, ze text je "editable"
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()

//          Zobrazi se hodnoty v Logcatu
            Log.d("MainActivity", "Moje prvni jmeno je $firstName a prijmeni $lastName")
        }

        binding.clickNextActivity.setOnClickListener{
            val intent = Intent(this, Activity_2::class.java)

            startActivity(intent)
        }
    }
}