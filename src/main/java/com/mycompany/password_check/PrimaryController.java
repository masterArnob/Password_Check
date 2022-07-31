package com.mycompany.password_check;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{

     @FXML
    private Button Check;
    @FXML
    private Label Result;
    @FXML
    private TextField UserPassword;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doCheck(ActionEvent event) 
    {
     
        String pass = UserPassword.getText();
        
        int count1=0,count2=0;
        boolean s = false;
        
        //userPassword = userPassword.toLowerCase();
        
        for(int i=0; i<pass.length(); i++)
        {
            if(pass.charAt(i)>'a' && pass.charAt(i)<='z')
             {
               count2++;
             }
            else if(pass.charAt(i)>'A' && pass.charAt(i)<='Z')
             {
               count1++;
             }
            else if(pass.charAt(i)>'@' || pass.charAt(i)>'#' || pass.charAt(i)>'_' || pass.charAt(i)>'$')
            {
                s = true;
            }
            
        }
        
        if(pass.length()>8 && count2>=2 && count1>=2 && s==true)
        {
            Result.setText("Valid Password");
        }
        else
        {
            Result.setText("Invalid Password");
        }
       
    }

    
}
