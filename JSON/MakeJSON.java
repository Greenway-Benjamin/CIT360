/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

/**
 *
 * @author Benjamin Greenway
 */
public class MakeJSON {
    
    public static void main(String[] args) throws IOException {
        
        //Create person jake
        Person jake = new Person();
        List<String> kids = new ArrayList<>();
        kids.add("Tommy");
        kids.add("Lucy");
        jake.createPerson("Jake", 53, 2534.23, true, kids);
        
        //Put person jake into a JSON object
        JSONObject obj = new JSONObject();
        
        //Add items from jake into JSON Object
        obj.put("name", jake.name);
        obj.put("num", jake.num);
        obj.put("balance", jake.balance);
        obj.put("is_vip", jake.vip);
        obj.put("welcomeChildren", jake.welcomeChildren);
        
        //Write the JSON object to file on desktop
        FileWriter file = new FileWriter("C:\\Users\\Daddy\\Desktop\\"+jake.name+".txt");
        file.write(obj.toJSONString());
        file.flush();
        
        //Write out the items in the JSON Object
        System.out.println(obj.toJSONString());
    }
    
}
