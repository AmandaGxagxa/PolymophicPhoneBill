package PhoneBillExcercise;

public class PhoneBill {
    double totalBill;
    public void accept(final BillAction billAction) {
        totalBill += billAction.totalCost();
    }

    public double total() {
        return totalBill;
    }

    public static void main(final String[] args) {
      final DataBundles dataBundles = new DataBundles(200);
        final BillAction phoneCall = new PhoneCall(200);
        final PhoneBill phoneBill = new PhoneBill();
        final SMSBundles smsBundles = new SMSBundles(12.5, 15);
        dataBundles.setMegabytesPrice(502);
        phoneBill.accept(phoneCall);
        phoneBill.accept(dataBundles);
        phoneBill.accept(smsBundles);
       System.out.println(phoneBill.total());

    }
}