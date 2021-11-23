
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordSort {
    public static void main ( String [] args ) throws IOException{
        Scanner userInput = new Scanner(System.in);
        out.println("Enter Input File Name: ");
        String inputFile = userInput.nextLine() + ".txt";
        out.println("Enter Output File Name: ");
        String outputFile = userInput.nextLine() + ".txt";
        /* Create the word map . Each key is a word and each value is an
        * Integer that represents the number of times the word occurs
        * in the input file
        */
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(new File(inputFile));
        int sentences = 0;
        while(scanner.hasNext()) {
     
            String word = scanner.next();
            if (word.contains("...")) {
                sentences += 1;
            } else if (word.contains(".")) {
                sentences += 1;
            } else if (word.contains("?")) {
                sentences += 1;
            } else if (word.contains("!")) {
                sentences += 1;
            }
            word = word.replaceAll("\\p{Punct}", "");
            Integer count = map.get(word);
            count = (count == null?1:count+1);
            map.put(word, count);
        }
        scanner.close();
        List<String> keys = new ArrayList<>(map.keySet());
        PrintWriter out = new PrintWriter(new FileWriter(outputFile));
        for (String key:keys) {
            out.println(key + " : " + map.get(key));
        }
        if (sentences != 0){
            out.println("There are " + sentences + " full sentences in " + inputFile);
        }
        out.close();
    }
}