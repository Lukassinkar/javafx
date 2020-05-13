package sample.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static final String USER_NAME_REGEX_PATTERN = "^[a-zA-z0-9]{5,12}$";
    public static final String USER_PASSWORD_REGEX_PATTERN = "^[a-zA-z0-9@!?_#&%.^]{5,12}$";
    public static final String USER_EMAIL_REGEX_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,50}$";
    public static final String TITLE_REGEX_PATTERN = "^[a-zA-Z0-9-_!@#$ ]{5,55}$";
    public static final String AUTHOR_REGEX_PATTERN = "^[a-zA-Z0-9 ]{5,55}$";

    public static boolean isValidUsername(String user_name) {
        Pattern pattern = Pattern.compile(USER_NAME_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(user_name);
        return matcher.find();
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(USER_PASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static boolean isValidEmail(String regEmail) {
        Pattern pattern = Pattern.compile(USER_EMAIL_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(regEmail);
        return matcher.find();
    }
}

