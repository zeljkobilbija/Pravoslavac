package com.interfacemockup.pravoslavac

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var listFood = arrayListOf("Dorucak", "Rucak", "Vecera", "Uzina", "Aperitiv")
    var listaIkona = arrayListOf("ikona_3.png", "ikona_4.png", "ikona_6.png", "ikona_9.png")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postLabel.text = "     Dobro jutro jazzeri     "


        buttonDown.setOnClickListener {
            //var randopm = java.util.Random()
/*            val randomFoodIndex = randopm.nextInt(listFood.count())
            val txt = listFood[randomFoodIndex]

            postLabel.text = "     $txt     "*/

            var randopm = java.util.Random().nextInt(10) + 1
            //changeImg()
            changeImageWithRandomNum(randopm)
        }

    }

/*    fun select_food_btn_pressed(){
        changeImg()
    }*/


/*    fun select_food_btn_pressed(){
        var randomInt = java.util.Random().nextInt(9) + 1
        var drawableResource = when(randomInt){
            1 -> R.drawable.ikona_1
            2 -> R.drawable.ikona_2
            3 -> R.drawable.ikona_1
            4 -> R.drawable.ikona_2
            5 -> R.drawable.ikona_1
            6 -> R.drawable.ikona_2
            7 -> R.drawable.ikona_1
            8 -> R.drawable.ikona_2
            else -> R.drawable.ikona_9
        }

        imageView.setImageResource(drawableResource)


    }*/


    fun changeImg() {
        var randomInt = java.util.Random().nextInt(9) + 1
        var drawableResource = when (randomInt) {
            1 -> R.drawable.ikona_1
            2 -> R.drawable.ikona_2
            3 -> R.drawable.ikona_3
            4 -> R.drawable.ikona_4
            5 -> R.drawable.ikona_5
            6 -> R.drawable.ikona_6
            7 -> R.drawable.ikona_7
            8 -> R.drawable.ikona_8
            9 -> R.drawable.ikona_9
            10 -> R.drawable.ikona_10
            else -> R.drawable.ikona_11
        }

        imageView.setImageResource(drawableResource)
    }


    fun changeImageWithRandomNum(randomNummer: Int) {
        var drawableResource = when (randomNummer) {
            1 -> R.drawable.ikona_1
            2 -> R.drawable.ikona_2
            3 -> R.drawable.ikona_3
            4 -> R.drawable.ikona_4
            5 -> R.drawable.ikona_5
            6 -> R.drawable.ikona_6
            7 -> R.drawable.ikona_7
            8 -> R.drawable.ikona_8
            9 -> R.drawable.ikona_9
            10 -> R.drawable.ikona_10
            else -> R.drawable.ikona_11
        }

        imageView.setImageResource(drawableResource)
    }





}
