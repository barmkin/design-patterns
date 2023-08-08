package it.gb.onlineLearningPlatform;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ProgrammingCourse extends Course {

    Map<String, Float> courseCompletions;

    public ProgrammingCourse() {
        super();
        this.courseStudents = new HashSet<String>(); // Cannot enroll more than once
        this.courseCompletions = new HashMap<String, Float>();
    }

    @Override
    protected boolean checkStudentCanEnroll(String studentId) {
        if (this.courseStudents.contains(studentId)) {
            return false;
        } else {
            // Add course completion for valid studentIds...
            this.courseCompletions.put(studentId, 10f); // face-to-face lessons do not count
            return true;
        }
    }

    @Override
    protected void contentDeliveryMethod() {
        System.out.println(" - Programming Course - ");
        System.out.println("\t70% Online lessons");
        System.out.println("\t20% Laboratory lessons");
        System.out.println("\t10% Face-to-face lessons");

        // Increase course completion by 10 for all active students
        for (String student : courseStudents) {
            this.courseCompletions.replace(
                    student,
                    this.courseCompletions.get(student),
                    (this.courseCompletions.get(student) + 10f));
        }
    }

    @Override
    protected void doCourseAssessment(String studentId) {
        // Cannot do if completion less than 70%
        if (this.getCourseCompletionStatus(studentId) > 70f) {
            System.out.println(studentId + " - Programming Course Assessment - ");
            System.out.println("\tQuestion #1");
            System.out.println("\tQuestion #2");
            System.out.println("\tQuestion #3");
        } else {
            System.err.println(studentId + " cannot access to course assessment!");
        }
    }

    @Override
    protected float getCourseCompletionStatus(String studentId) {
        return this.courseCompletions.get(studentId);
    }

}
