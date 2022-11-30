public interface RetailItem {


    public  double getItemPrice();
}


class CD implements RetailItem{
 String title;
 String nameOfArts;
 double price;

    public CD() {
        this.title = title;
        this.nameOfArts = nameOfArts;
        this.price = price;
    }

    @Override
    public double getItemPrice() {
        System.out.println( price=100);
        return price;
    }
}
class main2{
    public static void main(String[] args) {
         RetailItem re=new CD();
         re.getItemPrice();

    }
}
