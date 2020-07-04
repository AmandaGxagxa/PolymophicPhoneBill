package PhoneBillExcercise;

public class SMSBundles implements  BillAction {
    private double smsPrice;
    private int qty;
    public SMSBundles(double smsPrice,int qty){
        this.smsPrice=smsPrice;
        this.qty= qty;
    }

    @Override
    public double totalCost( ) {
        return smsPrice;
    }
}
