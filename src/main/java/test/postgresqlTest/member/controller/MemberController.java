package test.postgresqlTest.member.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.postgresqlTest.member.dto.MemberPostDto;
import test.postgresqlTest.member.dto.MemberResponseDto;
import test.postgresqlTest.member.service.MemberService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/member")
public class MemberController {

    private final MemberService memberService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping
    public String join(@RequestBody MemberPostDto memberPostDto){

        return memberService.join(memberPostDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberResponseDto> getMember(@PathVariable String id){
        MemberResponseDto memberResponseDto = memberService.get(id);

        if(memberResponseDto == null)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(memberResponseDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable String id){
        memberService.remove(id);
        return new ResponseEntity<>(id + " 삭제 성공", HttpStatus.OK);
    }
}
