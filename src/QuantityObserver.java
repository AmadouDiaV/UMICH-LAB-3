import java.util.ArrayList;

public class QuantityObserver implements OrderObserver {
    // Maybe not a good practice but I put every order id on a arrayList to avoid repetition of the discount everytime
    private ArrayList<Integer> flags = new ArrayList<>();
    public void update(Order order) {
        if(order.getItemCount() > 5 && !flags.contains(order.getId())){
            order.setShippingCost(0);
            flags.add(order.getId());
            System.out.println("[QuantityObserver] : shipping cost updated");
        }
    }
}
