package examinationsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import examinationsystem.Exam;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 * Exam Session class is a class that sets exams to students,makes evaluations and adds to several files concerning exams
 * @author hp
 */
public class ExamSession {

    private String ID;
    private Exam CurrentExam;
    private BufferedReader br = null;
    private ArrayList<String> Stud_UserName;

    public ExamSession(Exam E, ArrayList<String> Students) {
        this.CurrentExam = E;
        this.Stud_UserName = Students;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCurrentExam(Exam CurrentExam) {
        this.CurrentExam = CurrentExam;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public void setStud_UserName(ArrayList<String> Stud_UserName) {
        this.Stud_UserName = Stud_UserName;
    }

    public ExamSession() {

    }

    public String getID() {
        return ID;
    }

    public ArrayList<String> getStud_UserName() {
        return Stud_UserName;
    }

    public Exam getCurrentExam() {
        return CurrentExam;
    }

    public BufferedReader getBr() {
        return br;
    }
    /**
     * A function that reads all exams from the file splits them into string add them into an array
     * @return array of strings containing exams
     */

    public static String[] Spliting() {
        String[] Lines = null;
        try {
            String Line = new String(Files.readAllBytes(Paths.get("Ques.txt")), StandardCharsets.UTF_8);
            Lines = Line.split(Pattern.quote("$"));

        } catch (IOException e) {
            System.out.println(e);
        }
        return Lines;
    }
    /**
     * A function that takes each exam as a string and separates its info and makes an object from class Exam
     * @param exam : string taken from splitting function
     * @return An object from the class Exam with added info
     */
    public static Exam Get_ExamInfo(String exam) {
        Exam E = new Exam();
        String[] arr = exam.split(Pattern.quote("@"));
        ArrayList<Question> Ques = new ArrayList<Question>();

        for (int i = 5; i < arr.length; i += 7) {
            Map<String, String> MyMap = new HashMap<String, String>();
            MyMap.put("A", arr[i + 2]);
            MyMap.put("B", arr[i + 3]);
            MyMap.put("C", arr[i + 4]);
            MyMap.put("D", arr[i + 5]);
            Question Q = new Question(arr[i], arr[i + 1], arr[i + 6], MyMap);
            Ques.add(Q);
        }
        E.setQues(Ques);

        E.setExamID(arr[0]);

        E.setCourseID(arr[1]);

        E.setDuration(Integer.valueOf(arr[2]));

        String time = arr[3];
        String[] t = time.split(Pattern.quote(":"));
        E.setTimer_Realese(String.valueOf(E.getDuration() + Integer.valueOf(t[0])) + ":" + t[1] + ":" + t[2]);

        String Date = arr[4];
        String[] d = Date.split(Pattern.quote("-"));

        E.setDate(new Date(Integer.valueOf(d[0]), Integer.valueOf(d[1]),
                Integer.valueOf(d[2]), Integer.valueOf(t[0]), Integer.valueOf(t[1]), Integer.valueOf(t[2])));

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        formatter.format(E.getDate());

        return E;
    }
    /**
     * A function that takes an exam, get student's data then makes an exam session with these students
     * @param E Exam object taken from previous function Get_ExamInfo
     * @return an object from ExamSession containing exam and students assigned to it
     */
    public ExamSession Assign_Students(Exam E) {
        ArrayList<String> Students = new ArrayList<String>();
        try {
            br = new BufferedReader(new FileReader("Students.txt"));
            String line = br.readLine();
            while (line != null) {
                String arr[] = line.split(Pattern.quote("|"));
                for (int i = 7; i < arr.length; i++) {
                    if (arr[i].equals(E.getCourseID())) {
                        Students.add(arr[0]);
                    }
                }
                line = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            System.out.println("IO error");
        }
        ExamSession ES = new ExamSession(E, Students);

        return ES;
    }

    /**
     * this function takes the exam id and search for the students that have
     * that exam .
     *
     * @param ExamID the ExamID that's taken from the combo box in the Exam
     * session form
     * @return list of Students to inform them that they have an Exam.
     */
    public ArrayList<String> Inform_Students(String ExamID) {
        String Course = "";

        String[] exams = Spliting();
        ArrayList<Exam> Exams = new ArrayList<Exam>();
        for (int i = 0; i < exams.length; i++) {
            Exams.add(ExamSession.Get_ExamInfo(exams[i]));
        }
        for (int i = 0; i < Exams.size(); i++) {
            if (Exams.get(i).getExamID().equals(ExamID)) {
                Course = Exams.get(i).getCourseID();
            }
        }
        ArrayList<String> Stud = new ArrayList<String>();
        try {
            br = new BufferedReader(new FileReader("Students.txt"));
            String line = br.readLine();
            while (line != null) {
                String arr[] = line.split(Pattern.quote("|"));
                for (int i = 7; i < arr.length; i++) {
                    if (arr[i].equals(Course)) {
                        Stud.add(arr[0]);
                    }
                }
                line = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            System.out.println("IO error");
        }
        return Stud;
    }

    /**
     * save the Exams IDs that were prepared
     *
     * @param ExamID the ExamID that were prepared
     * @param Stud_UserName list of Students taken from Function inform Students
     * to save in file
     */
    public void Save_ExamFile(String ExamID, ArrayList<String> Stud_UserName) {
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("SavedExamIDS.txt"), true);
            byte[] strToBytes = ExamID.getBytes();
            String deli = "|";
            String delim = "$";
            byte[] deliToBytes = deli.getBytes();
            byte[] delimToBytes = delim.getBytes();
            outputStream.write(strToBytes);
            outputStream.write(deliToBytes);
            for (int i = 0; i < Stud_UserName.size(); i++) {
                byte[] CourseToBytes = Stud_UserName.get(i).getBytes();
                outputStream.write(CourseToBytes);
                outputStream.write(delimToBytes);

            }
            String delimiter = System.getProperty("line.separator");
            byte[] Delimeter = delimiter.getBytes();
            outputStream.write(Delimeter);
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }

    /**
     * this function writes number of students who answered each question of a
     * specific exam correctly into the file of (Evaluation.txt) it writes a
     * dollar sign and then exam id and then 4 lines each line for each question
     * and what's written in the lines are number of students who correctly
     * answered the question
     *
     * @param count it's the correct count, we add 1 if the student answered
     * correctly, we call the function in (CurrentExam) form
     * @param id the specified exam id
     * @throws IOException Throwing an exception to handle later when we call
     * the function
     */

    public void EvalWrite(ArrayList<Integer> count, String id) throws IOException {
        boolean found = false;
        final Path path = Paths.get("Evaluation.txt");
        ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(path));
        if (fileContent.isEmpty()) {
            fileContent.add("$");
            fileContent.add(id);
            fileContent.add(String.valueOf(count.get(0)));
            fileContent.add(String.valueOf(count.get(1)));
            fileContent.add(String.valueOf(count.get(2)));
            fileContent.add(String.valueOf(count.get(3)));
        } else {
            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).equals(id)) {
                    found = true;
                    fileContent.set(i + 1, String.valueOf(Integer.valueOf(fileContent.get(i + 1)) + Integer.valueOf(count.get(0))));
                    fileContent.set(i + 2, String.valueOf(Integer.valueOf(fileContent.get(i + 2)) + Integer.valueOf(count.get(1))));
                    fileContent.set(i + 3, String.valueOf(Integer.valueOf(fileContent.get(i + 3)) + Integer.valueOf(count.get(2))));
                    fileContent.set(i + 4, String.valueOf(Integer.valueOf(fileContent.get(i + 4)) + Integer.valueOf(count.get(3))));
                    break;
                }
            }
            if (!found) {
                fileContent.add("$");
                fileContent.add(id);
                fileContent.add(String.valueOf(count.get(0)));
                fileContent.add(String.valueOf(count.get(1)));
                fileContent.add(String.valueOf(count.get(2)));
                fileContent.add(String.valueOf(count.get(3)));
            }

        }
        Files.write(path, fileContent, StandardCharsets.UTF_8);
    }

    /**
     * this function writes the grade of each student of a specified exam id
     *
     * @param CorrectCount the grade we get from (Current Exam) form after the
     * exam is finished
     * @param id the Exam ID
     * @throws IOException Throwing an exception to handle later when we call
     * the function
     */
    public void GradeWrite(int CorrectCount, String id) throws IOException {
        boolean found = false;
        final Path Gpath = Paths.get("Grades.txt");
        ArrayList<String> GfileContent = new ArrayList<>(Files.readAllLines(Gpath));
        if (GfileContent.isEmpty()) {
            GfileContent.add("$");
            GfileContent.add(id);
            GfileContent.add(String.valueOf(CorrectCount));

        } else {
            for (int i = 0; i < GfileContent.size(); i++) {
                if (GfileContent.get(i).equals(id)) {
                    found = true;
                    GfileContent.add(String.valueOf(CorrectCount));
                    break;
                }
            }
            if (!found) {
                GfileContent.add("$");
                GfileContent.add(id);
                GfileContent.add(String.valueOf(CorrectCount));
            }
        }
        Files.write(Gpath, GfileContent, StandardCharsets.UTF_8);
    }

}
