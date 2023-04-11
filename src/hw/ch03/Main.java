package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210928 오지연");
        AbstractDisplay d1 = new OhjiyeonDisplay("오지연", "20210928", 3);
        d1.display(10);
        d1.display(5);
    }
}
