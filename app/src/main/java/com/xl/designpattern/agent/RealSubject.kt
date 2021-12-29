package com.xl.designpattern.agent

class RealSubject : Subject {
    private val delegate: Subject = Delegate()
    val globalDelegate = Delegate()
    override fun buy() {
        delegate.buy()
    }
}

class Test : Subject by Delegate() {
    val delegate = Delegate()


    var message2: String by Delegate()
}

