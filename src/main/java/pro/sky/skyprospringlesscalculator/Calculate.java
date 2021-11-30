package pro.sky.skyprospringlesscalculator;

public abstract class Calculate {
    protected final double arg2;
    protected final double arg1;

    public Calculate(double arg1, double arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
}
