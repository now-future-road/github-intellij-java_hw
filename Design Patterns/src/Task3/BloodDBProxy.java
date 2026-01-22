package Task3;
import java.util.Scanner;

import java.util.Scanner;

public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    BloodDBProxy(SecuritySystem security){
        this.security = security;
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        if(security.authorize(username,password)){
            this.db = new BloodDB();
        }


    }
}

