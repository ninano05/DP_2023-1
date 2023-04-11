package hw.ch04;

import hw.ch04.car.CarFactory;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class Main {
  public static void main(String[] args){
    System.out.println("20210928 오지연");
    Factory factory = new CarFactory();
    Product car1 = factory.create("오지연");
    Product car2 = factory.create("그랜저");
    Product car3 = factory.create("소나타");
    Product car4 = factory.create("캐스퍼");
    car1.use();
    car2.use();
    car3.use();
    car4.use();

    System.out.println("");
    System.out.println("<모델명 리스트>");
    ((CarFactory) factory).printAllmodelNames();
  }
}
