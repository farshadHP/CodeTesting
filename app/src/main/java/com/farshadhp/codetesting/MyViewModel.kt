package com.farshadhp.codetesting

import androidx.lifecycle.ViewModel
import java.text.DateFormat.MEDIUM
import java.time.chrono.IsoChronology
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.format.FormatStyle
import java.util.*

class MyViewModel: ViewModel()  {
    fun getDateTime() : DateTimeFormatter{
        DateTimeFormatterBuilder.getLocalizedDateTimePattern(
            FormatStyle.MEDIUM,
            null,
            IsoChronology.INSTANCE,
            Locale.getDefault()
        )

        return DateTimeFormatter.ofPattern(MEDIUM.toString())
    }
}