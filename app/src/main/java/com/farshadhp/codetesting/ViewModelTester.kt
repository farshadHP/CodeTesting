package com.farshadhp.codetesting

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

import org.junit.Assert
import java.util.*

class ViewModelTester (private var view : ViewModelStoreOwner){
    private var viewModel : MyViewModel = ViewModelProvider(view).get(MyViewModel::class.java)
    private var localesArr = Locale.getAvailableLocales()

    fun getDateTime_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var date = viewModel.getDateTime()
        Assert.assertEquals("11/12/2021",date)
    }
    fun getDateTime_UsLocale(){
        Locale.setDefault(Locale.US)
    }
    fun getDateTime_UkLocale(){
        Locale.setDefault(Locale.UK)
    }

}