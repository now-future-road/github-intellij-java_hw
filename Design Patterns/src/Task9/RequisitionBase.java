package Task9;

public abstract class RequisitionBase extends AbstractEntity {
    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;

    public RequisitionBase(){}
    public RequisitionBase(RequisitionBase rq){
        super(rq);
        this.user = rq.user != null ? (User) rq.user.clone() : null;
        this.name = rq.name;
        this.mail = rq.mail;
        this.utmMark = rq.utmMark;
        this.webinarType = rq.webinarType;
        this.promoCode = rq.promoCode;

    }
}


