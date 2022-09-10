import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {

        Employee empl1 = new Employee("Лукашин Виктор Сергеевич", 5, 45946);
        Employee empl2 = new Employee("Ефремов Николай Иванович", 3, 76594);
        Employee empl3 = new Employee("Ерохина Людмила Андреевна", 4, 50847);
        Employee empl4 = new Employee("Сидорова Нина Егоровна", 2, 35473);
        Employee empl5 = new Employee("Иванов Виталий Константинович", 1, 85347);

        employees[0] = empl1;
        employees[1] = empl2;
        employees[2] = empl3;
        employees[3] = empl4;
        employees[4] = empl5;
        Employee[] empl = Arrays.copyOf(employees, 5);
        Arrays.stream(empl).forEach(System.out::println);
        System.out.println(empl.length);

        conclusion();
       }
        private static void conclusion(){

            System.out.println(printEmployees());
            System.out.println("Сумма затрат на зарплаты в месяц  "+ calculateTotalSalary());
            System.out.println("Сотрудник с максимальной зарплатой "+ findEmployeeWithMaxSalary());
            System.out.println("Сотрудник с минимальной зарплатой"+ findEmployeeWithMinSalary());
            System.out.println("Среднее значение зарплат "+ calculateAverageSalary());
         }
    private static boolean printEmployees () {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        return false;
    }
        private static double calculateTotalSalary () {
            double sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }

        private static Employee findEmployeeWithMaxSalary () {
            Employee result = employees[0];
            double maxSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
            return result;
        }
        private static Employee findEmployeeWithMinSalary () {
            Employee result = employees[0];
            double minSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
            return result;
        }
        private static double calculateAverageSalary () {
            double count = 0;
            double sum = 0;
            for (Employee employee : employees) {
                if (employee != null) {
                    count++;
                    sum += employee.getSalary();
                }
            }
            return (double) sum / count;
        }

       }
