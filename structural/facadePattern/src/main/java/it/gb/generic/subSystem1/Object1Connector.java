package it.gb.generic.subSystem1;

public class Object1Connector {

    private boolean validateConnection(String serverName, int serverPort) {
        if (serverName == null || serverPort <= 0 || serverName.isBlank()) {
            return false;
        }

        return true;
    }

    public boolean connectObject(Object1 obj) {
        if (this.validateConnection(obj.getServerName(), obj.getServerPort())) {
            System.out.println("SubSystem1 - Connect OBJ");
            return true;
        } else {
            System.out.println("SubSystem1 - CANNOT connect OBJ");
            return false;
        }
    }
}
