package PhoneBillExcercise;

public class PhoneCall implements BillAction {
    private double callPrice;
    public PhoneCall(double callPrice){
    this.callPrice=callPrice;
    }
    @Override
    public double totalCost() {
        return callPrice;
    }


}
