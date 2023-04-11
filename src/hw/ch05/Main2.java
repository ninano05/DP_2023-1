package hw.ch05;

import hw.ch05.idcard.IDCardFactoryOhJiYeon2;

public class Main2 extends Thread{
  public static void main(String[] args) {
    System.out.println("20210928 오지연");
    new Main2("최승훈").start();
    new Main2("오지연").start();
    new Main2("김다인").start();
  }

  @Override
  public void run() {
    IDCardFactoryOhJiYeon2 obj = IDCardFactoryOhJiYeon2.getInstance();
    System.out.println(getName() + ": obj = " + obj);
  }

  public Main2(String name) {
    super(name);
  }
}
