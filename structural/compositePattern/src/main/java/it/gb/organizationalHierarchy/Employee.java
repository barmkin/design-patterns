package it.gb.organizationalHierarchy;

public class Employee implements OrganizationComponent {

    private String name;
    private String title;
    private String departmentName;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public void getDetails() {
        System.out.println("[" + this.departmentName + " - " + this.title + "] " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
