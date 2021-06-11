package oop.objectreferences;

public class Duke {

    int preferredJavaVersion;

    public static void main(String[] args) {

        Duke duke = new Duke();
        duke.preferredJavaVersion = 11;

        Duke alternativeDuke = duke;
        alternativeDuke.preferredJavaVersion = 15;

        System.out.println(duke.preferredJavaVersion);
        System.out.println(alternativeDuke.preferredJavaVersion);

    }
}
