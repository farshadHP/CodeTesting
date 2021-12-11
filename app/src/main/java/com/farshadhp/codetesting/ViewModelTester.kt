package com.farshadhp.codetesting

import org.junit.Assert;
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import java.util.*

class ViewModelTester (private var view : ViewModelStoreOwner){
    private var viewModel : MyViewModel = ViewModelProvider(view).get(MyViewModel::class.java)
    private var localesArr = Locale.getAvailableLocales()
    // functions for Date and Time
    fun getDateTime_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var date = viewModel.getDateTime()
        Assert.assertEquals("zaterdag 11 december 2021",date)
    }
    fun getDateTime_UsLocale(){
        Locale.setDefault(Locale.US)
        var date = viewModel.getDateTime()
        Assert.assertEquals("Saturday, December 11, 2021",date)
    }
    fun getDateTime_UkLocale(){
        Locale.setDefault(Locale.UK)
        var date = viewModel.getDateTime()
        Assert.assertEquals("Saturday, 11 December 2021",date)
    }
    // functions for Currency
    fun getCurrency_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var currency = viewModel.getCurrency()
        Assert.assertEquals("€ 500.000,00",currency)
    }
    fun getCurrency_UsLocale(){
        Locale.setDefault(Locale.US)
        var currency = viewModel.getCurrency()
        Assert.assertEquals("\$500,000.00",currency)
    }
    fun getCurrency_UkLocale(){
        Locale.setDefault(Locale.UK)
        var currency = viewModel.getCurrency()
        Assert.assertEquals("£500,000.00",currency)
    }
    // functions for the Float Num
    fun getFloatNum_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var num = viewModel.getFloatNum()
        Assert.assertEquals("3,145",num)
    }
    fun getFloatNum_UsLocale(){
        Locale.setDefault(Locale.US)
        var num = viewModel.getFloatNum()
        Assert.assertEquals("3.145",num)
    }
    fun getFloatNum_UkLocale(){
        Locale.setDefault(Locale.UK)
        var num = viewModel.getFloatNum()
        Assert.assertEquals("3.145",num)
    }



}