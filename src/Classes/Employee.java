package Classes;

public class Employee {
    private int basicSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return getBasicSalary() + (getHourlyRate() * extraHours);
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
