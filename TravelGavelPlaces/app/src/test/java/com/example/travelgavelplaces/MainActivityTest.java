package com.example.travelgavelplaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public void availability() {
        boolean activity = new MainActivity().isServicesOK();
        assertTrue(activity);
    }
    //TEST WHETHER GOOGLE PLAY SERVICES IS WORKING
    //PASSED TEST MEANS GOOGLE PLAY SERVICES IS OK
    //FAILED TEST MEANS IT IS NOT WORKING AND SOMETHING IS WRONG
}
