package com.xl.designpattern;

import org.junit.Test;

import static org.junit.Assert.*;

import com.xl.designpattern.chain.Director;
import com.xl.designpattern.chain.GroupLeader;
import com.xl.designpattern.chain.Leader;
import com.xl.designpattern.chain.Manager;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Leader groupLeader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();
        groupLeader.setNextLeader(director);
        director.setNextLeader(manager);

        groupLeader.handleRequest(5000);
        groupLeader.handleRequest(9000);
        groupLeader.handleRequest(12000);
        groupLeader.handleRequest(30000);

    }
}