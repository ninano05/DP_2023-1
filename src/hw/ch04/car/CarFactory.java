package hw.ch04.car;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory{
  
  Vector<String> modelNames = new Vector<String>();

  @Override
  protected Product createProduct(String modelName) {
    return new Car_OhJiYeon(modelName);
  }

  @Override
  protected void registerProduct(Product product) {
    modelNames.add(((Car_OhJiYeon) product).getModelName());
  }

  public void printAllmodelNames() {
    Iterator<String> it = modelNames.iterator();
    while(it.hasNext()) {
      String name = it.next();
      System.out.println(name);
    }
  }

}
