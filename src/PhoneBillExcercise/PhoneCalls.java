package PhoneBillExcercise;

public class PhoneCalls implements BillAction {
    private double callPrice;
    public PhoneCalls(Double callPrice){
    this.callPrice=callPrice;
    }
    @Override
    public double totalCost() {
        return callPrice;
    }
}
