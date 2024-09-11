package mini.mini.domain.member.repository;

import mini.mini.domain.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, Long> {

    Optional<Member> findByAccountId(String accountId);

}
