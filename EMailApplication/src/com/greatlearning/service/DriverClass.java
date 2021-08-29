package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args)
    {
        Employee employee = new Employee("Akhil", "Singla");
        System.out.println("Please enter the department from the following :- \n" +
                "1. Technical\n" +
                "2. Admin\n" +
                "3. Human Resource\n" +
                "4. Legal\n");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String email;
        char[] password;
        CredentialService credentialService = new CredentialService();

        switch (input)
        {
            case "1":
            {
                email = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
                password = credentialService.generatePassword();
                credentialService.showCredentials(employee.getFirstName(), email, password);
                break;
            }
            case "2":
            {
                email = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
                password = credentialService.generatePassword();
                credentialService.showCredentials(employee.getFirstName(), email, password);
                break;
            }
            case "3":
            {
                email = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
                password = credentialService.generatePassword();
                credentialService.showCredentials(employee.getFirstName(), email, password);
                break;
            }
            case "4":
            {
                email = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
                password = credentialService.generatePassword();
                credentialService.showCredentials(employee.getFirstName(), email, password);
                break;
            }
            default:
            {
                System.out.println("Invalid option, quitting");
            }
        }
    }
}
