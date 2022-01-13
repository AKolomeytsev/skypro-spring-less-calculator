package pro.sky.skyprospringlesscalculator.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


public class Calculate {

    private double arg2;
    private double arg1;
    public Calculate(double arg1,double arg2){
        this.setArg1(arg1);
        this.setArg2(arg2);
    }
    public double getArg2() {
        return arg2;
    }

    public void setArg2(double arg2) {
        this.arg2 = arg2;
    }

    public double getArg1() {
        return arg1;
    }

    public void setArg1(double arg1) {
        this.arg1 = arg1;
    }
}
