package examinationsystem;

import java.util.*;
/**
 * Class with anything related to a question setting it and checking
 * @author hp
 */
public class Question {

    private String Qnum;
    private String Qcontent;
    private String CorrectChoice;
    private int Grade;
    private Double EvaluationRank;
    private Map<String, String> ListOfChoises;
    /**
     * Constructor
     * @param num number of question
     * @param content content of the question
     * @param CorrectChoice the correct choice set by the instructor
     * @param ListOfChoices the list of choices to be given to the student to choose from
     */

    public Question(String num, String content, String CorrectChoice, Map<String, String> ListOfChoices) {
        Qnum = num;
        Qcontent = content;
        this.CorrectChoice = CorrectChoice;
        this.ListOfChoises = ListOfChoices;
        Grade = 1;
    }

    public String getQnum() {
        return Qnum;
    }

    public String getQcontent() {
        return Qcontent;
    }

    public String getCorrectChoice() {
        return CorrectChoice;
    }

    public Map<String, String> getListOfChoises() {
        return ListOfChoises;
    }

    public void SetChoise(String ChoiceLetter, String Choice) {
        ListOfChoises.put(ChoiceLetter, Choice);
    }

    public void setCorrectChoice(String CorrectChoice) {
        this.CorrectChoice = CorrectChoice;
    }

    public int getGrade() {
        return Grade;
    }

    public Double getEvaluationRank() {
        return EvaluationRank;
    }

    /**
     * A functions that checks student's answers
     *
     * @param choice : string taken from user checks whether the answer is wrong
     * or right
     * @return Boolean true if answer is right and false if wrong
     */
    public boolean CheckCorrect(String choice) {
        if (CorrectChoice.equals(choice)) {
            return true;
        } else {
            return false;
        }
    }

}
