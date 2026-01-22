package Task7;

import Task7.developers.factory.KotlinCourse;
import Task7.developers.factory.JavaRush;
import Task7.developers.factory.DotNetCourse;
import Task7.developers.factory.ProgrammingCourse;

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
