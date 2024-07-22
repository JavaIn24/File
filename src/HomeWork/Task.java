package HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        String info1 = "Введите данные для записи";
        String info2 = "Введите еще данные, либо введите 0 чтобы остановить программу";
        File file = new File("D://JavaFile/Example2.txt");
        FileWriter writer = new FileWriter(file);
        Scanner inputOne = new Scanner(System.in);
        System.out.println(info1);;
        String a = inputOne.nextLine();
        writer.write(info1);
        writer.append("\n");
        writer.write(a);
        writer.append("\n");
        Scanner inputTwo = new Scanner(System.in);
        for (;;){
            System.out.println(info2);
            String b = inputTwo.nextLine();
            writer.write(info2);
            writer.append("\n");
            writer.write(b);
            writer.append("\n");
            if (b.contains("0")){
                System.out.println("Программа завершена");
                break;
            }
        }
        writer.close();


    }


}
