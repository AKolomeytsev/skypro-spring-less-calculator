package pro.sky.skyprospringlesscalculator;

public class SubtractionService extends Calculate {
    public SubtractionService(double arg1, double arg2) {
        super(arg1,arg2);
    }
    public String subtraction(){
        double sub = this.arg1-this.arg2;
        return this.arg1 + " - " + this.arg2 + " = " + sub;
    }
}
