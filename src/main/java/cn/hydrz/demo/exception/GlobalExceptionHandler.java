package cn.hydrz.demo.exception;

import java.io.Serializable;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    public Map<String, Serializable> exceptionHandler(Exception e) {
        return Map.of("code", -1, "msg", e.getMessage());
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(value = ForbiddenException.class)
    public Map<String, Serializable> exceptionHandler(ForbiddenException e) {
        return Map.of("code", -1, "msg", e.getMessage());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = UnauthorizedException.class)
    public Map<String, Serializable> exceptionHandler(UnauthorizedException e) {
        return Map.of("code", -1, "msg", e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = HttpException.class)
    public Map<String, Object> exceptionHandler(HttpException e) {
        return Map.of("code", e.getCode(), "msg", e.getMessage(), "data", e.getData());
    }
}
