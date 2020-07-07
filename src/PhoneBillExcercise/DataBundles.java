package PhoneBillExcercise;

public class DataBundles implements  BillAction {
    int megabytes;
    double megabytesPrice;
    public  DataBundles(int megabytes){
        this.megabytes=megabytes;
    }
    public void setMegabytesPrice(double megabytesPrice){
        if(megabytes<=500 && megabytes >0) {
            megabytesPrice =0.75;
        }else if (megabytes>=500 && megabytes <= 1000 ){
            megabytesPrice = (megabytes * 0.55) ;
        }else if (megabytes > 1000 ){
            megabytesPrice =(megabytes * 0.35);
        }else {
            megabytesPrice = 0.0;
        }
    }

    public double getMegabytesPrice( ) {
        return megabytesPrice;
    }

    @Override
    public double totalCost( ) {
      return megabytesPrice;

    }
}
