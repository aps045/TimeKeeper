package main;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Time :");
        TimeKeeper timeKeeper = new TimeKeeper(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(timeKeeper);
    }
}