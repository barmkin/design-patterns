package it.gb.onlineLearningPlatform;

public abstract class OnlineLearningPlatformApp {

    public static void executeOnlineLearningPlatformApp() {
        
        // Create courses
        Course programming101 = new ProgrammingCourse();
        Course math101 = new MathCourse();

        // Enroll some students
        programming101.enrollStudent("student1");
        programming101.enrollStudent("student2");
        programming101.enrollStudent("student1"); // try to enroll twice

        math101.enrollStudent("student1");
        math101.enrollStudent("student2");
        math101.enrollStudent("student1"); // try to enroll twice

        // deliver contents
        programming101.deliverContent();    
        math101.deliverContent();
        math101.deliverContent();
        math101.deliverContent();

        // get completions
        System.out.println("student1 on programming101 is at %" +
            programming101.getCourseCompletionStatus("student1"));
        System.out.println("student2 on programming101 is at %" +
            programming101.getCourseCompletionStatus("student2"));

        System.out.println("student1 (double enrollment) on math101 is at %" +
            math101.getCourseCompletionStatus("student1"));
        System.out.println("student2 on math101 is at %" +
            math101.getCourseCompletionStatus("student2"));

        // Try math tests
        math101.conductAssessment("student1");      
        math101.conductAssessment("student2");
    
    }

}
