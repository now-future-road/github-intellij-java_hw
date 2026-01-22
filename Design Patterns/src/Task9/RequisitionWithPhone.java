package Task9;

public abstract class RequisitionWithPhone extends RequisitionBase {
    public String phone;

    public RequisitionWithPhone(){};
    public RequisitionWithPhone(RequisitionWithPhone rp){
        super(rp);
        this.phone = rp.phone;
    }
}

