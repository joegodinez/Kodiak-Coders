package com.example.tg1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class login_test {

    @Test
    public void login_testing() {

        user user_1 = new user(1, "John Doe", "username1", "password1");
        String database_user1 = "username1";
        String database_password1 = "password1";

        String entered_user = "";
        String entered_password = "";

        boolean user_login_state_good = true;
        boolean user_login_state_bad = false;

        boolean system_transfer_bad = false;

        boolean system_redirect_bad = false;

        //checking username and password match stored information
        assertTrue(user_1.email.equals(database_user1)
                && user_1.password.equals(database_password1));

        //checking entered fields are nonempty
        assertFalse(entered_user.isEmpty());
        assertFalse(entered_password.isEmpty());

        //if user successfully logged in
        assertTrue(user_login_state_good);

        //if user did not successfully log in
        assertFalse(user_login_state_bad);

        //if system cannot transfer
        assertFalse(system_transfer_bad);

        //if system fails to redirect
        assertFalse(system_redirect_bad);


    }
}
