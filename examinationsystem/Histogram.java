package examinationsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Showing a Histogram of list of all possible grades(which are 4 possible
 * cases) and #of students scored each grade by a specific Exam ID
 *
 * @author Yatta
 */
public class Histogram {

    /**
     *
     */
    private int ExamCode;
    private Map<Integer, Integer> GradesAndNoOfStudents;

    /**
     * initializing the map to add to later
     */
    public Histogram() {
        GradesAndNoOfStudents = new HashMap<Integer, Integer>() {
            {
                put(0, 0);
                put(1, 0);
                put(2, 0);
                put(3, 0);
                put(4, 0);
            }
        };

    }

    /**
     * this function reads all exam IDs of solved exams and put it in a list to
     * show it to the instructor later
     *
     * @return returns list of exam IDs found
     * @throws IOException Throwing an exception to handle later when we call
     * the function
     */

    public ArrayList<String> ExamIDsRead() throws IOException {
        ArrayList<String> ExamsIDs = new ArrayList<String>();
        ArrayList<String> Lines = new ArrayList<String>();
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("Grades.txt"));
        String line = br.readLine();
        if (line == null) {
            ExamsIDs = null;
        } else {
            while (line != null) {
                Lines.add(line);
                line = br.readLine();
            }
            for (int i = 0; i < Lines.size() - 1; i++) {
                if (Lines.get(i).equals("$")) {
                    ExamsIDs.add(Lines.get(i + 1));
                }
            }
        }
        return ExamsIDs;
    }

    /**
     * this function reads searches the file of Grades.txt for an exam id
     * selected by user and then calculates number of students scored each grade
     * to show the histogram by this data this function is called in the
     * instructor form in ShowHisto_btn
     *
     * @param ID Exam id taken from user to search by
     * @return returns map of each grade and number of students associated with
     * it
     * @throws IOException throws an exception to handle later when we call the
     * function
     */

    public Map<Integer, Integer> HistoRead(String ID) throws IOException {
        final Path Gpath = Paths.get("Grades.txt");
        ArrayList<String> GfileContent = new ArrayList<>(Files.readAllLines(Gpath));

        Outer:
        for (int i = 0; i < GfileContent.size(); i++) {
            if (GfileContent.get(i).equals("$")) {
                if (GfileContent.get(i + 1).equals(ID)) {
                    for (int j = i + 2; j < GfileContent.size(); j++) {
                        if (GfileContent.get(j).equals("$")) {
                            break Outer;
                        } else if (Integer.valueOf(GfileContent.get(j)) == 0) {
                            GradesAndNoOfStudents.put(0, GradesAndNoOfStudents.get(0) + 1);
                        } else if (Integer.valueOf(GfileContent.get(j)) == 1) {
                            GradesAndNoOfStudents.put(1, GradesAndNoOfStudents.get(1) + 1);
                        } else if (Integer.valueOf(GfileContent.get(j)) == 2) {
                            GradesAndNoOfStudents.put(2, GradesAndNoOfStudents.get(2) + 1);
                        } else if (Integer.valueOf(GfileContent.get(j)) == 3) {
                            GradesAndNoOfStudents.put(3, GradesAndNoOfStudents.get(3) + 1);
                        } else if (Integer.valueOf(GfileContent.get(j)) == 4) {
                            GradesAndNoOfStudents.put(4, GradesAndNoOfStudents.get(4) + 1);
                        }

                    }
                }
            }
        }
        return GradesAndNoOfStudents;
    }
}
