package Task8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import Task8.factories.DeveloperCourse;
import Task8.juniors.JuniorDeveloper;
import Task8.middle.MiddleDeveloper;
import Task8.seniors.SeniorDeveloper;

public class Team {
    private final DeveloperCourse course;

    private final Set<SeniorDeveloper> seniors = new HashSet<>();
    private final Set<MiddleDeveloper> middles = new HashSet<>();
    private final Set<JuniorDeveloper> juniors = new HashSet<>();

    public Team(DeveloperCourse course) {
        this.course = course;
    }

    public void hireSeniors(int count) {
        for (int i = 0; i < count; i++) {
            seniors.add(course.createSenior());
        }
    }

    public void hireMiddles(int count) {
        for (int i = 0; i < count; i++) {
            middles.add(course.createMiddle());
        }
    }

    public void hireJuniors(int count) {
        for (int i = 0; i < count; i++) {
            juniors.add(course.createJunior());
        }
    }

    public void produceCode() {

        seniors.forEach(SeniorDeveloper::designArchitecture);
        middles.forEach(MiddleDeveloper::writeNewModule);
        juniors.forEach(JuniorDeveloper::fixBugs);
    }
}