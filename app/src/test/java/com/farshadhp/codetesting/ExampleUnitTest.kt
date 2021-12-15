package com.farshadhp.codetesting


import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.time.LocalDate
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {

    private var localesArr = Locale.getAvailableLocales()
    var service: DateTools = mockk()
    lateinit var viewModel : MyViewModel
    
    @Before fun initial(){
        every { service.now()} returns LocalDate.of(2021,12,12)
        viewModel = MyViewModel(service.now())
    }

    // functions for Date and Time
    @Test
    fun getDateTime_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var date = viewModel.getDateTime()
        Assert.assertEquals("niedziela, 12 grudnia 2021",date)
    }

    @Test
    fun getDateTime_UsLocale(){
        Locale.setDefault(Locale.US)
        var date = viewModel.getDateTime()
        Assert.assertEquals("Sunday, December 12, 2021",date)
    }
    @Test
    fun getDateTime_UkLocale(){
        Locale.setDefault(Locale.UK)
        var date = viewModel.getDateTime()
        Assert.assertEquals("Sunday, 12 December 2021",date)
    }
    // functions for Currency
    @Test
    fun getCurrency_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var currency = viewModel.getCurrency()
        Assert.assertEquals("500 000,00 ¤",currency)
    }
    @Test
    fun getCurrency_UsLocale(){
        Locale.setDefault(Locale.US)
        var currency = viewModel.getCurrency()
        Assert.assertEquals("\$500,000.00",currency)
    }
    @Test
    fun getCurrency_UkLocale(){
        Locale.setDefault(Locale.UK)
        var currency = viewModel.getCurrency()
        Assert.assertEquals("£500,000.00",currency)
    }
    // functions for the Float Num
    @Test
    fun getFloatNum_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        var num = viewModel.getFloatNum()
        Assert.assertEquals("3,145",num)
    }
    @Test
    fun getFloatNum_UsLocale(){
        Locale.setDefault(Locale.US)
        var num = viewModel.getFloatNum()
        Assert.assertEquals("3.145",num)
    }
    @Test
    fun getFloatNum_UkLocale(){
        Locale.setDefault(Locale.UK)
        var num = viewModel.getFloatNum()
        Assert.assertEquals("3.145",num)
    }


}