package entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.modelmapper.ModelMapper;

import dto.CadastroDTO;

@Entity
@Table(name = "userNames")
public class Cadastro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Transient
	private static ModelMapper modelMapper = new ModelMapper();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String sobreNome;

	private String cpf;

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

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(id, other.id);
	}

	public CadastroDTO toDto() {
		return modelMapper.map(this, CadastroDTO.class);
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", cpf=" + cpf + "]";
	}

}
