package Classes;

public class Main {
    public static void main(String[] args) {
        /*TextBox textBox1 = new TextBox();
        textBox1.setText("BOX 1");

        TextBox textBox2 = textBox1;
        textBox2.setText("Box 2");

        System.out.println(textBox1.text);*/ //"Box 2" will be printed

        Employee employee = new Employee();
        employee.setterHourlyRate(20);
        employee.setterBasicSalary(50_000);

        System.out.println(employee.calculateSalary(10));

    }
}
