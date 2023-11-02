package it.gb.organizationalHierarchy;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {

    private String name;
    private List<OrganizationComponent> subDepartmentsAndEmployees;

    public Department(String name) {
        super();
        this.name = name;
        this.subDepartmentsAndEmployees = new ArrayList<OrganizationComponent>();
    }

    public void setFatherDepartmentName(String fatherName) {
        if (fatherName != null && !fatherName.isBlank()) {
            this.name = fatherName + "/" + this.name;
        }
    }

    public void addComponent(Department department) {
        department.setFatherDepartmentName(this.name);
        this.subDepartmentsAndEmployees.add(department);
    }

    public void removeComponent(Department department) {
        this.subDepartmentsAndEmployees.remove(department);
        department.setFatherDepartmentName("");
    }

    public void addComponent(Employee employee) {
        employee.setDepartmentName(this.name);
        this.subDepartmentsAndEmployees.add(employee);
    }

    public void removeComponent(Employee employee) {
        this.subDepartmentsAndEmployees.remove(employee);
        employee.setDepartmentName("Not assigned");
    }

    @Override
    public void getDetails() {
        System.out.println("Department " + this.name);
        for (OrganizationComponent component : subDepartmentsAndEmployees) {
            component.getDetails();
        }
    }

    public String getName() {
        return name;
    }

}
