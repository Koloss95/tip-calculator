package com.example.tiptime
import java.text.NumberFormat
import org.junit.Test
import org.junit.Assert.assertEquals

class TipCalculatorTests {
    @Test
    fun ccalculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        var expectedTip = NumberFormat.getCurrencyInstance().format(2)
        var actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

}