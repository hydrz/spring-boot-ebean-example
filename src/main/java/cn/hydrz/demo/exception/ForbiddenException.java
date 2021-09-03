package cn.hydrz.demo.exception;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException() {
        super("Auth Forbidden");
    }
}
