package io.jenkins.tools;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class MainTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() throws InterruptedException {
        Integer it = Integer.getInteger("iterations");
        if (it == null) {
            assertTrue(false);
        }
        if (it != null) {
            for (int i = 0; i < it; i++) {
                Thread.sleep(1000);
                System.out.println("Iteration " + i);
            }
            return;
        }
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void anotherTest() throws InterruptedException {
        Integer it = Integer.getInteger("iterations");
        if (it == null) {
            assertTrue(false);
        }
        if (it != null) {
            for (int i = 0; i < it; i++) {
                Thread.sleep(1000);
                System.out.println("Iteration " + i);
            }
            return;
        }
    }

}
