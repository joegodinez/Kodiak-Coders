package com.example.tg1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class create_account_test {

    @Test
    public void create_account_testing() {

        //new example user
        int userid_1 = 1;
        String name1 = "name1";
        String user1 = "user1";
        String password1 = "password1";

        String user2 = "";

        String password3 = "";

        String name4 = "";

        String password_a = "a";
        String password_b = "a";

        //if all fields of a user contain some value
        assertTrue(userid_1 > 0
                &&!(name1.isEmpty())
                && !(user1.isEmpty())
                && !(password1.isEmpty()));

        //checking email is nonempty
        assertFalse(user2.isEmpty());

        //also goes with valid password since our only requirements is it must be nonempty
        assertFalse(password3.isEmpty());

        //checking name is nonempty
        assertFalse(name4.isEmpty());

        //checking both entered passwords match
        assertEquals(password_a, password_b);
    }

}
