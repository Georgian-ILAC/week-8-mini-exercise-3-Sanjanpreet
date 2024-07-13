public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee (2004, 18.0,"Sanjanpreet", "Kaur",66);
        System.out.println(employee);
        System.out.println("Previous Hourly Pay is: " + employee.getHourlyPay());
        System.out.println("New Hourly Pay is: " + employee.getRaise());
        System.out.println("Weekly Pay is: " + employee.payDay(45));

    }
}