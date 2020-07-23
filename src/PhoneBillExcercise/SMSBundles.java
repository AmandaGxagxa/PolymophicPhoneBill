package PhoneBillExcercise;

public class SMSBundles implements  BillAction {
    private final double smsPrice;
    private final int qty;

    public SMSBundles(final double smsPrice, final int qty) {
        this.smsPrice=smsPrice;
        this.qty= qty;
    }

    @Override
    public double totalCost( ) {
        return smsPrice;
    }
}
