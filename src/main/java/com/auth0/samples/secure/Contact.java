package com.auth0.samples.secure;


public class Contact {
    private final String name;
    private final String phone;
    
    private Contact(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    static Contact build(String name, String phone)
    {
        return new Contact(name, phone);
    }
}
