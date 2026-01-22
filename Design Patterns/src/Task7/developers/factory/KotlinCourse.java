package Task7.developers.factory;

import Task7.developers.Developer;
import Task7.developers.KotlinDeveloper;
import Task7.developers.factory.ProgrammingCourse;

public class KotlinCourse extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}