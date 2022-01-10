package pro.sky.skyprospringlesscalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTestParam {
    public static Stream<Arguments> providerParamsForSumTest(){
        return Stream.of(
                Arguments.of(new SumService(2,3))
                ,Arguments.of(new SumService(21,31))
                ,Arguments.of(new SumService(12,37))
        );
    }

    public static Stream<Arguments> providerParamsForMultiplicationTest(){
        return Stream.of(
                Arguments.of(new MultiplicationService(2,3))
                ,Arguments.of(new MultiplicationService(-21,-31))
                ,Arguments.of(new MultiplicationService(0,37))
        );
    }

    public static Stream<Arguments> providerParamsForSubtractionTest(){
        return Stream.of(
                Arguments.of(new SubtractionService(24,35))
                ,Arguments.of(new SubtractionService(40,80))
                ,Arguments.of(new SubtractionService(.9,12.37))
        );
    }

    public static Stream<Arguments> providerParamsForDivideTest(){
        return Stream.of(
                Arguments.of(new DivideService(24,35))
                ,Arguments.of(new DivideService(40,80))
                ,Arguments.of(new DivideService(.9,10))
        );
    }

    @ParameterizedTest
    @MethodSource("providerParamsForSumTest")
    public void sumTest(SumService sum){
        assertNotEquals(' ',sum.sum());
    }

    @ParameterizedTest
    @MethodSource("providerParamsForMultiplicationTest")
    public void multiplicationTest(MultiplicationService multiplication){
        assertNotEquals(' ',multiplication.multiplication());
    }

    @ParameterizedTest
    @MethodSource("providerParamsForSubtractionTest")
    public void subtractionTest(SubtractionService subtraction){
        assertNotEquals(' ',subtraction.subtraction());
    }

    @ParameterizedTest
    @MethodSource("providerParamsForDivideTest")
    public void divideTest(DivideService divide){
        assertNotEquals(' ',divide.dividetion());
        assertDoesNotThrow(IllegalArgumentException::new,divide.dividetion());
    }
}
