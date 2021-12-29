package com.xl.designpattern.agent

import java.sql.DriverManager.println
import kotlin.reflect.KProperty


class Delegate : Subject {
    var value: String = ""
    override fun buy() {
        println("I can buy it because I live abroad.")
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        "$thisRef, thank you for delegating '${property.name}' to me!"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) =
        println("$value has been assigned to '${property.name}' in $thisRef.")


}