package pro.sky.skyprospringlesscalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;
import pro.sky.skyprospringlesscalculator.services.CalculationService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTestParam {
    private static final CalculationService calculationService = new CalculationService();



    public static Stream<Arguments> providerParamsForSumTest(){
        return Stream.of(
                Arguments.of(12.56,12)
                ,Arguments.of(0.56,67)
                ,Arguments.of(-123.89,-0.97)
                ,Arguments.of(98.56,0)
        );
    }

    public static Stream<Arguments> providerParamsForMultiplicationTest(){
        return Stream.of(
                Arguments.of(45,79)
                ,Arguments.of(-97,61)
                ,Arguments.of(0,32)
                ,Arguments.of(10567,0)
        );
    }

    public static Stream<Arguments> providerParamsForSubtractionTest(){
        return Stream.of(
                Arguments.of(243,697)
                ,Arguments.of(0.0994,567)
                ,Arguments.of(901,-9056)
                ,Arguments.of(0,0)
        );
    }

    public static Stream<Arguments> providerParamsForDivideTest(){
        return Stream.of(
                Arguments.of(12,56)
                ,Arguments.of(85,-254)
                ,Arguments.of(276,9)
                ,Arguments.of(56,0)
        );
    }

    @ParameterizedTest
    @MethodSource("providerParamsForSumTest")
    public void sumTest(double arg1,double arg2){
        assertNotNull(calculationService.getSum(arg1,arg2));
    }

    @ParameterizedTest
    @MethodSource("providerParamsForMultiplicationTest")
    public void multiplicationTest(double arg1,double arg2){
        assertNotNull(calculationService.getMultiplication(arg1,arg2));
    }

    @ParameterizedTest
    @MethodSource("providerParamsForSubtractionTest")
    public void subtractionTest(double arg1,double arg2){
        assertNotNull(calculationService.getSubtraction(arg1,arg2));
    }

    @ParameterizedTest
    @MethodSource("providerParamsForDivideTest")
    public void divideTest(double arg1,double arg2){
        assertNotNull(calculationService.getDivide(arg1,arg2));
        assertDoesNotThrow(IllegalArgumentException::new,calculationService.getDivide(arg1,arg2));
    }
}
