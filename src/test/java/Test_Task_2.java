import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.java3.lesson6.Task_2;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
@RunWith(Parameterized.class)
public class Test_Task_2 {
    private static final Logger log = LoggerFactory.getLogger(Task_2.class);

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,5,4,3,7,2}, new int[]{1,7}, "Case 1"},
                {new int[]{7,3,5,8,2,1}, new int[]{1,3}, "Case 2"},
                {new int[]{4,2,9}, new int[]{2,9}, "Case 3"}
        });
    }

    private int[] arrOriginal;
    private int[] arrExpected;
    private String message;

    public Test_Task_2(int[] arrOriginal, int[] arrExpected, String message) {
        this.arrOriginal = arrOriginal;
        this.arrExpected = arrExpected;
        this.message = message;
    }

    @Test
    public void task1() {
        log.info(message+": отправили массив: " + Arrays.toString(arrOriginal) +" получили массив: " + Arrays.toString(arrExpected));
        assertArrayEquals("Заданный нами массив должен совпадать с полученным", arrExpected, Task_2.process(arrOriginal));
    }

    @Test(expected = RuntimeException.class)
    public void testExceptionTask1() {
        log.info("Тест на появление RuntimeException");
        Task_2.process(new int[]{1,2,3});
    }
}
