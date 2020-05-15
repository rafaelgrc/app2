package br.gov.etec.app2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.etec.app2.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
