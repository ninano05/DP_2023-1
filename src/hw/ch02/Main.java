package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210928 오지연");
        FileIO f = new FileProperties(); // 어댑터 생성
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2023");
            f.setValue("BornYear", "2002");
            f.setValue("StudentId", "20210928");
            f.setValue("Name", "ojy");
            f.setValue("Location", "Boryeong");
            f.writeToFile("ojy.txt");
            System.out.println("ojy.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
