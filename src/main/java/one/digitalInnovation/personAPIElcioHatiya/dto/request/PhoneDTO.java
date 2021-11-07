package one.digitalInnovation.personAPIElcioHatiya.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalInnovation.personAPIElcioHatiya.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

  //  @NotEmpty
  //  @Size(min = 13, mas = 14)
    private String number;
}
