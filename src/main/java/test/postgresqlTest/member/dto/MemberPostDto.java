package test.postgresqlTest.member.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberPostDto {

    @NotNull
    private String id;

    @NotNull
    private String password;

    private String name;

    @Builder
    public MemberPostDto(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
