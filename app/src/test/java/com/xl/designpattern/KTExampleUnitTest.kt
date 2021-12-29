package com.xl.designpattern

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class KTExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val t = com.xl.designpattern.agent.Test()
        t.message2 = "测试测试"
        println(t.message2)
    }
}