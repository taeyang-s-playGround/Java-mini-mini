package mini.mini.domain.member.exception;

import mini.mini.global.error.exception.BusinessException;
import mini.mini.global.error.exception.ErrorCode;

public class MemberNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION = new MemberNotFoundException();
    private MemberNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
