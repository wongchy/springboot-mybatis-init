package com.aus.system.exception;

import com.aus.common.api.vo.Result;
import com.aus.common.enums.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @Author WongChy
 * @Date 2020/10/25 15:40
 */
@Slf4j
@RestControllerAdvice
public class AusExceptionHandler {

    @ExceptionHandler(AusException.class)
    public Result<?> handlerAusException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public Result<?> handlerNoFoundException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(ResponseEnum.ERROR_USER.getCode(), "路径不存在，请检查路径是否正确");
    }

    @ExceptionHandler(Exception.class)
    public Result<?> handlerException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.error(ResponseEnum.ERROR_SYSTEM.getCode(), "系统错误");
    }

}
