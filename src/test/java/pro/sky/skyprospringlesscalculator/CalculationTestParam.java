package pro.sky.skyprospringlesscalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprospringlesscalculator.data.Calculate;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;
import pro.sky.skyprospringlesscalculator.services.CalculationService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTestParam {
    private static CalculationService calculationService = new CalculationService();
    private static Calculate calculate1 = new Calculate(10,23);
    private static Calculate calculate2 = new Calculate(-13,123);;
    private static Calculate calculate3 = new Calculate(-13,-123);;
    private static Calculate calculate4 = new Calculate(256,0);;


    public static Stream<Arguments> providerParamsForSumTest(){
        return Stream.of(
                Arguments.of(calculate1)
                ,Arguments.of(calculate2)
                ,Arguments.of(calculate3)
                ,Arguments.of(calculate4)
        );
    }

    public static Stream<Arguments> providerParamsForMultiplicationTest(){
        return Stream.of(
                Arguments.of(calculate1)
                ,Arguments.of(calculate2)
                ,Arguments.of(calculate3)
                ,Arguments.of(calculate4)
        );
    }

    public static Stream<Arguments> providerParamsForSubtractionTest(){
        return Stream.of(
                Arguments.of(calculate1)
                ,Arguments.of(calculate2)
                ,Arguments.of(calculate3)
                ,Arguments.of(calculate4)
        );
    }

    public static Stream<Arguments> providerParamsForDivideTest(){
        return Stream.of(
                Arguments.of(calculate1)
                ,Arguments.of(calculate2)
                ,Arguments.of(calculate3)
                ,Arguments.of(calculate4)
        );
    }

    @ParameterizedTest
    @MethodSource("providerParamsForSumTest")
    public void sumTest(Calculate sum){
        assertNotEquals(' ',calculationService.sumService(sum));
    }

    @ParameterizedTest
    @MethodSource("providerParamsForMultiplicationTest")
    public void multiplicationTest(Calculate multiplication){
        assertNotEquals(' ',calculationService.multiplicationService(multiplication));
    }

    @ParameterizedTest
    @MethodSource("providerParamsForSubtractionTest")
    public void subtractionTest(Calculate subtraction){
        assertNotEquals(' ',calculationService.subtractionService(subtraction));
    }

    @ParameterizedTest
    @MethodSource("providerParamsForDivideTest")
    public void divideTest(Calculate divide){
        assertNotEquals(' ',calculationService.divideService(divide));
        assertDoesNotThrow(IllegalArgumentException::new,calculationService.divideService(divide));
    }
}
