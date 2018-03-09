/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLHTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 *
 * @author Benjamin Greenway
 */
public class Connection {

    public static void main(String[] args) throws IOException {
        
        //If number of arguments entered are not exactly 5, create error and exit
        if (args.length != 5) {
            System.err.println("Usage:  java Reverse "
                + "http://<location of your servlet/script>"
                + " string_to_reverse");
            System.exit(1);
        }
        
        //For each arg after the URL add to an arraylist
        ArrayList reverseStrings = new ArrayList();
        for(int i = 1; i < args.length; i++) {
            reverseStrings.add(args[i]);
        }
        System.out.println(reverseStrings);
        

        //Use first argument as URL to connect to, and create connection
        URL url = new URL(args[0]);
        URLConnection connection = url.openConnection();
        
        //Set the connection to write out
        connection.setDoOutput(true);

        //Create output string, and write each of the strings to the different fields in the form
        OutputStreamWriter out = new OutputStreamWriter(
                                         connection.getOutputStream());
        out.write("yourname=" + reverseStrings.get(0));
        out.write("gardens=" + reverseStrings.get(1));
        out.write("carrots=" + reverseStrings.get(2));
        out.write("slugs=" + reverseStrings.get(3));
        
        //Close output stream
        out.close();

        //Create new buffered reader and read the page
        BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    connection.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
        
    }
        
        
    
}

