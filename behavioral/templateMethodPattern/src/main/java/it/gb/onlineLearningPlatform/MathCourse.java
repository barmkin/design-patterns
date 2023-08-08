package it.gb.onlineLearningPlatform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MathCourse extends Course {

    Map<String, Float> courseCompletions;

    public MathCourse() {
        super();
        this.courseStudents = new ArrayList<String>(); // Can enroll more than once (exercise reason...)
        this.courseCompletions = new HashMap<String, Float>();
    }

    @Override
    protected boolean checkStudentCanEnroll(String studentId) {
        if (!this.courseStudents.contains(studentId)) {
            this.courseCompletions.put(studentId, 75f); // face-to-face lessons do not count
        }

        return true;
    }

    @Override
    protected void contentDeliveryMethod() {
        System.out.println(" - Math Course - ");
        System.out.println("\t75% Face-to-face lessons");
        System.out.println("\t25% Online lessons");

        // Increase course completion by 5 for all active students
        for (String student : courseStudents) {
            this.courseCompletions.replace(
                    student,
                    this.courseCompletions.get(student),
                    (this.courseCompletions.get(student) + 5f));
        }
    }

    @Override
    protected void doCourseAssessment(String studentId) {
        // Cannot do if completion less than 100%
        if (this.getCourseCompletionStatus(studentId) >= 100f) {
            System.out.println(studentId + " - Math Course Assessment - ");
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
