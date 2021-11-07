package one.digitalInnovation.personAPIElcioHatiya.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PersonDTO {
    private Long id;

    //@NotEmpty
    //@Size(min = 2, max = 100)
    private String firstName;

    //@NotEmpty
    //@CPF
    private String cpf;

    //@NotEmpty
    //@Size(min = 2, max = 100)
    private String lastName;
    private String birthDate;

    //@NotEmpty
    //@Valid
    private List<PhoneDTO> phones;
}
