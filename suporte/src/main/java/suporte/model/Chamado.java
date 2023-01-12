package suporte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "CHAMADO")
@SequenceGenerator(name = "ChamadoSeq", sequenceName = "SEQ_CHAMADO", allocationSize = 1)
@XmlRootElement(name = "chamadoJson")
public class Chamado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "SOLICITANTE", nullable = true)
	private String solicitante;
	
	@Column(name = "DETALHE", nullable = true)
	private String detalhe;
	
	@Column(name = "SOLUCAO_EXTERNA", nullable = true)
	private String solucaoExterna;
	
	@Column(name = "SOLUCAO_TECNICA", nullable = true)
	private String solucaoTecnica;
	
	@Column(name = "OBSERVACAO", nullable = true)
	private String observacao;
	
	@Column(name = "STATUS", nullable = false, length = 1)
	private Integer status;
	
	@Column(name = "DEV_RESPONSAVEL", nullable = true)
	private String devResponsavel;
	
	@Column(name = "DATA_CHAMADO", nullable = false)
	private String dataChamado;
	
	@Column(name = "ASSUNTO", nullable = false)
	private String assunto;
	
	//////////////////////////////////
	// RELAÇÕES
	/////////////////////////////////
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLIENTE")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ATENDENTE")
	private Atendente atendente;
	
	
	//////////////////////////////////
	// CONSTRUTOR
	/////////////////////////////////
	
	public Chamado() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	public String getSolucaoExterna() {
		return solucaoExterna;
	}
	public void setSolucaoExterna(String solucaoExterna) {
		this.solucaoExterna = solucaoExterna;
	}
	public String getSolucaoTecnica() {
		return solucaoTecnica;
	}
	public void setSolucaoTecnica(String solucaoTecnica) {
		this.solucaoTecnica = solucaoTecnica;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public String getDevResponsavel() {
		return devResponsavel;
	}
	public void setDevResponsavel(String devResponsavel) {
		this.devResponsavel = devResponsavel;
	}
	public String getDataChamado() {
		return dataChamado;
	}
	public void setDataChamado(String dataChamado) {
		this.dataChamado = dataChamado;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
}
