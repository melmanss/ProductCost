package app;

// Клас розрахунку вартості товару, враховуючи вартість доставки
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private final static double deliveryPrice = 7.0; // Встановлюємо значення доставки

    // Розрахунок вартості товару, з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice; // Викликаємо метод базового класу
    }
}
