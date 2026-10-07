import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Program 7: reads the text file automatically and prints it as a table.
// If any information (eno, ename, mobile) is missing, it shows a warning
// for each bad line, does not continue, and lets the user fix the file and retry.
public class Program7 {

    // the file is opened automatically: change the name here if needed
    private String fileName = "aki.txt";

    private Scanner sc;

    public Program7(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        sc.nextLine(); // clear leftover Enter from the menu choice

        boolean finished = false;
        while (!finished) {
            List<String[]> records = loadFile();   // null if something is wrong

            if (records != null) {
                // everything is complete: print the table
                System.out.printf("%-8s %-20s %-12s%n", "eno", "ename", "mobile");
                for (String[] r : records) {
                    System.out.printf("%-8s %-20s %-12s%n", r[0], r[1], r[2]);
                }
                finished = true;
            } else {
                System.out.println("\nCannot continue. Fix " + fileName + " and save it.");
                System.out.print("Press Enter to retry (or type B to go back to the menu): ");
                String answer = sc.nextLine();
                if (answer.trim().equalsIgnoreCase("B")) {
                    finished = true;
                }
            }
        }
    }

    // Reads the file and checks every line.
    // Returns the records if all is fine, or null if there is any problem.
    private List<String[]> loadFile() {
        List<String[]> records = new ArrayList<>();
        int problems = 0;
        int lineNumber = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.trim().isEmpty()) continue;

                // split on any spaces or tabs
                String[] p = line.trim().split("\\s+");

                // skip the header line (starts with the word "eno")
                if (p[0].equalsIgnoreCase("eno")) continue;

                boolean hasEno;
                boolean hasMobile;
                boolean hasName;

                if (p.length == 1) {
                    // only one word on the line
                    hasEno = p[0].matches("\\d+");
                    hasMobile = false;
                    hasName = !hasEno;
                } else {
                    hasEno = p[0].matches("\\d+");                 // first word is a number
                    hasMobile = p[p.length - 1].matches("\\d+");   // last word is a number
                    int nameStart = hasEno ? 1 : 0;
                    int nameEnd = hasMobile ? p.length - 1 : p.length;
                    hasName = nameEnd - nameStart > 0;             // some word is left for the name
                }

                // collect what is missing on this line
                List<String> missing = new ArrayList<>();
                if (!hasEno) missing.add("eno");
                if (!hasName) missing.add("ename");
                if (!hasMobile) missing.add("mobile");

                if (!missing.isEmpty()) {
                    problems++;
                    System.out.println("WARNING: line " + lineNumber + " is missing "
                            + String.join(", ", missing) + " -> " + line.trim());
                } else {
                    String eno = p[0];
                    String mobile = p[p.length - 1];
                    // everything in the middle is the name (can have spaces)
                    String name = String.join(" ", Arrays.copyOfRange(p, 1, p.length - 1));
                    records.add(new String[]{eno, name, mobile});
                }
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("WARNING: cannot open " + fileName
                    + " (check that it is in the same folder as Main.java)");
            return null;
        }

        if (problems > 0) {
            System.out.println(problems + " line(s) have missing information.");
            return null;
        }
        return records;
    }
}