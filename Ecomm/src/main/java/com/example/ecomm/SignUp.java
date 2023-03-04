package com.example.ecomm;

import java.sql.ResultSet;
import static com.example.ecomm.Login.getEncryptedPassword;

public class SignUp {

    public static boolean customerSignUp(String userName, String userEmail, Integer mobileNumber, String password, String address){

        try {
            String encryptedPassword = getEncryptedPassword(password);
            String register = "INSERT INTO customer(name, email, mobile, password, address) VALUES('" + userName + "', '" + userEmail + "', " + mobileNumber + ", '" + encryptedPassword + "', '" + address + "')";
            databaseConnection dbConn = new databaseConnection();
            return dbConn.insertUpdate(register);
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
