package org.example;

public class ValidateInput {
    public static boolean validateInput(String input){
        String pattern = "[A-Z][a-z0-9]{2,}[!@#$%^&*()_=+{},.]{1}[0-9]{6,}";
        boolean check = input.matches(pattern);
        if(check){
            System.out.println("Entered Input is valid");
        }
        else{
            System.out.println("Entered input is not valid");
        }
        return check;
    }
}

