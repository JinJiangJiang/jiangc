package com.jiang.util;

import com.jiang.entity.ResultEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 2018-06-14.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultEntity handle(Exception ex) {
        ex.printStackTrace();
        return ResultEntity.exception(-1, ex.getMessage());
    }
}
