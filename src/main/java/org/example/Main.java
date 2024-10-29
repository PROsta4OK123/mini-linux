package org.example;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String defaultAccessRights = "0000";
        while (true) {
            String command = scanner.nextLine();
            String[] commandQueue = command.split(" ");
            if (commandQueue.length > 2 || commandQueue.length < 1) {
                System.out.println("Invalid command");
                continue;
            }
            if (commandQueue[0].equals("ls") && commandQueue.length == 1) {
                System.out.println(defaultAccessRights);
            } else if (commandQueue.length == 2 && commandQueue[0].equals("chmod")) {
                if (commandQueue[1].length() == 4 && StringUtils.isNumeric(commandQueue[1])) {
                    if (Integer.parseInt(commandQueue[1]) < 7777 && Integer.parseInt(commandQueue[1]) > 0) {
                        defaultAccessRights = commandQueue[1];
                    }{
                        System.out.println("invalid command");
                    }
                } else {
                    System.out.println("invalid command");
                }
            } else {
                System.out.println("invalid command");
            }
        }
    }
}