package ch02.practice1;

//어댑터 (상속을 이용함)
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string); // 부모 생성자
    }

    @Override
    //메소드 이름이 변환됐다
    public void printWeak() { //12볼트
        showWithParen(); //220볼트
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

