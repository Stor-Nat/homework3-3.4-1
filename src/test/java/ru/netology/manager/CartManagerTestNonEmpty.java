package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.*;

public class CartManagerTestNonEmpty {   // Тест менеджера корзина не пустая
    CartManager manager = new CartManager();

    @Test
    public void shouldAddMovie() {

        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
        PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
        PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
        PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturn() {

        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
        PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
        PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
        PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", 1, 1);
        PurchaseItem fifth = new PurchaseItem(5, 5, "fifth", 1, 1);
        PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", 1, 1);
        PurchaseItem seventh = new PurchaseItem(7, 7, "seventh", 1, 1);
        PurchaseItem eighth = new PurchaseItem(8, 8, "eighth", 1, 1);
        PurchaseItem ninth = new PurchaseItem(9, 9, "ninth", 1, 1);
        PurchaseItem tenth = new PurchaseItem(10, 10, "tenth", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.return10(5);
//        manager.getAll(return10);

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, actual);
    }

}