package heranca;

public class gerente {
		private String nome;
		private String cargo;
		
		public gerente(String nome, String cargo) {
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
