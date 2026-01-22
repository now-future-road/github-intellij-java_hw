package Task7.developers.factory;

import Task7.developers.Developer;
import Task7.developers.DotNetDeveloper;

public class DotNetCourse extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper();
    }
}