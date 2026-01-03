package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    private MidDeveloper[] midDevelopers = new MidDeveloper[5];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees...");
    }

    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Index already occupied!");
            return;
        }
        juniorDevelopers[index] = dev;
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Index already occupied!");
            return;
        }
        midDevelopers[index] = dev;
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Index already occupied!");
            return;
        }
        seniorDevelopers[index] = dev;
    }
}
