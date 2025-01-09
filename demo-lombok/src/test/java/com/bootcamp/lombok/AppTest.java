package com.bootcamp.lombok;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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
    }

}
