package Classes;

public class Main {

    public static void main(String[] args) {

        TextBox textBox1 = new TextBox();
        textBox1.setText("BOX 1");

        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");

        System.out.println(textBox1.text);
        System.out.println(textBox2.text);
    }
}
