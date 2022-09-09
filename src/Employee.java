
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
        System.out.println(this.fullName);
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

    public static int sum(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            sum = sum + empl[i].salary;
        }
        return (int) sum;
    }

    public static double max(Employee[] empl) {
        double max = -1;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].salary > max) {
                max = empl[i].salary;
            }
            }
        return max;
    }
    public static double min(Employee[] empl) {
        double min = empl[0].salary + 1;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].salary < min) {
                min = empl[i].salary;}
        }
        return min;}

    public static double average(Employee[] empl) {
        double average = sum(empl) / empl.length;
        return (int) average;
    }
    @Override
    public String toString() {
        return  "Fio: " + fullName + " Otdel: " + department + " Zarplata: " + salary+" ID "+ id;
    }
    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Лукашин Виктор Сергеевич", 5, 45946);
        empl[1] = new Employee("Ефремов Николай Иванович", 3, 76594);
        empl[2] = new Employee("Ерохина Людмила Андреевна", 4, 50847);
        empl[3] = new Employee("Сидорова Нина Егоровна", 2, 35473);
        empl[4] = new Employee("Иванов Виталий Константинович", 1, 85347);


        for (Employee e : empl) {
            System.out.println(e);
        }
        System.out.println("Общая сумма зарплат " + sum(empl));
        System.out.println("Максимальная зарплата " + max(empl));
        System.out.println("Минимальная зарплата " + min(empl));
        System.out.println("Среднее значение " + average(empl));


    }
}




