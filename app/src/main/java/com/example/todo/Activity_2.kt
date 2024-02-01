package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.todo.databinding.ConstraintLayoutBinding

class Activity_2 : AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        pricitani na kliknuti
        var count = 0
        binding.countBtn.setOnClickListener{
            count++
            binding.textView.text = "You clicked $count times!"
        }

        binding.buttonEditText.setOnClickListener{
            countTwoNumbers()
        }
    }

    fun countTwoNumbers(){
        var finalCount = 0
        finalCount = binding.editText1.text.toString().toInt() + binding.editText2.text.toString().toInt()

        binding.textViewResult.text = "$finalCount"
    }

}