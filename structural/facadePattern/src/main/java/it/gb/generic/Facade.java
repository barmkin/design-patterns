package it.gb.generic;

import it.gb.generic.subSystem1.Object1;
import it.gb.generic.subSystem1.Object1Connector;
import it.gb.generic.subSystem1.Object1Creator;
import it.gb.generic.subSystem1.Object1Player;

public class Facade {

    public void executeObject1OnServer(String server, int port) {
        
        // Object 1 is created using it.gb.generic.subSystem1.Object1Creator
        Object1Creator creator = new Object1Creator(server, port);
        Object1 obj = creator.getObjRef();

        // Object 1 must be connected
        Object1Connector connector = new Object1Connector();
        connector.connectObject(obj);

        // Method must be executed on player with a connected obj
        Object1Player.executeMethod1(obj);
    }    
}
