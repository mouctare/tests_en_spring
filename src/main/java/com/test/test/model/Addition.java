package com.test.test.model;

import com.test.test.exception.InvalidNumberException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Addition {

    private Integer number1;

    private Integer  number2;

    public Addition(Integer  number1, Integer  number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer  sum(){

        if (number1 < 0 || number2 < 0){
            throw new InvalidNumberException("Les deux nombres doivent être positifs");
        }
        return number1 + number2;
    }

}
