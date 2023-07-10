package it.gb.generic;

public class Context {

    private String stringContext;

    public Context(String stringContext) {
        super();
        this.stringContext = stringContext;
    }

    public String getStringContext() {
        return stringContext;
    }

    public void setStringContext(String stringContext) {
        this.stringContext = stringContext;
    }

    public boolean contains(Context data) {
        return data != null && data.getStringContext() != null
        && data.getStringContext().contains(this.stringContext);
    }
    
}
