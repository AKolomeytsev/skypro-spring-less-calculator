package pro.sky.skyprospringlesscalculator.services;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;
import pro.sky.skyprospringlesscalculator.interfaces.ICalculateServices;
@Service
public class CalculationService implements ICalculateServices {

    @Override
    public String getDivide(double arg1, double arg2) {
        StringBuilder div;
        if (arg2 == 0){
            throw new IllegalArgumentException();
        }
        div = new StringBuilder(String.valueOf(arg1 / arg2));
        return String.valueOf(div);
    }

    @Override
    public double getMultiplication(double arg1, double arg2) {
        double multiplication = arg1 * arg2;
        return  multiplication;
    }

    @Override
    public double getSubtraction(double arg1, double arg2) {
        double subtract = arg1 - arg2;
        return subtract;
    }

    @Override
    public double getSum(double arg1, double arg2) {
        double sum = arg1 + arg2;
        return sum;
    }
}
