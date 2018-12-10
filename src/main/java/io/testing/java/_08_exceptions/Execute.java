package io.testing.java._08_exceptions;

import io.testing.java._08_exceptions.exceptions.WrongLetterException;
import io.testing.java._08_exceptions.exceptions.WrongNumberException;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Execute {

    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while(!s.equals("0")) {
            try {
                if (StringUtils.isNumeric(s)) {
                    throw new WrongNumberException();
                }

                if (StringUtils.isAlpha(s)) {
                    throw new WrongLetterException();
                }

            } catch (WrongLetterException e) {
                e.printStackTrace();
            } catch (WrongNumberException e) {
                e.printStackTrace();
            }
            s = scanner.nextLine();
        }
    }

}
