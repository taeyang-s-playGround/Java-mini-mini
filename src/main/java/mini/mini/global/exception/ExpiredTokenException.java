package mini.mini.global.exception;


import mini.mini.global.error.exception.BusinessException;
import mini.mini.global.error.exception.ErrorCode;

public class ExpiredTokenException extends BusinessException {
    public static final BusinessException EXCEPTION = new ExpiredTokenException();
    private ExpiredTokenException(){
        super(ErrorCode.EXPIRED_TOKEN);
    }
}