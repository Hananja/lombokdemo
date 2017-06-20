package de.szut.loos.lombokdemo;

import lombok.Getter;
import lombok.Setter;

public class LombokBean {

    @Getter @Setter
    private String text;

    @Getter @Setter
    private int number = 0;
}
