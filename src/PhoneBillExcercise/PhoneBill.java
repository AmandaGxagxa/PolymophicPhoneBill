package PhoneBillExcercise;

public class PhoneBill {
    double totalBill;
    public void accept(BillAction billAction){
        totalBill += billAction.totalCost();
    }
    public double total(){
        return totalBill;
    }

    public static void main(String[] args) {
        DataBundles dataBundles = new DataBundles(200);

       System.out.println(dataBundles.getMegabytesPrice());

    }
}