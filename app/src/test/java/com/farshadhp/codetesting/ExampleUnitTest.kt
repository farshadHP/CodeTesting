package com.farshadhp.codetesting


import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
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


    @MockK
    lateinit var service: DateTools
    private var viewModel = MyViewModel()
    @Before
    fun setUp() = MockKAnnotations.init(this)
    // functions for Date and Time
    @Test
    fun getDateTime_NetherslandsLocale(){
        Locale.setDefault(localesArr[516]/*its Netherlands*/)
        //val service = mockk<DateTools>()
        every { service.now()} returns LocalDate.of(2021,12,12)
        var date = viewModel.getDateTime(service.now())
        Assert.assertEquals("niedziela, 12 grudnia 2021",date)
    }

    @Test
    fun getDateTime_UsLocale(){
        every { service.now()} returns LocalDate.of(2021,12,12)
        Locale.setDefault(Locale.US)
        var date = viewModel.getDateTime(service.now())
        Assert.assertEquals("Sunday, December 12, 2021",date)
    }
    @Test
    fun getDateTime_UkLocale(){
        every { service.now()} returns LocalDate.of(2021,12,12)
        Locale.setDefault(Locale.UK)
        var date = viewModel.getDateTime(service.now())
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