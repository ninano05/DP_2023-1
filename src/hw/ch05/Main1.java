package hw.ch05;

import hw.ch05.idcard.IDCardFactoryOhJiYeon1;

public class Main1 {

  public static void main(String[] args) {
    IDCardFactoryOhJiYeon1 factory1 = IDCardFactoryOhJiYeon1.getInstance();
    IDCardFactoryOhJiYeon1 factory2 = IDCardFactoryOhJiYeon1.getInstance();

    System.out.println("20210928 오지연");
    if(factory1 == factory2) {
      System.out.println("factory1과 factory2는 같은 인스턴스 입니다.");
    } else{
      System.out.println("factory1과 factory2는 다른 인스턴스 입니다.");
    }
  }
  

}
