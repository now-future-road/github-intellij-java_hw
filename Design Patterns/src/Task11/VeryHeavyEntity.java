package Task11;

import Task11.Entity;

import java.util.concurrent.TimeUnit;

public class VeryHeavyEntity implements Entity {
    private int id;

    public VeryHeavyEntity(int id) {
        this.id = id;
        // Simulating long creation time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("VeryHeavyEntity created with id: " + id);
    }


    public int getId() {
        return id;
    }


    public int getid() {
        return 0;
    }


    public String find(String query) {
        return "Result for: " + query;
    }
}