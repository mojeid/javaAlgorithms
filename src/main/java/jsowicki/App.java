package jsowicki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
//        int input = StdIn.readInt();
//        System.out.println(input);

        adventOfCode2();

    }

    public static void adventOfCode2() throws FileNotFoundException {
        File file = new File("src\\main\\resources\\advent2.txt");
        Scanner scanner = new Scanner(file);

        // load input from text file
        List<Integer> programInput = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            programInput.add(scanner.nextInt());
        }
    }

}
