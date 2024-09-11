package mini.mini.global.security.auth;


import lombok.RequiredArgsConstructor;
import mini.mini.domain.member.entity.Member;
import mini.mini.domain.member.exception.MemberNotFoundException;
import mini.mini.domain.member.repository.MemberRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String accountId) {

        Member member = memberRepository.findByAccountId(accountId)
                .orElseThrow(()-> MemberNotFoundException.EXCEPTION);

        return new AuthDetails(member.getAccountId());

     }
}
