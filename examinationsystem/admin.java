package examinationsystem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class admin extends User {

    private int ID;
    private String Uname;
    private String PW;

    public admin() {
        Uname = "admin";
        PW = "admin";
    }

    public boolean LogInAdmin(String User_name, String Pass_word) {
        if (Uname.equals(User_name) && PW.equals(Pass_word)) {
            return true;
        }
        return false;
    }
    /**
       * this function Assigns for Students and instructors their courses when a new user register.
       * @param name the name of the user from register function in user class   
       * @param phone the phone of the user from register function in user class  
       * @param address the Address of the user from register function in user class 
       * @param email the e-mail of the user from register function in user class 
       * @param age the age of the user from register function in user class 
       * @param username the User name of the user from register function in user class 
       * @param password the password of the user from register function in user class 
       * @param Filename the file name to know whether the new user is a student or instructor 
       * @param coursesArr stores the courses was assigned for that user through the administrator 
       */
    public void Register(String name, String phone, String address, String email, String age, String username, String password, String Filename, ArrayList<String> coursesArr) throws Throwable{
        try {
            if(coursesArr.size() == 0)
            {
                throw new Throwable();
            }
            FileOutputStream outputStream = new FileOutputStream(new File(Filename), true);
            byte[] strToBytes = name.getBytes();
            byte[] phoneToBytes = phone.getBytes();
            byte[] addToBytes = address.getBytes();
            byte[] emailToBytes = email.getBytes();
            byte[] ageToBytes = age.getBytes();
            byte[] userToBytes = username.getBytes();
            byte[] passToBytes = password.getBytes();
            String deli = "|";
            byte[] deliToBytes = deli.getBytes();
            outputStream.write(userToBytes);
            outputStream.write(deliToBytes);
            outputStream.write(passToBytes);
            outputStream.write(deliToBytes);
            outputStream.write(strToBytes);
            outputStream.write(deliToBytes);
            outputStream.write(phoneToBytes);
            outputStream.write(deliToBytes);
            outputStream.write(addToBytes);
            outputStream.write(deliToBytes);
            outputStream.write(emailToBytes);
            outputStream.write(deliToBytes);
            outputStream.write(ageToBytes);
            outputStream.write(deliToBytes);
            for (int i = 0; i < coursesArr.size(); i++) {
                byte[] CourseToBytes = coursesArr.get(i).getBytes();
                outputStream.write(CourseToBytes);
                outputStream.write(deliToBytes);
            }
            String delimiter = System.getProperty("line.separator");
            outputStream.write(delimiter.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("examinationsystem.admin.Register()");
        }

    }

}
