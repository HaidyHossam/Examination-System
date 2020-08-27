package examinationsystem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * class with anything needed to make a an exam and save it in file
 *
 * @author hp
 */
public class Exam {
    
    private String CourseID;
    private int Duration;
    private String Timer_Realese;
    private Boolean Acceptance_Status;
    private String Instrator_Name;
    private Date Date;
    private String ExamID;
    private ArrayList<Question> Ques;
    
    public String getExamID() {
        return ExamID;
    }
    
    public String getCourseID() {
        return CourseID;
    }
    
    public void setExamID(String ExamID) {
        this.ExamID = ExamID;
    }
    
    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }
    
    public void setDuration(int Duration) {
        this.Duration = Duration;
    }
    
    public void setTimer_Realese(String Timer_Realese) {
        this.Timer_Realese = Timer_Realese;
    }
    
    public void setAcceptance_Status(Boolean Acceptance_Status) {
        this.Acceptance_Status = Acceptance_Status;
    }
    
    public void setInstrator_Name(String Instrator_Name) {
        this.Instrator_Name = Instrator_Name;
    }
    
    public void setDate(Date Date) {
        this.Date = Date;
    }
    
    public void setQues(ArrayList<Question> Ques) {
        this.Ques = Ques;
    }
    
    public int getDuration() {
        return Duration;
    }
    
    public String getTimer_Realese() {
        return Timer_Realese;
    }
    
    public Boolean getAcceptance_Status() {
        return Acceptance_Status;
    }
    
    public String getInstrator_Name() {
        return Instrator_Name;
    }
    
    public Date getDate() {
        return Date;
    }
    
    public ArrayList<Question> getQues() {
        return Ques;
    }
    
    public Exam() {
        Ques = new ArrayList<Question>();
        
    }

    /**
     *
     * @param id exam id taken from instructor
     * @param Du duration of the exam
     * @param TR the time at which the exam starts
     * @param date when the exam will be released
     * @param Que ArrayList of questions for the exam
     */
    public Exam(String id, int Du, String TR, Date date, ArrayList<Question> Que) {
        CourseID = id;
        Duration = Du;
        Timer_Realese = TR;
        Date = date;
        Ques = Que;
    }

    /**
     * A function that writes data into the question file
     *
     * @param str : string data about the exam
     * @param seperate a boolean declaring whether to put a line after that
     * string or no
     * @throws IOException
     */
    public static void FileWrite(String str, boolean seperate) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(new File("Ques.txt"), true);
        byte[] strToBytes = str.getBytes();
        String deli = "@";
        byte[] deliToBytes = deli.getBytes();
        outputStream.write(strToBytes);
        outputStream.write(deliToBytes);
        if (seperate) {
            String delimiter = System.getProperty("line.separator");
            outputStream.write(delimiter.getBytes());
        }
        outputStream.flush();
        outputStream.close();
    }

    /**
     * A function that checks whether the exam id is unique or not
     *
     * @param ExamID taken from combo box
     * @return a boolean true if exam id exists in file, false if not
     */
    public static boolean checkIDS(String ExamID) {
        ArrayList<Exam> Exams = new ArrayList<Exam>();
        String[] exams = ExamSession.Spliting();
        boolean check = false;
        
        for (int i = 0; i < exams.length; i++) {
            Exams.add(ExamSession.Get_ExamInfo(exams[i]));
        }
        for (int i = 0; i < Exams.size(); i++) {
            if (ExamID.equals(Exams.get(i).getExamID())) {
                check = true;
            }
        }
        return check;
    }
    /**
     * A function that writes the each exam submitted in a different file 
     * @param ExamID entered by the instructor to be written in EXAMIDS file
     */   
    public static void ExamIDs(String ExamID) {
        try {
            FileOutputStream out = new FileOutputStream(new File("ExamIDs.txt"), true);
            byte[] strToBytes = ExamID.getBytes();
            out.write(strToBytes);
            String delimiter = System.getProperty("line.separator");
            
            out.write(delimiter.getBytes());
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
