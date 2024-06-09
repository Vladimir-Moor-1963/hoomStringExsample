import java.io.*;
import java.util.Arrays;

public class secondMain {
    public static void main(String[] args) throws IOException {
        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text = bufferedReader.readLine();
        String[] strings = text.split(" ");
        int firstNumber =Integer.parseInt(strings[0]);
        int secondtNumber =Integer.parseInt(strings[2]);
       // int firstNumber =Integer.parseInt(strings[0]);
        System.out.println(firstNumber);
        System.out.println(secondtNumber);

        switch ((strings[1])){
            case "+":
                System.out.println(firstNumber + secondtNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondtNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondtNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondtNumber);
                break;
        }
        }



}
