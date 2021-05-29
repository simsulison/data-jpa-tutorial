package study.datajpa.dto;

import lombok.Data;

@Data //entity에는 @Data 쓰면 안된다. getter setter 다 들어있어서

public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
