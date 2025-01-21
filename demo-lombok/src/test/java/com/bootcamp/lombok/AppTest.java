package com.bootcamp.lombok;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */

 // 1. Junit test cases is good regression test, after program change.
 // 2. TDD.  Write test case first, let the main code fail.
class AppTest 
{
    @Test
    void testPerson() {
        Person person = new Person("");
        person.setName("Vincent");
        // Expected result, Autal
        Assertions.assertEquals("Vincent", person.getName());
    }
    @Test
    void testcalender(){
        Assertions.assertEquals(3, Calender.sumup(1,2));
        Assertions.assertEquals(103, Calender.sumup(51,52));     
        Assertions.assertEquals(12, Calender.sumup(10,2));  

        // hamcrest
        assertThat(Calender.sumup(1,2), is(equalTo(3)));
        assertThat(Calender.sumup(1,2), is(not(equalTo(3))));
    }

    @Test
    void testArray(){
        List<String>  myList = Arrays.asList("apple", "banana", "Cherry");
        assertThat(myList, hasItem("banana"));
        assertThat(myList, not(hasItem("orange")));
    }
   

}
