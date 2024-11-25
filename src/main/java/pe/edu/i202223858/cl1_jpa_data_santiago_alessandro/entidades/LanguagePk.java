package pe.edu.i202223858.cl1_jpa_data_santiago_alessandro.entidades;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguagePk {
    private String Language;
    private String CountryCode;
}
