package org.uerjzo.prodocencia.repositors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uerjzo.prodocencia.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer >{

}
