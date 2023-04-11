package hw.ch03;

public class OhjiyeonDisplay extends AbstractDisplay{
  private String name;
  private String studentId;
  private int grade;

  // 생성자 
  public OhjiyeonDisplay(String name, String studentId, int grade) {
    this.name = name;
    this.studentId = studentId;
    this.grade = grade;
  }

  @Override
  public void open() {
    System.out.println("==============================");
    System.out.println("덕성여대 컴퓨터공학과");
  }

  @Override
  public void print() {
    System.out.println("학번 "+studentId+" / "+grade+"학년 / "+name);
  }

  @Override
  public void close() {
    System.out.println("템플릿 메소드 숙제 입니다.");
    System.out.println("==============================");
  }
}
