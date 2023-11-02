package it.gb.organizationalHierarchy;

public abstract class OrganizationalHierachyApp {

    public static void executeOrganizationalHierachyApp() {

        // Define organization structure

        Department organization = new Department("SynthiTech Innovations");

        Department executiveD = new Department("Executive Leadership");
        Department operationalD = new Department("Operational Departments");
        Department salesD = new Department("Sales and Marketing");
        Department productDevD = new Department("Product Development");
        Department customerSupD = new Department("Customer Support");
        Department itAndTechD = new Department("IT and Technology");

        organization.addComponent(executiveD);
        organization.addComponent(operationalD);
        organization.addComponent(salesD);
        organization.addComponent(productDevD);
        organization.addComponent(customerSupD);
        organization.addComponent(itAndTechD);

        Department ceoOffice = new Department("CEO's Office");
        Department directors = new Department("Board of Directors");
        executiveD.addComponent(ceoOffice);
        executiveD.addComponent(directors);

        Department operations = new Department("Operations");
        Department hr = new Department("Human Resources");
        Department finance = new Department("Finance");

        operationalD.addComponent(operations);
        operationalD.addComponent(hr);
        operationalD.addComponent(finance);

        Department facilityD = new Department("Facilities Management");
        Department procurement = new Department("Facilities Management");
        operations.addComponent(facilityD);
        operations.addComponent(procurement);

        Department recruitment = new Department("Recruitment");
        Department eRelations = new Department("Employee Relations");
        hr.addComponent(recruitment);
        hr.addComponent(eRelations);

        Department accounting = new Department("Accounting");
        Department budgeting = new Department("Budgeting");
        finance.addComponent(accounting);
        finance.addComponent(budgeting);

        // Add employees
        Employee sarahAnderson = new Employee("Sarah Anderson", "CEO");
        ceoOffice.addComponent(sarahAnderson);

        Employee davidMitchell = new Employee("David Mitchell", "CFO");
        directors.addComponent(davidMitchell);

        Employee lauraEvans = new Employee("Laura Evans", "Chief Legal Officer");
        directors.addComponent(lauraEvans);

        Employee michaelTurner = new Employee("Michael Turner", "VP of Marketing");
        directors.addComponent(michaelTurner);

        Employee jonathanFoster = new Employee("Jonathan Foster", "Board Chair");
        directors.addComponent(jonathanFoster);

        Employee danielPrice = new Employee("Daniel Price", "HR Manager");
        hr.addComponent(danielPrice);

        Employee oliviaLewis = new Employee("Olivia Lewis", "Recuriter");
        recruitment.addComponent(oliviaLewis);

        Employee jamesBaker = new Employee("James Baker", "HR Assistant");
        eRelations.addComponent(jamesBaker);

        // Print organization details
        System.out.println("\n\n");
        organization.getDetails();

    }
}
