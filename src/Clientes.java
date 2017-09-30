import java.time.LocalDate;

public class Clientes {
	public String nome;
	public String CPF;
	public LocalDate data;
	public String telefone;
	public String cidade;
	public String UF;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public Clientes(String nome, String cPF, LocalDate data, String telefone, String cidade, String uF) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.data = data;
		this.telefone = telefone;
		this.cidade = cidade;
		UF = uF;
	}
}
	
	  