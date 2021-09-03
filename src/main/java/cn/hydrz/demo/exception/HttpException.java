package cn.hydrz.demo.exception;

public class HttpException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private int code;

    public int getCode() {
        return this.code;
    }

    private Object data;

    public Object getData() {
        return this.data;
    }

    public HttpException(int code) {
        super("error");
        this.code = code;
        this.data = "";
    }

    public HttpException(String message) {
        super(message);
        this.code = -1;
        this.data = "";
    }

    public HttpException(int code, String message) {
        super(message);
        this.code = code;
        this.data = "";
    }

    public HttpException(String message, Object data) {
        super(message);
        this.code = -1;
        this.data = data;
    }

    public HttpException(int code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }
}
