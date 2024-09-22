package weeklyquiz.product;

public class Product implements Promotion{

    String name;
    int price;
    int weight;

    public int getDiscountAmount(){
        if(name.equals("beauty")) {
            return 10000;
        } else if(name.equals("Grocery")){
            return 2000;
        } return 0;
    }

    Product (String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    int getPrice() {
        return price;
    }

    int getWeight() {
        return weight;
    }
}
