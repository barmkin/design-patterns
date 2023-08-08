package it.gb.onlineLearningPlatform;

import java.util.Collection;

public abstract class Course {

    protected Collection<String> courseStudents;

    abstract protected boolean checkStudentCanEnroll(String studentId);

    abstract protected void contentDeliveryMethod();

    abstract protected void doCourseAssessment(String studentId);

    abstract protected float getCourseCompletionStatus(String studentId);

    private boolean checkStudentIsEnrolled(String studentId) {
        try {
            return courseStudents.contains(studentId);
        } catch (Exception e) {
            System.err.println("Please define the list of students");
        }
        return false;
    }

    public boolean enrollStudent(String studentId) {
        if (!this.checkStudentCanEnroll(studentId)) {
            System.err.println("Cannot enroll the student " + studentId);
            return false;
        }

        if (courseStudents == null) {
            System.err.println("Please define the list of students");
            return false;
        }

        if (this.checkStudentIsEnrolled(studentId)) {
            System.out.println("WARN - Student " + studentId + " already enrolled");
        }

        return courseStudents.add(studentId);
    }

    public void deliverContent() {
        this.contentDeliveryMethod();
    }

    public void conductAssessment(String studentId) {
        if (this.checkStudentIsEnrolled(studentId)) {
            this.doCourseAssessment(studentId);
        } else {
            System.err.println("This student cannot access the course assessment!");
        }
    }

    public float trackCompletion(String studentId) {
        if (this.checkStudentIsEnrolled(studentId)) {
            return this.getCourseCompletionStatus(studentId);
        } else {
            System.err.println("This student cannot access the course completion %!");
            return -0f;
        }
    }

}
