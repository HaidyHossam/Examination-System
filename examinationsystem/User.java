package examinationsystem;


import java.io.*;
import java.util.regex.Pattern;

public class User {

    public User() {
    }
    private String name;
    private String phoneins;
    private String addressins;
    private String emailins;
    private String UserName;
    private String Password;
    private String Age;

    public String getName() {
        return name;
    }

    public String getPhoneins() {
        return phoneins;
    }

    public String getAddressins() {
        return addressins;
    }

    public String getEmailins() {
        return emailins;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getAge() {
        return Age;
    }

    /**
     * Login function read username and password from file and checked if them
     * correct to login
     * @param User_name username of student or instructor that will entered and
     * compared username with the username in file to login
     * @param Pass_word password of student or instructor that will entered and
     * compared password with the password in file to login
     * @param filename filename of student or instructor that contains
     * information about them
     * @return return true if username in file equal the username that is
     * entered and return true if password in file equal the password that is
     * entered
     */
    public boolean LogIn(String User_name, String Pass_word, String filename) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String arr[] = line.split(Pattern.quote("|"));
                if (arr[0].equals(User_name) && arr[1].equals(Pass_word)) {
                    UserName = arr[0];
                    Password = arr[1];
                    name = arr[2];
                    phoneins = arr[3];
                    addressins = arr[4];
                    emailins = arr[5];
                    Age = arr[6];
                    return true;
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO error");
        }
        return false;
    }

    /**
     * function to check in the file if the user name of the new user who wants
     * to sign up is unique or not and if it is unique it calls the register
     * function to save his info
     *
     * @param name is the name that the user enter in the name text box
     * @param phone is the phone that the user enter in the phone text box
     * @param address is the address that the user enter in the address text box
     * @param age is the age that the user enter in the age text box
     * @param username is the username that the user enter in the username text
     * box and it must be unique
     * @param password is the password that the user enter in the password text
     * box
     * @param Filename is the file name of the file that saved in it the info of
     * student or instructor to check the username is unique or not
     * @param filename is the file name of the notification file that gives a
     * notification that a new user signed up
     * @return true if the given user name is unique and false if not
     */
    public boolean CheckUserName(String name, String phone, String address, String email, String age, String username, String password, String Filename, String filename) {
        try {
            String Type = "";
            if (Filename.equals("Students.txt")) {
                Type = "S";
            } else if (Filename.equals("Instructors.txt")) {
                Type = "I";
            }
            File f = new File(Filename);
            if (f.exists()) {
                BufferedReader br = null;
                br = new BufferedReader(new FileReader(Filename));
                String line = br.readLine();
                boolean isexist = false;
                while (line != null) {

                    String arr[] = line.split(Pattern.quote("|"));
                    if (arr[0].equals(username)) {
                        return false;
                    } else {
                        isexist = true;
                    }
                    line = br.readLine();
                }
                if (isexist == true) {
                    Register(name, phone, address, email, age, username, password, filename, Type);
                }
                br.close();
            } else {
                Register(name, phone, address, email, age, username, password, filename, Type);
                return true;
            }
        } catch (IOException e) {
            System.out.println("IO Error");
        }
        return true;
    }

    /**
     * A function to check if the email the new user enter in the text box is
     * written in a right way or not
     *
     * @param email is the email the user enter in the email text box
     * @return true if the email is written in right way and false if not
     */
    public boolean CheckEmail(String email) {
        if (email.contains("@") && email.contains(".com")) {
            return true;

        }
        return false;
    }

    /**
     * A function to save the new user info in a notification file that will be
     * saved in the permanent file after assigning courses to him
     *
     * @param name is the name that the user enter in the name text box
     * @param phone is the phone that the user enter in the phone text box
     * @param address is the address that the user enter in the address text box
     * @param email is the email that the user enter in the email text box
     * @param age is the age that the user enter in the age text box
     * @param username is the username that the user enter in the username text
     * box and it must be unique
     * @param password is the password that the user enter in the password text
     * box
     * @param Filename is the file name of the notification file that gives a
     * notification that a new user signed up
     * @param Type is the type of user (Student or Instructor)
     * @throws IOException is exception thrown if the file does not exist
     */
    public void Register(String name, String phone, String address, String email, String age, String username, String password, String Filename, String Type) throws IOException {

        FileOutputStream outputStream = new FileOutputStream(new File(Filename), true);
        byte[] strToBytes = name.getBytes();
        byte[] phoneToBytes = phone.getBytes();
        byte[] addToBytes = address.getBytes();
        byte[] emailToBytes = email.getBytes();
        byte[] ageToBytes = age.getBytes();
        byte[] userToBytes = username.getBytes();
        byte[] passToBytes = password.getBytes();
        byte[] typeToBytes = Type.getBytes();
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
        outputStream.write(typeToBytes);
        outputStream.write(deliToBytes);
        String delimiter = System.getProperty("line.separator");
        byte[] Delimeter = delimiter.getBytes();
        outputStream.write(Delimeter);
        outputStream.flush();
        outputStream.close();

    }

}
