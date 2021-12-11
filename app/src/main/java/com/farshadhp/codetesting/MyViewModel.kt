package com.farshadhp.codetesting


import androidx.lifecycle.ViewModel
import java.text.DateFormat
import java.text.NumberFormat
import java.util.*

class MyViewModel: ViewModel()  {
    private var money = 500000
    private var num = 3.145
    fun getDateTime() : String {
        val currentDate = Date()
        val dateFormat: DateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault())
        return dateFormat.format(currentDate)
    }
    fun getCurrency() : String {
        val CurrencyFormat: NumberFormat = NumberFormat.getCurrencyInstance(Locale.getDefault())
        return CurrencyFormat.format(money)
    }
    fun getFloatNum() : String {
        val NumberFormat = NumberFormat.getInstance(Locale.getDefault())
        return NumberFormat.format(num)
    }

}