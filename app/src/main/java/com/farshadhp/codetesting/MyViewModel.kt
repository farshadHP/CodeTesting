package com.farshadhp.codetesting


import androidx.lifecycle.ViewModel
import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofLocalizedDate
import java.time.format.FormatStyle
import java.util.*

class MyViewModel(var dateTools : DateTools): ViewModel()  {
    private var money = 500000
    private var num = 3.145
    fun getDateTime() : String {
        val formatter: DateTimeFormatter = ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault())
        return formatter.format(dateTools.now())
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