package pro.sky.skyprospringlesscalculator;

public class MultiplicationService extends Calculate {
    public MultiplicationService(double arg1, double arg2) {
        super(arg1,arg2);
    }
    public String multiplication(){
        double mult = this.arg1*this.arg2;
        return this.arg1 + " * " + this.arg2 + " = " + mult;
    }
}
