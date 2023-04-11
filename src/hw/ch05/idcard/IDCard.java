package hw.ch05.idcard;

import hw.ch05.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); //this 현재 id 객체, +:문자열 연결, this.toString() 자동 호출됨
    }

    @Override
    public String toString() { //object 클래스로부터 상속
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
