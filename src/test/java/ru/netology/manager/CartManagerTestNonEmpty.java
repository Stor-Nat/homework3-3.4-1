package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CartManagerTestNonEmpty {
//    int numbersFilms = 10;

    AfishaManager manager = new AfishaManager();

    Afisha first = new Afisha(1, 1, "first", 1, 1);
    Afisha second = new Afisha(2, 2, "second", 1, 1);
    Afisha third = new Afisha(3, 3, "third", 1, 1);
    Afisha fourth = new Afisha(4, 4, "fourth", 1, 1);
    Afisha fifth = new Afisha(5, 5, "fifth", 1, 1);
    Afisha sixth = new Afisha(6, 6, "sixth", 1, 1);
    Afisha seventh = new Afisha(7, 7, "seventh", 1, 1);
    Afisha eighth = new Afisha(8, 8, "eighth", 1, 1);
    Afisha ninth = new Afisha(9, 9, "ninth", 1, 1);
    Afisha tenth = new Afisha(10, 10, "tenth", 1, 1);


//  добавляем в массив
    @Test
    public void shouldAddMovie() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{first, second, third, fourth};

        assertArrayEquals(expected, actual);
    }

//  возврат массива из 5 последних
    @Test
    public void shouldReturn5() {

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

        Afisha[] actual = manager.expandArray();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, actual);
    }

    //  возврат массива из 10 последних
    @Test
    public void shouldReturn10() {

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

        manager.return10(10);

        Afisha[] actual = manager.expandArray();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    //  возврат массива из 15 последних
    @Test
    public void shouldReturn15() {

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

        manager.return10(15);

        Afisha[] actual = manager.expandArray();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    //  возврат массива из 0 последних
    @Test
    public void shouldReturn0() {

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

        manager.return10(0);

        Afisha[] actual = manager.expandArray();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    //  возврат массива из 10 последних, но в массиве 6 элементов
    //  возвращаем 6 элементов
    @Test
    public void shouldReturn6() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);

        manager.return10(10);

        Afisha[] actual = manager.expandArray();
        Afisha[] expected = new Afisha[]{sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}