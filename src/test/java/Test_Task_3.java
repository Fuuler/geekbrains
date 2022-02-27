import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.java3.lesson6.Task_3;

import static junit.framework.TestCase.assertTrue;

public class Test_Task_3 {
    private static final Logger log = LoggerFactory.getLogger(Test_Task_3.class);

    @Test
    public void testTask2AnotherDigits() {
        assertTrue("В массиве есть другие цифры", Task_3.process(new int[]{1, 1, 4, 1, 4, 4, 1, 1, 4}));
        log.info("Массив только из 1 и 4");
    }

    @Test(expected = RuntimeException.class)
    public void testTask2Only1And4() {
        Assert.assertFalse("В массиве только 1 и 4", Task_3.process(new int[]{1, 4, 2}));
        log.info("В массиве не только 1 и 4");
    }

    @Test(timeout = 1000)
    public void testTask2LongWait() {
        int[] data = new int[900000];
        data[0] = 1;
        data[1] = 1;
        for (int i = 2; i < data.length; i++) {
            final double sin = Math.sin(i);
            data[i] = sin > 0.5 ? 1 : 4;
        }
        Assert.assertTrue("Ошибка", Task_3.process(data));
    }

    @Test
    public void testTask2contains1() {
        Assert.assertFalse("В массиве есть 1", Task_3.process(new int[]{4,4,4,4,4}));
        log.info("Массив только из 4");
    }

    @Test
    public void testTask2contains4() {
        Assert.assertFalse("В массиве есть 4", Task_3.process(new int[]{1,1,1,1,1}));
        log.info("Массив только из 1");
    }
}
