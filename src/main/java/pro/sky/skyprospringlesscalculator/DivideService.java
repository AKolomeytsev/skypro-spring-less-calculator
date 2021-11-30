package pro.sky.skyprospringlesscalculator;

public class DivideService extends Calculate {

    public DivideService(double arg1, double arg2){
        super(arg1,arg2);
    }
    public String dividetion(){
        double div = this.arg1 / this.arg2;
        if (this.arg2 == 0){
            return "Ошибка: на 0 делить нельзя!";
        }
        return this.arg1 + " / " + this.arg2 + " = " + div;
    }
}
