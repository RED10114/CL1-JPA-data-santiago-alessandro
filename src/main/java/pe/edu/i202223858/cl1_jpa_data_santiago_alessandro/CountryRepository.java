package pe.edu.i202223858.cl1_jpa_data_santiago_alessandro;

import org.springframework.data.repository.CrudRepository;

import pe.edu.i202223858.cl1_jpa_data_santiago_alessandro.entidades.Country;
public interface CountryRepository  extends CrudRepository <Country, String> {

}
