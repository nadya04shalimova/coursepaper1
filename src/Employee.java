
public class Employee {

    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
        }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int setDepartment() {
        return this.department;
    }

    public double setSalary() {
        return this.salary;
    }

        @Override
    public String toString() {
        return "Fio: " + fullName + " Otdel: " + department + " Zarplata: " + salary + " ID " + id;
    }
}




