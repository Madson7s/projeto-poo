package modelo;

public class Evento {
	
	private int id;
	private String nome;
	private String descricao;
	private String dataDeEvento;
	private String horario;
	private String nomeDoLocal;
	private String endereco;
	
	public Evento(int id, String nome, String descricao,String dataDeEvento,String horario, String nomeDoLocal, String endereco ) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dataDeEvento = dataDeEvento;
		this.horario = horario;
		this.nomeDoLocal = nomeDoLocal;
		this.endereco = endereco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataDeEvento() {
		return dataDeEvento;
	}
	public void setDataDeEvento(String dataDeEvento) {
		this.dataDeEvento = dataDeEvento;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getNomeDoLocal() {
		return nomeDoLocal;
	}
	public void setNomeDoLocal(String nomeDoLocal) {
		this.nomeDoLocal = nomeDoLocal;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	}
