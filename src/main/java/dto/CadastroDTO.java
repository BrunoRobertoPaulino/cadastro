package dto;

import java.io.Serializable;

import javax.persistence.Transient;

import org.modelmapper.ModelMapper;

import entity.Cadastro;

public class CadastroDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Transient
	private static ModelMapper modelMapper = new ModelMapper();

	private Long id;
	private String nome;
	private String sobreNome;
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cadastro toEntity() {
		return modelMapper.map(this, Cadastro.class);
	}

}
