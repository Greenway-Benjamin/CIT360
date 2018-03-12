/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import ACP.Handlers.Handler;
import java.util.HashMap;

/**
 *
 * @author Benjamin Greenway
 */
public class ApplicationController {
    
    
    HashMap<String,Handler> handlerMap = new HashMap();

    public void handleRequest(String command){
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt();
        }
    }

    public void mapCommand(String aCommand, Handler aHandler){
        handlerMap.put(aCommand,aHandler);
    }
}
    

