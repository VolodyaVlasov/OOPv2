package com.company;

public class University {
    private String name;
    private AbstractStudent[] students;


    private abstract static class AbstractStudent {
        final String name;
        final int yearOfStart;

        public AbstractStudent(final String name, int yearOfStart) {
            this.name = name;
            this.yearOfStart = yearOfStart;
        }
    }

    private static class philosophyStudent extends AbstractStudent {

        public philosophyStudent(String name, int yearOfStart) {
            super(name, yearOfStart);
        }
    }

    private static class psychologyStudent extends AbstractStudent {

        public psychologyStudent(String name, int yearOfStart) {
            super(name, yearOfStart);
        }
    }
}
