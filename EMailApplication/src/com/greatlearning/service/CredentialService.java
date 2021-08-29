package com.greatlearning.service;

import java.util.Locale;
import java.util.Random;

public class CredentialService
{
    public char[] generatePassword()
    {
        String captialLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String specialCharacters = "!@#$%^&*_+-=.<>?";

        Random random = new Random();
        char[] password = new char[8];
        int count =0;
        for(int i=0; i<2; i++)
        {
            password[count++] = captialLetters.charAt(random.nextInt(captialLetters.length()));
            password[count++] = smallLetters.charAt(random.nextInt(smallLetters.length()));
            password[count++] = number.charAt(random.nextInt(number.length()));
            password[count++] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        }

        return password;

    }

    public String generateEmailAddress(String firstName, String lastName, String department)
    {
        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";
    }

    public void showCredentials(String firstName, String email, char[] password)
    {
        System.out.println("Dear " + firstName+ " your generated credentials are as follows \nEmail --> "+ email + "\nPassword --> " + String.valueOf(password));
    }
}
