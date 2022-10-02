package com.furkanbalci.week6

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sayacımızı oluşturduk.
        var counter = 0

        //Sonsuz bir döngü başlatıyoruz.
        while (true) {

            //Her döngüde counter'ı 1 arttırıyoruz.
            counter++

            //Ekrana yazdırıyoruz.
            println("Counter: $counter")

            //Yeni bir scope oluşturuyoruz.
            CoroutineScope(Dispatchers.IO).launch {

                //Çağırdığımız fonksiyon bizi 1 saniye bekletiyor.
                val answer = doNetworkCall()

                //Ekrana yazdırıyoruz.
                withContext(Dispatchers.Main) {
                    Log.v("PATIKA", answer)
                }
            }

            //Eğer counter 10000'e ulaştıysa döngüyü kırıyoruz.
            if (counter == 10000) {
                break
            }
        }
    }

    //Bu fonksiyon bizi 1 saniye bekletiyor ve geriye "Network Call" döndürüyor.
    private suspend fun doNetworkCall(): String {
        delay(1000)
        return "Network Call"
    }
}