package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        char arr[]=newPassword.toCharArray();
        if(oldPassword == this.password){
            if(newPassword.length()>=7){
           if(newPassword.length()>=7){
           for(char i: arr){
           if(i>='A' && i<='Z')upper=true;
           
           if(i>='a' && i<='z')lower=true;
           
           if(i>='0' && i<='9')digit=true;
           
           if (!Character.isDigit(i)
                && !Character.isLetter(i)
                && !Character.isWhitespace(i))special=true;
               
           
           }
           
           }
            }
           }
        if(upper && lower && digit && special){
        this.password=newPassword;
        // System.out.println("pass changed");
        }
        // System.out.println(upper+" "+lower+" "+digit+" "+special);  
          
           
        
    }
}
