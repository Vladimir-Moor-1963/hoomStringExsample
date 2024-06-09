import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text = bufferedReader.readLine();
        String[] words = text.split(" ");

        String result = " ";

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0,1);

        }
        System.out.println(result );
        System.out.println(result.length());
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(result.length() - 1));







    }


 }