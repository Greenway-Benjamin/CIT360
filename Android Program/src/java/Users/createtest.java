/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Benjamin Greenway
 */
public class createtest {   
    
    public static void main (String[] args) throws MalformedURLException, IOException, InterruptedException {
        
        String username = "glue";
        String password = "pants";
        String signupurl = "http://192.168.0.87:8080/FEHTracker/SignUpServlet";
        
        
       
            username = URLEncoder.encode(username, "UTF-8");
        
        
            password = URLEncoder.encode(password, "UTF-8");
        
        
        System.out.println(username);
        System.out.println(password);


        URL url = new URL(signupurl);
        
        URLConnection connection = url.openConnection();
        
        connection.setDoOutput(true);
        
        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        

        
            out.write("username=" + username + "&password=" + password);          
        
        
            out.close();           
        
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            connection.getInputStream()));
        
        String decodedString;
        
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
            
    }
        
    }
}
    

