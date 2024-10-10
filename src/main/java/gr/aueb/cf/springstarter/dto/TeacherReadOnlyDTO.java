package gr.aueb.cf.springstarter.dto;

import jakarta.annotation.security.DenyAll;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherReadOnlyDTO {
    private Long id;
    private String firstname;
    private String lastname;
}
