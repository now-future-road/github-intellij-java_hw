package Task3.blood;
import java.util.Scanner;
import Task3.BloodDB;
import Task3.SecuritySystem;
import Task3.BloodSample;
import java.util.List;
import java.util.Collections;


public class BloodDBProxy extends BloodDB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);



    BloodDBProxy() {
        this.security = new SecuritySystem();
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        String password = input.nextLine();

        security.authorize(username, password);

        if (security.isAuthorized()) {
            db = new BloodDB();
        }
    }
        public  BloodSample getById(int id){
            if(security.isAuthorized()){
                return db.getById(id);
            }else{
                return denied;
            }

        }
    public List<BloodSample> find(String request) {
        if (security.isAuthorized()) {
            return db.find(request);
        } else {
            return Collections.singletonList(denied);
        }
    }


    }


