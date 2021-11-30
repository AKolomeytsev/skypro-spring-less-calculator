package pro.sky.skyprospringlesscalculator;

public class SumService extends Calculate {
    public SumService(double arg1, double arg2){
        super(arg1,arg2);
    }
    public String sum(){
        double sum = this.arg1+this.arg2;
        return this.arg1 + " + " + this.arg2 + " = " + sum;
    }
}
