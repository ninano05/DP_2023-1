package ch06.A1a.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createCopy() { //중복되는 코드라서 부모쪽으로 옮겼다.
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
