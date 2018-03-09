/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLHTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author Benjamin Greenway
 */
public class ConnectToWebsite {
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        //Set choose a URL and creat a new URL object for it
        String url = "https://www.google.com";
        URL webpage = new URL(url);
        
        //Open the URL connection
        try {
        HttpURLConnection connect = (HttpURLConnection) webpage.openConnection();
        
        //Create a new bufferedreader to the webpage
        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        
        int status = connect.getResponseCode();
        System.out.println("Response code: " + status);
        
        //While the page has more lines, read and print out that new line
        String page;              
        while((page = in.readLine()) != null) {
            System.out.println(page);
        }
        
        //close the bufferedreader
        in.close();
        connect.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(url + " is a malformed URL");
        } catch (UnknownHostException e) {
            System.out.println(url + " came back empty, check your network connection or URL path");
        }
    }
    
}
