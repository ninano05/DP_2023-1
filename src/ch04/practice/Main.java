package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;
import ch04.practice.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args){
    //1. 신분증 생산 (직접)
    Product id01 = new IDCard("ojy");
    id01.use();

    //Product id = new IDCard(); 생성자가 있어 인자 없는 경우는 만들어지지 않음

    //2. 신분증 생산 (공장을 통해서)
    Factory f = new IDCardFactory();
    Product id02 = f.create("ojy");
    id02.use();



  }
}
