package Classes;

public class Employee {
    private int basicSalary;
    private int hourlyRate;

    public int calculateSalary(int extraHours) {
        return getterBasicSalary() + (getterHourlyRate() * extraHours);
    }

    public int getterBasicSalary() {
        return basicSalary;
    }

    public void setterBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getterHourlyRate() {
        return hourlyRate;
    }

    public void setterHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
