/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Benjamin Greenway
 */
public class ParseJSON {
    
    public static void main(String[] args) throws IOException, ParseException {
    
        //Read and parse file
    JSONParser parser = new JSONParser();
    
    Object obj = parser.parse(new FileReader("C:\\Users\\Daddy\\Desktop\\jake.txt"));
        
        //Create JSON Object and put file in it
    JSONObject jsonObject = (JSONObject) obj;
    
        //Get items from JSON Object
    String name = (String) jsonObject.get("name");
    long num = (long) jsonObject.get("num");
    Double balance = (Double) jsonObject.get("balance");
    Boolean vip = (Boolean) jsonObject.get("is_vip");
    JSONArray welcomeChildren = (JSONArray) jsonObject.get("welcomeChildren");
    
        //Turn JSONArray into ArrayList
    List<String> welcomeArray = new ArrayList<>();
    for(int i = 0; i < welcomeChildren.size(); i++){
        welcomeArray.add((String) welcomeChildren.get(i));
    }
    
        //Create new person from items taken from JSON object
    Person jake = new Person();
    jake.createPerson(name, num, balance, vip, welcomeArray);   
    
        //Print out jake's information
    System.out.println("Name: " + jake.name + "\nID number: " + jake.num + "\nBalance: " 
            + jake.balance + "\nVIP Status: " + jake.vip + "\nWelcome Children: " + jake.welcomeChildren);
}
}