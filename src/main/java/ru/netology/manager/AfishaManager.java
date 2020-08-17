package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    private Afisha[] items = new Afisha[0];
    private int numberLast = 10;

    // добавление в массив
    public void add(Afisha item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        Afisha[] tmp = new Afisha[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    // создаем новый массив из n последних элементов
    public Afisha[] return10(int last) {
        Afisha[] result = new Afisha[last];
        if (last <=0) {
            return items;
        }
        if (last > numberLast) {
            return items;
        }
        if (last > items.length) {
            last = items.length;
            int x = items.length - last;
            System.arraycopy(items, x, result, 0, last);
            return items;
        }
        int x = items.length - last;
        System.arraycopy(items, x, result, 0, last);
        items = result;

        return items;
    }

    //  возвращаем прямой массив
    public Afisha[] getAll() {
        return items;
    }

    // возвращаем обратный массив-последний пришел, первый ушел
    public Afisha[] expandArray() {
        Afisha[] result2 = new Afisha[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result2[i] = items[index];
        }
        return result2;
    }

}
