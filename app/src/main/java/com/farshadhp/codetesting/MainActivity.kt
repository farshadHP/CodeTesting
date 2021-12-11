package com.farshadhp.codetesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vTest = ViewModelTester(this)
        vTest.getDateTime_NetherslandsLocale()
        vTest.getDateTime_UsLocale()
        vTest.getDateTime_UkLocale()
        vTest.getCurrency_NetherslandsLocale()
        vTest.getCurrency_UsLocale()
        vTest.getCurrency_UkLocale()
        vTest.getFloatNum_NetherslandsLocale()
        vTest.getFloatNum_UsLocale()
        vTest.getFloatNum_UkLocale()
    }
}