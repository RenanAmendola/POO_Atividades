
public class Cliente {

	//delcara��o dos atributos da classe
	
	private String Nome;
	private int Idade;
	private long Cpf;
	private String Email;
	private String Endereco;
	

	//declara��o do m�todo construtor


public Cliente (String Nome, int Idade, long Cpf, String Email, String Endereco) {
	
		this.Nome = Nome;
		this.Idade = Idade;
		this.Cpf = Cpf;
		this.Email = Email;
		this.Endereco = Endereco;

}

	//declara��o dos m�todos gerais


public String getNome() {
	return Nome;
}


public void setNome(String nome) {
	Nome = nome;
}


public int getIdade() {
	return Idade;
}


public void setIdade(int idade) {
	Idade = idade;
}


public long getCpf() {
	return Cpf;
}


public void setCpf(long cpf) {
	Cpf = cpf;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public String getEndereco() {
	return Endereco;
}


public void setEndereco(String endereco) {
	Endereco = endereco;
}


public void info_Cliente() {
	
	
	System.out.print("Nome: "+Nome);
	System.out.print("\nIdade: "+Idade);
	System.out.print("\nCpf: "+Cpf);
	System.out.print("\nEmail: "+Email);
	System.out.print("\nEndere�o: "+Endereco);
	
}










}
