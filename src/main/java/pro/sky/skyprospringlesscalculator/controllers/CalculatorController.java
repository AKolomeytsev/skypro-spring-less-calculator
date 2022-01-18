package pro.sky.skyprospringlesscalculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringlesscalculator.services.CalculationService;

@RestController
public class CalculatorController {
    private final CalculationService calculationService;
    public CalculatorController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping(path = "/sum")
    public String sum(@RequestParam("argument1") double arg1, @RequestParam("argument2") double arg2){
        String result = "<span>" +arg1+ "</span><span>+" +arg2+ "</span>=" + String.valueOf(calculationService.getSum(arg1,arg2));
        return result;
    }
    @GetMapping(path = "/subtraction")
    public String subtraction(@RequestParam("argument1") double arg1, @RequestParam("argument2") double arg2){
        String result = "<span>" +arg1+ "</span><span>-" +arg2+ "</span>=" + String.valueOf(calculationService.getSubtraction(arg1,arg2));
        return result;
    }
    @GetMapping(path = "/multiplication")
    public String multiplication(@RequestParam("argument1") double arg1, @RequestParam("argument2") double arg2){
        String result = "<span>" +arg1+ "</span><span>*" +arg2+ "</span>=" + String.valueOf(calculationService.getMultiplication(arg1,arg2));
        return result;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("argument1") double arg1, @RequestParam("argument2") double arg2){
        String result = "<span>" +arg1+ "</span><span>/" +arg2+ "</span>=" + String.valueOf(calculationService.getDivide(arg1,arg2));
        return result;
    }
}
