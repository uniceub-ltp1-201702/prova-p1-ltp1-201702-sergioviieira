import java.time.LocalDateTime;

public class Ligacao {
	public int codigo;
	public String telDest;
	public LocalDateTime dataHoraI;
	public LocalDateTime dataHoraF;
	public String cidadeDest;
	public String UFDest;
	public Clientes clientes;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTelDest() {
		return telDest;
	}
	public void setTelDest(String telDest) {
		this.telDest = telDest;
	}
	public LocalDateTime getDataHoraI() {
		return dataHoraI;
	}
	public void setDataHoraI(LocalDateTime dataHoraI) {
		this.dataHoraI = dataHoraI;
	}
	public LocalDateTime getDataHoraF() {
		return dataHoraF;
	}
	public void setDataHoraF(LocalDateTime dataHoraF) {
		this.dataHoraF = dataHoraF;
	}
	public String getCidadeDest() {
		return cidadeDest;
	}
	public void setCidadeDest(String cidadeDest) {
		this.cidadeDest = cidadeDest;
	}
	public String getUFDest() {
		return UFDest;
	}
	public void setUFDest(String uFDest) {
		UFDest = uFDest;
	}
	public Clientes getClientes() {
		return clientes;
	}
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	public Ligacao(int codigo, String telDest, LocalDateTime dataHoraI, LocalDateTime dataHoraF, String cidadeDest,
			String uFDest, Clientes clientes) {
		super();
		this.codigo = codigo;
		this.telDest = telDest;
		this.dataHoraI = dataHoraI;
		this.dataHoraF = dataHoraF;
		this.cidadeDest = cidadeDest;
		UFDest = uFDest;
		this.clientes = clientes;
	}
}	