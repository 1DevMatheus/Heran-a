package heranca;
\\eu copiei assim porque só consgui assim...
public class gerente {
		private String nome;
		private String cargo;
		
		public ExerciciosHeranca(String nome, String cargo) {
			this.nome = nome;
			this.cargo = cargo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public void imprintInfo() {
			System.out.printf("Nome: "+getNome());
			System.out.println("\nCargo: "+getCargo());
		}
		
}


package heranca;

public class funcionario extends gerente{
		public String suborfinada;
		public String superior;
		public funcionario(String nome, String cargo, String suborfinada, String superior) {
		
			super(nome, cargo);
			this.suborfinada = suborfinada;
			this.superior = superior;
		}
		public String getSuborfinada() {
			return suborfinada;
		}
		public void setSuborfinada(String suborfinada) {
			this.suborfinada = suborfinada;
		}
		public String getSuperior() {
			return superior;
		}
		public void setSuperior(String superior) {
			this.superior = superior;
		}
		public void imprintInfo() {
			System.out.println("\nNome: "+getNome());
			System.out.println("Cargo: "+getCargo());
			System.out.println("Inferior a: "+getSuborfinada());
			System.out.println("Superior a: "+getSuperior());
		}
		
		
}
package heranca;

public class vendedor extends funcionario{
		 private String vendas;
		 private int valorareceber;

		public vendedor(String nome, String cargo, String suborfinada, String superior, String vendas,
				int valorareceber) {
			super(nome, cargo, suborfinada, superior);
			this.vendas = vendas;
			this.valorareceber = valorareceber;
		}

		public String getVendas() {
			return vendas;
		}

		public void setVendas(String vendas) {
			this.vendas = vendas;
		}

		public int getValorareceber() {
			return valorareceber;
		}

		public void setValorareceber(int valorareceber) {
			this.valorareceber = valorareceber;
		}
		 public void imprintInfo() {
			 System.out.println("Nome: "+getNome());
			 System.out.println("Cargo: "+getCargo());
			 System.out.println("Inferior a:"+getSuborfinada());
			 System.out.println("Total em vendas: "+getVendas());
			 System.out.printf("valor a receber:"+getValorareceber()+"\n");
		 }
		 
}
package heranca;

public class testaFuncionario {

	public static void main(String[] args) {
		gerente gerente1 = new gerente("Guilherme Santiago","Gerente\n");
			gerente1.imprintInfo();
		vendedor vendendor1 = new vendedor("Lucas Santos", "Vendedor", " Luis Gustavo", "", "32...", 1230);
			vendendor1.imprintInfo();
		funcionario funcionario1 = new funcionario("Luis Gustavo","Funcionario","Guilherme Santiago","Lucas Santos");
			funcionario1.imprintInfo();
	}

}
