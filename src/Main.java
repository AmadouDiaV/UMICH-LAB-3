//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();

        Order o1 = new Order(1);

        o1.attach(priceObserver);
        o1.attach(quantityObserver);

        System.out.println("[Main]: " + o1);
        o1.addItem(30, 2);
        System.out.println("[Main]: " + o1);
        o1.addItem(242, 1);
        // We should have a 20$ discount
        System.out.println("[Main]: " + o1);

        o1.addItem(1, 3);
        // We should have a 10$ shipping discount and discound should be at 0
        System.out.println("[Main]: " + o1);

    }
}