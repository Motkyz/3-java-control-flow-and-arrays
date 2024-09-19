package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        System.out.println(getSeason(12));
    }

    static String getSeason(int monthNumber) {
        return (monthNumber/3+1 == 1 || monthNumber == 12) ? "зима" : monthNumber/3+1 == 2 ? "весна" : monthNumber/3+1 == 3 ? "лето" : "осень";
    }
}