package pro.sky.skyprospringlesscalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.skyprospringlesscalculator.data.Calculate;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;
import pro.sky.skyprospringlesscalculator.services.CalculationService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    private final CalculationService calculationService = new CalculationService();
    private Calculate calculate1;
    private Calculate calculate2;
    private Calculate calculate3;
    private Calculate calculate4;

    @BeforeEach
    public void settings(){
        calculate1 = new Calculate(10,23);
        calculate2 = new Calculate(-13,123);
        calculate3 = new Calculate(-13,-123);
        calculate4 = new Calculate(256,0);

    }

    @Test
    public void sumTest(){
        calculationService.setCalculate(calculate1);
        assertNotEquals(' ',calculationService.sumService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate2);
        assertNotEquals(' ',calculationService.sumService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate3);
        assertNotEquals(' ',calculationService.sumService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate4);
        assertNotEquals(' ',calculationService.sumService(calculationService.getCalculate()));
    }

    @Test
    public void multiplicationTest(){
        calculationService.setCalculate(calculate1);
        assertNotEquals(' ',calculationService.multiplicationService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate2);
        assertNotEquals(' ',calculationService.multiplicationService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate3);
        assertNotEquals(' ',calculationService.multiplicationService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate4);
        assertNotEquals(' ',calculationService.multiplicationService(calculationService.getCalculate()));
    }

    @Test
    public void subtractionTest(){
        calculationService.setCalculate(calculate1);
        assertNotEquals(' ',calculationService.subtractionService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate2);
        assertNotEquals(' ',calculationService.subtractionService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate3);
        assertNotEquals(' ',calculationService.subtractionService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate3);
        assertNotEquals(' ',calculationService.subtractionService(calculationService.getCalculate()));
    }

    @Test
    public void divideTest(){
        calculationService.setCalculate(calculate1);
        assertNotEquals(' ',calculationService.divideService(calculationService.getCalculate()));
        assertDoesNotThrow(IllegalArgumentException::new,calculationService.divideService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate2);
        assertNotEquals(' ',calculationService.divideService(calculationService.getCalculate()));
        assertDoesNotThrow(IllegalArgumentException::new,calculationService.divideService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate3);
        assertNotEquals(' ',calculationService.divideService(calculationService.getCalculate()));
        assertDoesNotThrow(IllegalArgumentException::new,calculationService.divideService(calculationService.getCalculate()));
        calculationService.setCalculate(calculate4);
        assertNotEquals(' ',calculationService.divideService(calculationService.getCalculate()));
        assertDoesNotThrow(IllegalArgumentException::new,calculationService.divideService(calculationService.getCalculate()));
    }

}
