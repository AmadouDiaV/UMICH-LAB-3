import java.util.ArrayList;

public class Order {
    private int itemCount;
    private double itemCost;
    private double shippingCost;
    private double total;
    private int id;

    private ArrayList<OrderObserver> Observers;

    public Order(int id){
        this.id = id;
        this.itemCount = 0;
        this.itemCost = 0;
        this.shippingCost = 10;
        this.total = 0;
        this.Observers = new ArrayList<OrderObserver>();
    }

    public void attach(OrderObserver o){
        this.Observers.add(o);
    }

    public void detach(OrderObserver o){
        this.Observers.remove(o);
    }

    public void setItemCount(int itemCount){
        this.itemCount = itemCount;
    }

    public void setItemCost(double itemCost){
        this.itemCost = itemCost;
    }

    public void setShippingCost(double shippingCost){
        this.shippingCost = shippingCost;
    }


    public int getItemCount(){
        return this.itemCount;
    }

    public double getItemCost(){
        return this.itemCost;
    }

    public double getShippingCost(){
        return this.shippingCost;
    }

    public double getTotalPrice(){
        return this.itemCost + this.shippingCost;
    }

    public void addItem(double price, int quantity){
        this.itemCount += quantity;
        this.itemCost += price * quantity;
        this.notifyObservers();
    }

    public void notifyObservers(){
        for(OrderObserver os : Observers){
            os.update(this);
        }
    }

    public String toString(){
        return "[Order] : ItemCount : " + this.itemCount + " Total : " + this.itemCost + " Shipping : " + this.shippingCost;
    }
}
