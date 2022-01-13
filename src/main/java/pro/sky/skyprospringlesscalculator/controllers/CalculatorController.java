package pro.sky.skyprospringlesscalculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringlesscalculator.*;
import pro.sky.skyprospringlesscalculator.data.Calculate;
import pro.sky.skyprospringlesscalculator.services.CalculationService;

@RestController
public class CalculatorController {
    private final CalculationService calculationService;
    public CalculatorController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping
    public String calculator(){
        Invitation invitator = new Invitation();
        return invitator.getInvitation() ;
    }
    @GetMapping(path = "/sum")
    public String sum(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        calculationService.setCalculate(new Calculate(arg1,arg2));
        String  result = calculationService.sumService(calculationService.getCalculate());
        return result;
    }
    @GetMapping(path = "/subtraction")
    public String subtraction(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        calculationService.setCalculate(new Calculate(arg1,arg2));
        String  result = calculationService.subtractionService(calculationService.getCalculate());
        return result;
    }
    @GetMapping(path = "/multiplication")
    public String multiplication(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        calculationService.setCalculate(new Calculate(arg1,arg2));
        String  result = calculationService.multiplicationService(calculationService.getCalculate());
        return result;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        calculationService.setCalculate(new Calculate(arg1,arg2));
        String  result = calculationService.divideService(calculationService.getCalculate());
        return result;
    }
}
