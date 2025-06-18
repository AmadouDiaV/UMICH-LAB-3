public class PriceObserver implements OrderObserver{
    public void update(Order order) {
        if(order.getItemCost() > 200){
            order.setItemCost(order.getItemCost() - 20);
            System.out.println("[Price Observer] : Price updated");
        }

    }
}
