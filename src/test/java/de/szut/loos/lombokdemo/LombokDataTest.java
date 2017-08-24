package de.szut.loos.lombokdemo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LombokDataTest {

    @Test
    public void testBean() {
        LombokDataBean bean = new LombokDataBean();
        bean.setText("test");
        bean.setNumber(-1);
        assertThat("String nicht korrekt", bean.getText(), is("test"));
        assertThat("int nicht korrekt", bean.getNumber(), is(-1));
        assertNotNull("kein toString()", bean.toString());

        LombokDataBean beaneq = new LombokDataBean();
        beaneq.setText("test");
        beaneq.setNumber(-1);
        assertEquals("Beide sind nicht gleich", bean, beaneq);

        LombokDataBean beanneq = new LombokDataBean();
        beanneq.setText("test");
        beanneq.setNumber(1);
        assertNotEquals("Beide sind gleich", bean, beanneq);

        System.out.println(bean.toString());

    }
}
