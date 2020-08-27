package examinationsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;
/**
 * class for instructor's info and rankings of questions
 * @author hp
 */
public class Instructor extends User {

    private ArrayList<String> Courses;

    public Instructor() {
        Courses = new ArrayList<String>();
    }

    public ArrayList<String> getCourses() {
        return Courses;
    }
    public void setCourses(ArrayList<String> Courses) {
        this.Courses = Courses;
    }

    /**
     * A function that rank every question in the exam into tough and solvable
     * and save these ranks in a file
     *
     * @param Exam_ID is the exam id that we want to get an evaluation report
     * for it
     * @return a map that contains every question and the number of students
     * that solved this question in a right way
     */
    public Map<String, Integer> Ranking(String Exam_ID) {
        BufferedReader br = null;
        String Studs[] = null;
        int Num_Stud;
        try {
            br = new BufferedReader(new FileReader("SavedExamIDs.txt"));
            String line = br.readLine();
            while (line != null) {
                String arr[] = line.split("|");
                if (arr[0].equals(Exam_ID)) {
                    Studs = arr[1].split("$");
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IO Error");
        }
        Num_Stud = Studs.length;
        ArrayList<String> Rank = new ArrayList<String>();
        Map<String, Integer> Ranking = new HashMap<>();
        Map<String, Integer> Sorted = null;

        BufferedReader Br = null;

        String Ques1 = "";
        String Ques2 = "";
        String Ques3 = "";
        String Ques4 = "";
        String Rank1 = "";
        String Rank2 = "";
        String Rank3 = "";
        String Rank4 = "";

        try {
            Br = new BufferedReader(new FileReader("Evaluation.txt"));
            String line = Br.readLine();
            while (line != null) {
                if (line.equals("$")) {
                    line = Br.readLine();
                    if (Exam_ID.equals(line)) {
                        Ques1 = Br.readLine();
                        Ques2 = Br.readLine();
                        Ques3 = Br.readLine();
                        Ques4 = Br.readLine();
                    }
                }
                line = Br.readLine();
            }
            int Q1 = Integer.valueOf(Ques1);
            int Q2 = Integer.valueOf(Ques2);
            int Q3 = Integer.valueOf(Ques3);
            int Q4 = Integer.valueOf(Ques4);
            Ranking.put("Q1", Q1);
            Ranking.put("Q2", Q2);
            Ranking.put("Q3", Q3);
            Ranking.put("Q4", Q4);

            Sorted = Ranking.entrySet().stream().sorted(comparingByValue()).
                    collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

            if (Q1 < Num_Stud / 2) {
                Rank1 = "Tough";
            } else {
                Rank1 = "Solvable";
            }
            Rank.add(Rank1);
            if (Q2 < Num_Stud / 2) {
                Rank2 = "Tough";
            } else {
                Rank2 = "Solvable";
            }
            Rank.add(Rank2);
            if (Q3 < Num_Stud / 2) {
                Rank3 = "Tough";
            } else {
                Rank3 = "Solvable";
            }
            Rank.add(Rank3);
            if (Q4 < Num_Stud / 2) {
                Rank4 = "Tough";
            } else {
                Rank4 = "Solvable";
            }
            Rank.add(Rank4);
        } catch (IOException e) {
            System.out.println("IO Error");
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(new File("Report.txt"), true);
            String Deli = "|";
            byte[] DeliToBytes = Deli.getBytes();
            byte[] IDToBytes = Exam_ID.getBytes();
            outputStream.write(IDToBytes);
            outputStream.write(DeliToBytes);
            for (int i = 0; i < Rank.size(); i++) {
                byte[] RankToBytes = Rank.get(i).getBytes();
                outputStream.write(RankToBytes);
                outputStream.write(IDToBytes);
            }
            String delimiter = System.getProperty("line.separator");
            outputStream.write(delimiter.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("IO Error");
        }
        return Sorted;
    }

    /**
     * A function to get the key of some values in the map
     *
     * @param map is the map that we want to get the key from it
     * @param value is the value that we want to get its key
     * @return the key if found or null if it is not found
     */
    public static String getKey(Map<String, Integer> map, Integer value) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * A function that get the most two tough question in the exam
     *
     * @param Sorted is a sorted map contain of the question name and the number
     * of students that solve it in a right way
     * @return Array list contain the names of the most two tough questions
     */
    public ArrayList<String> QuesRanking(Map<String, Integer> Sorted) {
        ArrayList<String> MostTough = new ArrayList<String>();

        int x[] = new int[4];
        int i = 0;

        for (Map.Entry<String, Integer> entry : Sorted.entrySet()) {
            x[i] = entry.getValue();
            i++;
        }

        String Ques1 = getKey(Sorted, x[0]);
        MostTough.add(Ques1);
        Sorted.remove(Ques1);
        String Ques2 = getKey(Sorted, x[1]);
        MostTough.add(Ques2);
        return MostTough;
    }
}
