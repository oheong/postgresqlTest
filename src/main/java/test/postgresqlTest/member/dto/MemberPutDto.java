package test.postgresqlTest.member.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberPutDto {

    @NotNull
    private String password;

    private String name;

    @Builder
    public MemberPutDto(String password, String name) {
        this.password = password;
        this.name = name;
    }
}
