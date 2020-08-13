package ru.netology.manager;

import ru.netology.domain.PurchaseItem;

public class CartManager {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void add(PurchaseItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] return10(int quantity) {

        PurchaseItem[] result = new PurchaseItem[quantity];
        int x = items.length - quantity;
        System.arraycopy(items, x, result, 0, quantity);
        items = result;
        return result;
    }

    public PurchaseItem[] getAll() {
        PurchaseItem[] result2 = new PurchaseItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result2.length; i++) {
            int index = items.length - i - 1;
            result2[i] = items[index];
        }
        return result2;
    }


}
