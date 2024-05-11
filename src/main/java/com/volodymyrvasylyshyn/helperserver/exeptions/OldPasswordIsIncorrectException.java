package com.volodymyrvasylyshyn.helperserver.exeptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OldPasswordIsIncorrectException extends RuntimeException {
    public OldPasswordIsIncorrectException(String message){
        super(message);


    }
}
