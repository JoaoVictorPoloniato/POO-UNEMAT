
package teslax;


public class Veiculos {
	private int id_carro;
	private String ano_veiculo;
	private String combustivel_veiculo;
	private String tipocambio_veiculo;
	private String cor_veiculo;
	private String duracao_garantia;
	private String km_veiculo;
	private String modelo_veiculo;
	private String preco_veiculo;
	private String descricao_veiculo;
	private String marca_veiculo;
	
	public Veiculos() {
		
	}
	
	public Veiculos (int id_carro, String ano_veiculo, String combustivel_veiculo, String tipocambio_veiculo, String cor_veiculo, String duracao_garantia, String km_veiculo, String modelo_veiculo, String preco_veiculo, String descricao_veiculo, String marca_veiculo) {
		this.id_carro = id_carro;
		this.ano_veiculo = ano_veiculo;
		this.combustivel_veiculo = combustivel_veiculo;
		this.tipocambio_veiculo = tipocambio_veiculo;
		this.cor_veiculo = cor_veiculo;
		this.duracao_garantia = duracao_garantia;
		this.km_veiculo = km_veiculo;
		this.modelo_veiculo = modelo_veiculo;
		this.preco_veiculo = preco_veiculo;
		this.descricao_veiculo = descricao_veiculo;
		this.marca_veiculo = marca_veiculo;
	}
	
	public int getId_carro() {
		return id_carro;
	}
	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
	}
	public String getAno_veiculo() {
		return ano_veiculo;
	}
	public void setAno_veiculo(String ano_veiculo) {
		this.ano_veiculo = ano_veiculo;
	}
	public String getCombustivel_veiculo() {
		return combustivel_veiculo;
	}
	public void setCombustivel_veiculo(String combustivel_veiculo) {
		this.combustivel_veiculo = combustivel_veiculo;
	}
	public String getTipocambio_veiculo() {
		return tipocambio_veiculo;
	}
	public void setTipocambio_veiculo(String tipocambio_veiculo) {
		this.tipocambio_veiculo = tipocambio_veiculo;
	}
	public String getCor_veiculo() {
		return cor_veiculo;
	}
	public void setCor_veiculo(String cor_veiculo) {
		this.cor_veiculo = cor_veiculo;
	}
	public String getDuracao_garantia() {
		return duracao_garantia;
	}
	public void setDuracao_garantia(String duracao_garantia) {
		this.duracao_garantia = duracao_garantia;
	}
	public String getKm_veiculo() {
		return km_veiculo;
	}
	public void setKm_veiculo(String km_veiculo) {
		this.km_veiculo = km_veiculo;
	}
	public String getModelo_veiculo() {
		return modelo_veiculo;
	}
	public void setModelo_veiculo(String modelo_veiculo) {
		this.modelo_veiculo = modelo_veiculo;
	}
	public String getPreco_veiculo() {
		return preco_veiculo;
	}
	public void setPreco_veiculo(String preco_veiculo) {
		this.preco_veiculo = preco_veiculo;
	}
	public String getDescricao_veiculo() {
		return descricao_veiculo;
	}
	public void setDescricao_veiculo(String descricao_veiculo) {
		this.descricao_veiculo = descricao_veiculo;
	}
	public String getMarca_veiculo() {
		return marca_veiculo;
	}
	public void setMarca_veiculo(String marca_veiculo) {
		this.marca_veiculo = marca_veiculo;
	}
	@Override
	public String toString() {
		return "ID=" + id_carro + ", Ano=" + ano_veiculo + ", Tipo de combustível="
				+ combustivel_veiculo + ", Tipo de câmbio=" + tipocambio_veiculo + ", Cor do veículo=" + cor_veiculo
				+ ", Garantia=" + duracao_garantia + ", Quilometragem=" + km_veiculo + ", Modelo="
				+ modelo_veiculo + ", Valor=" + preco_veiculo + ", Descrição=" + descricao_veiculo
				+ ", Marca=" + marca_veiculo + "\n";
	}
	
}


