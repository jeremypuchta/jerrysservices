package com.jeremypuchta.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
