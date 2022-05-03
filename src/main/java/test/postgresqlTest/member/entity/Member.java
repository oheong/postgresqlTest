package test.postgresqlTest.member.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    private String id;

    @Column(nullable = false)
    private String password;

    private String name;

    @Builder
    public Member(String id, String password, String name){
        this.id = id;
        this.password = password;
        this.name = name;
    }

    @Builder
    public Member(String id, String password){
        this.id = id;
        this.password = password;
    }
}
