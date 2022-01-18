package pro.sky.skyprospringlesscalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;
import pro.sky.skyprospringlesscalculator.services.CalculationService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    private final CalculationService calculationService;
    private double[] params = new double[8];

    {
        calculationService = new CalculationService();
    }
    @BeforeEach
    public void settings(){
       params[0] = 102.5;
       params[1] = 123.6;
       params[2] = 1;
       params[3] = 6;
       params[4] = 67;
       params[5] = 4;
       params[6] = 98;
       params[7] = 0;

    }

    @Test
    public void sumTest(){
       for(int i = 0; i< params.length;i+=2){
           assertNotNull(calculationService.getSum(params[i],params[i+1]));
       }
    }

    @Test
    public void multiplicationTest(){
        for(int i = 0; i< params.length;i+=2){
            assertNotNull(calculationService.getMultiplication(params[i],params[i+1]));
        }
    }

    @Test
    public void subtractionTest(){
        for(int i = 0; i< params.length;i+=2){
            assertNotNull(calculationService.getSubtraction(params[i],params[i+1]));
        }
    }

    @Test
    public void divideTest(){
        for(int i = 0; i< params.length;i+=2){
            assertNotNull(calculationService.getDivide(params[i],params[i+1]));
            assertDoesNotThrow(IllegalArgumentException::new,calculationService.getDivide(params[i],params[i+1]));
        }
    }

}
