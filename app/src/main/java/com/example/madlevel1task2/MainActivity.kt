package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitBTN.setOnClickListener { checkAnswer() }
    }

    /**
     *  check the answers provided
     */
    private fun checkAnswer(){
       //  The correct answers to the questions
        val answer1 = "T"
        val answer2 = "F"
        val answer3 = "F"
        val answer4 = "F"

        var correct =0

        if (answer1 == binding.inputAnswer1.text.toString().toUpperCase()){
            correct++
        }
        if (answer2 == binding.inputAnswer2.text.toString().toUpperCase()) {
            correct++
        }
        if (answer3 == binding.inputAnswer3.text.toString().toUpperCase()) {
            correct++
        }
        if (answer4 == binding.inputAnswer4.text.toString().toUpperCase()) {
            correct++
        }

        //Create toast message
        if (correct == 4){
            Toast.makeText(this, getString(R.string.allGood), Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,getString(R.string.amountGood, correct), Toast.LENGTH_SHORT).show()
    }

}
}