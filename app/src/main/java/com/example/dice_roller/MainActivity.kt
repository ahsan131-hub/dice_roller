package com.example.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollBtn)
        val dice=Dice(6);
        rollButton.setOnClickListener{
            //finde text view in page and set the random number from 1 to 6
            val textView: TextView=findViewById(R.id.diceNum)
            val image: ImageView =findViewById(R.id.diceImage)
            val result:Int=dice.roll()
            textView.text=dice.luckyNumber.toString()

            //set image
            when(result){
                1->image.setImageResource(R.drawable.dice_1)
                2->image.setImageResource(R.drawable.dice_2)
                3->image.setImageResource(R.drawable.dice_3)
                4->image.setImageResource(R.drawable.dice_4)
                5->image.setImageResource(R.drawable.dice_5)
                6->image.setImageResource(R.drawable.dice_6)
            }





            if(result==dice.luckyNumber){
                val toast= Toast.makeText(this,"You Win...!",Toast.LENGTH_SHORT)
                toast.show()
            }else{
                val toast= Toast.makeText(this,"You Lost..!",Toast.LENGTH_SHORT)
                toast.show()
            }


        }



    }
}