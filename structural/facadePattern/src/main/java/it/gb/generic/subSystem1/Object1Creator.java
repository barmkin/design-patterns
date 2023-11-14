package it.gb.generic.subSystem1;

import java.util.UUID;

public class Object1Creator {

    private Object1 objRef;
    
    public Object1Creator(String serverName, int serverPort) {
        super();
        objRef = new Object1();
        objRef.setId(UUID.randomUUID());
        objRef.setServerName(serverName);
        objRef.setServerPort(serverPort);
    }

    
    public Object1 getObjRef() {
        return objRef;
    }


}
