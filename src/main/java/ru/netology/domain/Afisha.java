package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Afisha {
    private int id;
    private int filmId;
    private String filmTitle;
    private int filmGenre;
    private int count;
}
