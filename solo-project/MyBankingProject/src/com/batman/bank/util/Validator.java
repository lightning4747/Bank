package com.batman.bank.util;
import java.util.regex.Pattern;

public class Validator {
      // Username: 3–20 chars, letters, numbers, underscores
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{3,20}$");

    // Email: basic RFC pattern
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

    // Password: min 8 chars, at least 1 uppercase, 1 lowercase, 1 digit, 1 special char
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
        "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"
    );

    public static boolean isvalidusername(String username) {
        return username!=null && USERNAME_PATTERN.matcher(username).matches();

    }
    public static boolean isvalidpassword(String password) {
        return password != null && PASSWORD_PATTERN.matcher(password).matches();
    }
    public static boolean isvalidmail(String mail) {
        return mail != null && EMAIL_PATTERN.matcher(mail).matches();
    }

}
