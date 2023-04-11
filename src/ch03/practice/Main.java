package ch03.practice;

public class Main {
  public static void main(String[] args) {
    // AbstractDisplay c = new CharDisplay('a');
    AbstractDisplay a;
    a= new CharDisplay('a');

    a.open();
    a.print();
    a.close();
    a.display();
    
    a = new StringDisplay("aaaa");
    a.display(); // sting과 char 모두 a로 대입 가능
    // c.open();
    // c.print();
    // c.close();

    // c.display();

    AbstractDisplay s = new StringDisplay("오지연");
    s.open();
    s.print();
    s.close();

    s.display();
  }
}
