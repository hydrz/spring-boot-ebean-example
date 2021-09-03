package cn.hydrz.demo.exception;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException() {
        super("Auth Unauthorized");
    }
}
