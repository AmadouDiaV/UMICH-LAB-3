public class QuantityObserver implements OrderObserver {
    public void update(Order order) {
        if(order.getItemCount() > 5){
            order.setShippingCost(0);
            System.out.println("[QuantityObserver] : shipping cost updated");
        }
    }
}
