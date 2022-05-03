package test.postgresqlTest.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.postgresqlTest.member.dto.MemberPostDto;
import test.postgresqlTest.member.dto.MemberResponseDto;
import test.postgresqlTest.member.entity.Member;
import test.postgresqlTest.member.repository.MemberRepository;

import java.util.Optional;

@RequiredArgsConstructor // 의존성 주입
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    // 회원가입, 회원정보 변경, 회원 탈퇴, 로그인

    public String join(MemberPostDto memberPostDto){

        Member member = Member.builder()
                .id(memberPostDto.getId())
                .password(memberPostDto.getPassword())
                .name(memberPostDto.getName())
                .build();

        return memberRepository.save(member).getId();
    }

    public MemberResponseDto get(String id){
        Optional<Member> optionalMember = memberRepository.findById(id);
        if(optionalMember.isPresent()){
            Member member = optionalMember.get();
            return MemberResponseDto.builder()
                    .id(member.getId())
                    .password(member.getPassword())
                    .name(member.getName())
                    .build();
        }
        return null;
    }

    public void remove(String id){
        Optional<Member> optionalMember = memberRepository.findById(id);
        if(optionalMember.isPresent()){
            memberRepository.delete(optionalMember.get());
        }
    }
}
