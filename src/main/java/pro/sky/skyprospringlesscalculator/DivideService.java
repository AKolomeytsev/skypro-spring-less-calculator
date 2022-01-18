package pro.sky.skyprospringlesscalculator;
import pro.sky.skyprospringlesscalculator.exeptions.IllegalArgumentException;

public class DivideService extends Calculate {
    public DivideService(double arg1, double arg2){
        super(arg1,arg2);
    }
    public String dividetion() {
        double div = this.arg1 / this.arg2;
        if (this.arg2 == 0){
            throw new IllegalArgumentException();
        }
        return this.arg1 + " / " + this.arg2 + " = " + div;
    }
}
