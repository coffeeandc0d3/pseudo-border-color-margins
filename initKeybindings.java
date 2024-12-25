package insertion;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
  *  Open rc.xml or lxde-rc.xml (however user named it), 
  *  Stores original file in arratylist to then search for keyword's position
  *  Inserts bindings into arraylist at pos of keyboard tag, no file modification yet 
  *  Finally writes arraylist with additional bindings to user's .xml file    
  *  The result: keybindings should work for openbox that give margins/gaps 
*/

public class initKeybindings {
  static final String KEY="<keyboard>";
  static String FILE;
  static String DATAFILE;

  public static void main(String[] args) {
    FILE = args[0]; 
    DATAFILE = args[1];
    System.out.println("Appending: " + FILE);
    ArrayList<String> originalData = new ArrayList<>();
    try {
      Scanner scan = new Scanner(new FileReader(FILE));
      while (scan.hasNextLine()) {
        String words = "";
        words = words.concat(String.format("%s%n", scan.nextLine()));
        originalData.add(words);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    int count = 0;
    for (String s : originalData) {
      ++count;
      if (s.contains(KEY)) {
        System.out.println("Found at pos: " + count);
        break;
      }
    }
    ArrayList<String> bindings = new ArrayList<>();
    read(bindings, DATAFILE);
    for (String b : bindings) {
      ++count;
      originalData.add(count, b);
      System.out.print(count + "\n");
      System.out.print(b);
    }
    write(originalData);
  }

  static void read(ArrayList<String> bindings, String file) {
    try {
      Scanner reader = new Scanner(new FileReader(file));
      while (reader.hasNextLine()) {
        String line = new String("");
        line = String.format("%s%n", reader.nextLine());
        bindings.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  static void write(ArrayList<String> list) {
    try {
      FileWriter myWriter = new FileWriter(FILE);
      for (String s : list) {
        myWriter.write(s);
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  void outputList(ArrayList<String> list) {
    for (String s : list) {
      System.out.print(s);
    }
  }
}
