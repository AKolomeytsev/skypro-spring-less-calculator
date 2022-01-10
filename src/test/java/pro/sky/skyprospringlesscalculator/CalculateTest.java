package pro.sky.skyprospringlesscalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    private SumService sum;
    private MultiplicationService multiplication;
    private SubtractionService subtraction;
    private DivideService divide;
    private DivideService divide1;

    @BeforeEach
    public void settings(){
       sum  = new SumService(-1,1);
       multiplication = new MultiplicationService(10,100);
       subtraction = new SubtractionService(10,100);
       divide = new DivideService(10,10);
       divide1 = new DivideService(10,0);
    }

    @Test
    public void sumTest(){
        assertNotEquals(' ',sum.sum());
    }

    @Test
    public void multiplicationTest(){
        assertNotEquals(' ',multiplication.multiplication());
    }

    @Test
    public void subtractionTest(){
        assertNotEquals(' ',subtraction.subtraction());
    }

    @Test
    public void divideTest(){
        assertNotEquals(' ',divide.dividetion());
    }

    @Test
    public void divideTestNotExeption(){
        assertDoesNotThrow(IllegalArgumentException::new,divide1.dividetion());
    }

}
