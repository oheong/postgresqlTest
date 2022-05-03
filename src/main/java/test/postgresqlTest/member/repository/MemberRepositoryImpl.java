package test.postgresqlTest.member.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import test.postgresqlTest.member.entity.Member;

import java.util.Optional;

@RequiredArgsConstructor // 의존성 주입
@Repository
public abstract class MemberRepositoryImpl implements MemberRepository {

    @Override
    public Optional<Member> findById(String id) {
        return findById(id);
    }

    @Override
    public Member save(Member member) {
        return save(member);
    }

    @Override
    public void delete(Member member) {
        delete(member);
    }
}
