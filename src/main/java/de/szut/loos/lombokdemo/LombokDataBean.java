package de.szut.loos.lombokdemo;

import lombok.Data;

import java.io.Serializable;

@Data
public class LombokDataBean implements Serializable {

    private String text;
    private int number = 0;
}
