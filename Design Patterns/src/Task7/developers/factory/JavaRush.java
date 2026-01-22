package Task7.developers.factory;

import Task7.developers.Developer;
import Task7.developers.JavaDeveloper;

public class JavaRush extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}