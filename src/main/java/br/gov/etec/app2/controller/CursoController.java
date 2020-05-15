package br.gov.etec.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app2.dtos.CursoDto;
import br.gov.etec.app2.entity.Curso;
import br.gov.etec.app2.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public List<Curso> listarCursos() {
		return cursoRepository.findAll();

	}

	@PostMapping
	public void cadastrarAluno(@RequestBody CursoDto dto) {
		Curso curso = this.toDtoEntity(dto);
		cursoRepository.save(curso);
	}

	private Curso toDtoEntity(CursoDto dto) {
		Curso curso = new Curso();
		curso.setNome(dto.getNome());
		curso.setDescricao(dto.getDescricao());

		return curso;
	}

}
