package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

//코드가 인터페이스를 통해 구현해서 재사용성이 높다.
//product라는 부모타입을 이용해서 구횬돈
//원칙: prgramming to Interface/Abstract class
public class Manager {
    private Map<String,Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        // return p
        // return p.clone(); //clone 메소드는 자기 자신만 호출할 수 있다.
        return p.createCopy();
        //복제품을 리턴함
    }
}
