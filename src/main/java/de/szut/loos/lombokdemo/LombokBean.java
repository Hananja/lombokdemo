package de.szut.loos.lombokdemo;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

public class LombokBean implements Serializable {

    @Getter @Setter
    private String text;

    @Getter @Setter
    private int number = 0;
}
