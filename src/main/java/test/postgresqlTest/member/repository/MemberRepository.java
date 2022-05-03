package test.postgresqlTest.member.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.postgresqlTest.member.entity.Member;

import java.util.Optional;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {
    Optional<Member> findById(String id);
    Member save(Member member); // insert + update
    void delete(Member member);
}
