package de.szut.loos.lombokdemo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LombokTest {

    @Test
    public void testBean() {
        LombokBean bean = new LombokBean();
        bean.setText("test");
        bean.setNumber(-1);

        assertThat("String nicht korrekt", bean.getText(), is("test"));
        assertThat("int nicht korrekt", bean.getNumber(), is(-1));
    }
}
