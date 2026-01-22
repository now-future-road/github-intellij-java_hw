package Task7.developers;

public class KotlinDeveloper extends JavaDeveloper {
    @Override
    public void study() {
        super.study();
        System.out.println("Learning kotlin features...");
        writeCode();
    }
}