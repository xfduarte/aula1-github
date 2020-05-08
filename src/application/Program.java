package application;

public class Program {
	public static void main(String[] args) {
		System.out.println("Git and GitHub bonus class!");
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Verificar se o usuario esta configurado no git comando\n"
				+ "git config --list\nCaso usuario não esteja configurado comandos\n"
				+ "git config --global user.name \"nome\"\n"
				+ "git config --global user.email \"email\"");
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Se o projeto não estiver no computador usar o comando\n"
				+ "git clone https://github.com/xfduarte/aula1-github.git");
		System.out.println("No Eclipse use File->Import->General->Existing projects into workspace ");
		
		System.out.println("-----------------------------------------------------------");

		System.out.println("para verificar se tem diferenca entre o repositorio original e o remoto comando\n"
				+ "git status");
		
		System.out.println("Para dar commit nas mudanças primeiro joga na area de stage com o comando\n"
				+ "git add .\nDepois commitar com o comando\n"
				+ "git commit -m \"nome da alteração\"\nPara enviar o commit para o github use o comando\n"
				+ "git push");

		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Para retornar ao status do ultimo commit comandos\n"
				+ "git clean -df\n"
				+ "git checkout -- .");
	}

}
