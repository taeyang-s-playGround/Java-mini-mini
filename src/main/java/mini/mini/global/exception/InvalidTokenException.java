package mini.mini.global.exception;


import mini.mini.global.error.exception.BusinessException;
import mini.mini.global.error.exception.ErrorCode;

public class InvalidTokenException extends BusinessException {
    public static final BusinessException EXCEPTION = new InvalidTokenException();
    //
    private InvalidTokenException(){
        super(ErrorCode.INVALID_TOKEN);

    }
}
