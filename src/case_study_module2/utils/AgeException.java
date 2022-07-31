package case_study_module2.utils;

import case_study_module2.models.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
