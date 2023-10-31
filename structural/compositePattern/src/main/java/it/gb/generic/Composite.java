package it.gb.generic;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> childrens;
    private String path;

    public Composite(String path) {
        super();
        this.path = path;
        childrens = new ArrayList<Component>();
    }

    @Override
    public void execute() {
        System.out.println(this.toString() + " | Delegating task to childrens");
        for (Component component : childrens) {
            component.execute();
        }
    }

    public void add(Component component) {
        component.setParentPath(this.path);
        this.childrens.add(component);
    }

    public void remove(Component component) {
        component.setParentPath("/");
        this.childrens.remove(component);
    }

    public List<Component> getChildrens() {
        return this.childrens;
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
