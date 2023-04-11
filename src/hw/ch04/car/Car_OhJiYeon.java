package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_OhJiYeon extends Product{
  String modelName;

  public Car_OhJiYeon(String modelName) {
    this.modelName = modelName;
  }

  public String getModelName() {
    return modelName;
  }

  @Override
  public void use() {
    System.out.println("모델명 "+modelName+"인 car를 사용합니다.");
  }
  
}
