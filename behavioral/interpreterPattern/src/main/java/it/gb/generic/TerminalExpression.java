package it.gb.generic;

public class TerminalExpression implements AbstractExpression {
    
    Context data;

    @Override
    public boolean interpret(Context context) {
        if(context.contains(data)) {
            return true;
        } else {
            return false;  
        }    
    }

  
    public TerminalExpression(Context data)
    {
        this.data = data; 
    }    
}
