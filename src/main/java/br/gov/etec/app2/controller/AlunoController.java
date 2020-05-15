package br.gov.etec.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app2.dtos.AlunoDto;
import br.gov.etec.app2.entity.Aluno;
import br.gov.etec.app2.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping
	public List<Aluno> listarAlunos() {
		return alunoRepository.findAll();

	}

	@PostMapping
	public void cadastrarAluno(@RequestBody AlunoDto dto) {
		Aluno aluno = this.toDtoEntity(dto);
		alunoRepository.save(aluno);
	}

	private Aluno toDtoEntity(AlunoDto dto) {
		Aluno aluno = new Aluno();
		aluno.setNome(dto.getNome());
		aluno.setRg(dto.getRg());
		aluno.setCpf(dto.getCpf());
		aluno.setEmail(dto.getEmail());
		aluno.setDataNasc(dto.getDataNasc());

		return aluno;
	}

}
