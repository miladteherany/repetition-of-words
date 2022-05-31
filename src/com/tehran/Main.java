package com.tehran;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);
        String words[] = str.split(" ");
        int count;
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = 1 + i; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i] + " " + count + " repeated");
            }
        }
    }
}
