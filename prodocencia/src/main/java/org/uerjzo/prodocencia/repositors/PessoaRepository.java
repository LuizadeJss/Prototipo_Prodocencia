package org.uerjzo.prodocencia.repositors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uerjzo.prodocencia.model.Pessoa;
import org.uerjzo.prodocencia.model.Professor;

@Repository
public interface PessoaRepository extends JpaRepository<Professor, String>{

}
