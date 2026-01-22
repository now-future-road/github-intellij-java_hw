package Task11;

public class LazyInitializer implements Entity {
    private static int id;
    private VeryHeavyEntity entity;

    public LazyInitializer(int id) {
        this.id = id;
    }
    public static int getid(){
        return LazyInitializer.getid();
    }

    public static void find(VeryHeavyEntity entity){

        if (entity == null) {
            entity = new VeryHeavyEntity();
        }
        return entity;
    }
    public static void main(){
        VeryHeavyEntity entity =  new LazyInitializer();
    }
}
