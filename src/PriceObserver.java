import java.util.ArrayList;

public class PriceObserver implements OrderObserver{
    // Maybe not a good practice but I put every order id on a arrayList to avoid repetition of the discount everytime
    private ArrayList<Integer> flags = new ArrayList<>();
    public void update(Order order) {
        if(order.getItemCost() > 200 && !flags.contains(order.getId())){
            order.setItemCost(order.getItemCost() - 20);
            flags.add(order.getId());
            System.out.println("[Price Observer] : Price updated");
        }

    }
}
