package mini.mini.global.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor

public class TokenResponse {

    private String accessToken;
}
