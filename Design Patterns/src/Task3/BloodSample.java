package Task3;

public class BloodSample {
    private final User user;
    private final BloodType bloodType;
    private final RhFactor rhFactor;

    public BloodSample(int id, String FirstName,String lastName, Object photo, BloodType bloodType, RhFactor rhFactor){
        this.user = new User(id,FirstName,lastName,photo);
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    public User getUser() {
        return user;
    }
    public BloodType getBloodType(){
        return bloodType;
    }
    public RhFactor getRhFactor(){
        return rhFactor;
    }
    @Override
    public String toString(){
        return user + ",type: " + bloodType +",factor: " + rhFactor;
    }
    public enum BloodType{
        A,B,AB,O
    }
    public enum RhFactor{
        POSITIVE,NEGATIVE
    }
    public BloodSimple GetById(int id){
        if(db !=null){
            return db.GetById(id);

        }
        return denied;
        public BloodSample find(String query){
            if(db != null){
                return db.find(query);

            }
            return denied;
        }
    }


}
