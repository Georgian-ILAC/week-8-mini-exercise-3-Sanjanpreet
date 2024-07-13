public class Employee extends Person{

    private int id;
    private double hourlyPay;

    public Employee (int id, double hourlyPay, String firstName, String lastName, double height){
        super (firstName, lastName, height);
        this.id = id;
        this.hourlyPay = hourlyPay;

    }

    public int getId() {
        return id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getRaise() {
        this.hourlyPay *= 1.15;
        return this.hourlyPay;
    }

    public double payDay(int hoursWorked){
        double totalPay;
        if (hoursWorked > 40){
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * hourlyPay) + (overtimeHours * hourlyPay * 1.5);
        }
        else {
            totalPay = 40 * hourlyPay;

        }
        return totalPay;
    }
    @Override
    public String toString(){
        int heightFeet = (int) getHeight() / 12;
        int heightInches = (int) getHeight() % 12;
        return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                "User is " + heightFeet + "’" + heightInches + "“\n" +
                "User makes $" + hourlyPay + "\n" +
                "User has the employee ID " + id + "\n";
    }


}