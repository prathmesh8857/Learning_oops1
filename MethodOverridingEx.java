//base class
class Employee{
    String Name;
    double basesalary;
    
    public double calculateSalary() {
        return basesalary;

    }

    public void showDetails(){
        System.out.println("BaseSalary is : " + basesalary);
    }

}

class FulltimeEmployee extends Employee{
    double bonus;

    @Override
    public double calculateSalary(){
        return basesalary + bonus;
    }

    @Override
    public void showDetails(){
        System.out.println("Full time employee: " + Name + ",Salary: " + calculateSalary());
    }

}
class ParttimeEmployee extends Employee{
    double hoursWork;
    double hourlyRate;

    @Override
    public double calculateSalary(){
        return hoursWork * hourlyRate;
    }

    @Override
    public void showDetails(){
        System.out.println("Full time employee: " + Name + ",Salary: " + calculateSalary());
    }

}

class TemporaryEmployee extends Employee{
    double daysWorked;
    double dailyRate;

    @Override
    public double calculateSalary(){
        return daysWorked * dailyRate;
    }

    @Override
    public void showDetails(){
        System.out.println("Temporary Employee: "+ Name + ", Salary: " + calculateSalary());
    }
}





public class MethodOverridingEx {
    public static void main(String[] args) {


        Employee emp1 = new FulltimeEmployee();
        emp1.Name = "Raj";
        emp1.basesalary = 30000;
        ((FulltimeEmployee) emp1).bonus = 5000;


        Employee emp2 = new ParttimeEmployee();
        emp1.Name = "Shree";
        ((ParttimeEmployee) emp2).hoursWork = 100;
        ((ParttimeEmployee) emp2).hourlyRate = 200;


        Employee emp3 = new TemporaryEmployee();
        emp1.Name = "Danny";
        ((TemporaryEmployee) emp3).daysWorked = 15;
        ((TemporaryEmployee) emp3).dailyRate = 1000;

        //Runtime polymorphism
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();
        
    }
}
