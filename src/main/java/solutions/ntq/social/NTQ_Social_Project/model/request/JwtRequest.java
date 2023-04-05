package solutions.ntq.social.NTQ_Social_Project.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;
    @NotBlank(message = "Username is not blank")
    private String username;
    @NotBlank(message = "Password is not blank")
    @Size(min = 6, max = 20,message = "Password must contain between 6-20 characters")
    private String password;

}
