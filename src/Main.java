public class Main {
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
    public static double sum(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            sum = sum + empl[i].getSalary();
        }
        return sum;
    }

    public static double max(Employee[] empl) {
        double max = -1;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getSalary() > max) {
                max = empl[i].getSalary();
            }
        }
        return max;
    }

    public static double min(Employee[] empl) {
        double min = empl[0].getSalary() + 1;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getSalary() < min) {
                min = empl[i].getSalary();
            }
        }
        return min;
    }

    public static double average(Employee[] empl) {
        double average = sum(empl) / empl.length;
        return average;
    }



}
