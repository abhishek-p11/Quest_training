package com.quest.CustomException;

public class Manager extends Employee{
   private int teamSize;
    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        try {
            if(teamSize < 1){
                throw new IllegalArgumentException("Team size must be greater than 0");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("invalid team size "+e.getMessage());
        }

        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString() + "teamSize=" + teamSize + "}";

    }
}
