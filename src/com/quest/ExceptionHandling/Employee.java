package com.quest.ExceptionHandling;

class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative!");
            }
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
        }
}

