package bel.matvey.theme.conditional.Task_04;

import bel.matvey.theme.conditional.Task_04.Stock;
import bel.matvey.theme.conditional.Task_04.entity.Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GooG", 8);

        google.printInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.printInformation();
    }
}
