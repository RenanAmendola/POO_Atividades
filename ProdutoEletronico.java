
public class ProdutoEletronico {

	
	
	private String Nome;
	private String Modelo;
	private int DataFab;
	private String Opcionais;
	

	
public ProdutoEletronico(String nome,String modelo, int data, String opcionais) {
	
	this.Nome = nome;
	this.Modelo = modelo;
	this.DataFab = data;
	this.Opcionais = opcionais;
		
}



public String getNome() {
	return Nome;
}



public void setNome(String nome) {
	Nome = nome;
}



public String getModelo() {
	return Modelo;
}



public void setModelo(String modelo) {
	Modelo = modelo;
}



public int getDataFab() {
	return DataFab;
}



public void setDataFab(int dataFab) {
	DataFab = dataFab;
}



public String getOpcionais() {
	return Opcionais;
}



public void setOpcionais(String opcionais) {
	Opcionais = opcionais;
}
	
	
	
	
	
	
	
	public void InfoProduto() {
		
		System.out.println("Nome do dispositivo: "+ Nome);
		System.out.println("Modelo: "+ Modelo);
		System.out.println("Data de lançamento "+ DataFab);
		System.out.println("Opcionais inclusos: "+ Opcionais);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
