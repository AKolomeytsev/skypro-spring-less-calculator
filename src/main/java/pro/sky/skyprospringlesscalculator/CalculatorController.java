package pro.sky.skyprospringlesscalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String calculator(){
        Invitation invitator = new Invitation();
        return invitator.getInvitation() ;
    }
    @GetMapping(path = "/sum")
    public String sum(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        SumService summator = new SumService(arg1,arg2);
        String result = summator.sum();
        return result;
    }
    @GetMapping(path = "/subtraction")
    public String subtraction(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        SubtractionService subtractor = new SubtractionService(arg1,arg2);
        String result = subtractor.subtraction();
        return result;
    }
    @GetMapping(path = "/multiplication")
    public String multiplication(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        MultiplicationService multiplicator = new MultiplicationService(arg1,arg2);
        String result = multiplicator.multiplication();
        return result;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("argument1") double arg1,@RequestParam("argument2") double arg2){
        DivideService dividetor = new DivideService(arg1,arg2);
        String result = dividetor.dividetion();
        return result;
    }

}
