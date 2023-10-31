package it.gb.generic;

public class Leaf implements Component {

    String path;

    public Leaf(String path) {
        super();
        this.path = path;
    }

    @Override
    public void execute() {
        System.out.println(this.toString() + " | Executing Task");
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public void setParentPath(String path) {
        this.path = path + "/" + this.path;
    }

    @Override
    public String toString() {
        return path;
    }
    
}
