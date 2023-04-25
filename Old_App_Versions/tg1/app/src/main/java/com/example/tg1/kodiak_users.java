package com.example.tg1;

public class kodiak_users {

    user[] kc;

    public kodiak_users() {

        user joe = new user(1, "Joe Godinez", "joegodinez", "password1");
        user sophie = new user(2, "Sophie Kummer", "sophiekummer", "password2");
        user mary = new user(3, "Mary Wisell", "marywisell", "password3");
        user jeffrey = new user(4, "Jeffrey Parent", "jeffreyparent", "password4");
        user darien = new user(5, "Darien Orethun", "darienorethun", "password5");

        this.kc = new user[]{joe, sophie, mary, jeffrey, darien};
    }
}