package it.gb.generic;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        super();
        this.realSubject = realSubject;
    }

    protected boolean checkAccess() {
        System.out.println("[Proxy] Checking pre-requisite");
        return true;
    }

    protected void beforeOperation() {
        System.out.println("[Proxy] Doing something before calling operation()");
    }

    protected void logAccess() {
        System.out.println("[Proxy] Logging access...");
    }

    @Override
    public void operation() {
        this.logAccess();
        if (this.checkAccess()) {
            this.beforeOperation();
            this.realSubject.operation();
            this.afterOperation();
        } else {
            System.out.println("[Proxy] Operation not permitted!");
        }
    }
    
    protected void afterOperation() {
        System.out.println("[Proxy] Doing something after calling operation()");
    }
    
}
