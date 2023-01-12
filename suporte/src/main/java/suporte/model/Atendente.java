package suporte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ATENDENTE")
@SequenceGenerator(name = "AtendenteSeq", sequenceName = "SEQ_ATENDENTE", allocationSize = 1)
@XmlRootElement(name = "atendenteJson")
public class Atendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME", nullable = true)
	private String nome;
	
	@Column(name = "TIPO", nullable = true, length = 1)
	private Integer tipo;
	
	@Column(name = "STATUS", nullable = true, length = 1)
	private Integer status;

	public Atendente() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
