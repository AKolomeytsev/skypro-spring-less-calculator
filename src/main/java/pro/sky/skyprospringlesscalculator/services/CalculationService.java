package pro.sky.skyprospringlesscalculator.services;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringlesscalculator.data.Calculate;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;
import pro.sky.skyprospringlesscalculator.interfaces.ICalculateServices;
@Service
public class CalculationService implements ICalculateServices {
    private Calculate calculate;
    @Override
    public String divideService(Calculate obj) {
        double div = obj.getArg1() / obj.getArg2();
        if (obj.getArg2() == 0){
            throw new IllegalArgumentException();
        }
        return obj.getArg1() + " / " + obj.getArg2() + " = " + div;
    }

    @Override
    public String multiplicationService(Calculate obj) {
        double multiplication = obj.getArg1() * obj.getArg2();
        return obj.getArg1() + " * " + obj.getArg2() + " = " + multiplication;
    }

    @Override
    public String subtractionService(Calculate obj) {
        double subtract = obj.getArg1() - obj.getArg2();
        return obj.getArg1() + " - " + obj.getArg2() + " = " + subtract;
    }

    @Override
    public String sumService(Calculate obj) {
        double a1 = obj.getArg1();
        double a2 = obj.getArg2();
        double sum = a1 + a2;
        return a1 + " + " + a2 + " = " + sum;
    }

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
    }

    public Calculate getCalculate() {
        return calculate;
    }
}
