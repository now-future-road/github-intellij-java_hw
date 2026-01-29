package Task9;

public class CguRequisition extends RequisitionWithPhone {
    public String requestedSubscriptionType;
    public String language;

    // Add this no-argument constructor
    public CguRequisition() {
        super();
        this.requestedSubscriptionType = "";
        this.language = "";
    }

    // Copy constructor (for cloning)
    public CguRequisition(CguRequisition cg) {
        super(cg);
        this.requestedSubscriptionType = cg.requestedSubscriptionType;
        this.language = cg.language;
    }

    @Override
    public CguRequisition clone() {
        return new CguRequisition(this);
    }
}