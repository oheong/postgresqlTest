package test.postgresqlTest.member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberResponseDto {
    private String id;
    private String password;
    private String name;

    @Builder
    public MemberResponseDto(String id, String password, String name){
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
