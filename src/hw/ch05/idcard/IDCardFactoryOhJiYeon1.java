package hw.ch05.idcard;

import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryOhJiYeon1 extends Factory{

  private static IDCardFactoryOhJiYeon1 singleton = new IDCardFactoryOhJiYeon1(); 
  
  private IDCardFactoryOhJiYeon1() {
  }

  public static IDCardFactoryOhJiYeon1 getInstance() {
    return singleton;
  }

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println(product + "을 등록했습니다.");
  }
  
}
