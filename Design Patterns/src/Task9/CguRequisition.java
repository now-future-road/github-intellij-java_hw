package Task9;

public class CguRequisition extends RequisitionWithPhone {
    public String requestedSubscriptionType;
    public String language;

    public CguRequisition(CguRequisition cg){
        super(cg);
        this.requestedSubscriptionType = cg.requestedSubscriptionType;
        this.language = cg.language;
    }
    public CguRequisition clone(){
        return new CguRequisition(this);
    }
}

