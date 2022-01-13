package pro.sky.skyprospringlesscalculator.interfaces;

import pro.sky.skyprospringlesscalculator.data.Calculate;

public interface ICalculateServices {
    String divideService(Calculate obj);
    String multiplicationService(Calculate obj);
    String subtractionService(Calculate obj);
    String sumService(Calculate obj);
}
