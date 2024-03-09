package src;

import java.util.ArrayList;

public class ShoppingCart {

    private int id;
    private float totalPrice;

    private ArrayList<CarItem> carItens;



    public ShoppingCart(int id, float totalPrice) {
        setId(id);
        setTotalPrice(totalPrice);
        carItens = new ArrayList<>();
    }

    public ArrayList<CarItem> getCarItem() {
        return carItens;
    }

    public void setCarItem(int id, int quantity, Product product) {
        this.carItens.add(new CarItem(id,quantity,product));
    }

    public ShoppingCart() {
        carItens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItem=" + carItens +
                '}';
    }
}
