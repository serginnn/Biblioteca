
import java.util.Scanner;
import java.util.ArrayList;

public class Trab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        biblioteca biblioteca = new biblioteca(); 
        int x;
        do{
        System.out.println("------MENU------");
        System.out.println("1- Adicionar livro a uma biblioteca");
        System.out.println("2- Procurar um livro");
        System.out.println("3- Mostrar todos os livros da biblioteca");
        System.out.println("4- Sair");
        x = sc.nextInt();
        sc.nextLine(); 

        switch (x) {
            case 1:
                System.out.println("Digite o título do livro: ");
                String titulo = sc.nextLine();
                System.out.println("Digite o autor do livro: ");
                String autor = sc.nextLine();
                System.out.println("Digite o ISBN do livro: ");
                String isbn = sc.nextLine();
                Livro novoLivro = new Livro(titulo, autor, isbn);
                biblioteca.adicionarLivro(novoLivro);
                System.out.println("Livro adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Digite o título do livro a ser procurado: ");
                String tituloBuscado = sc.nextLine();
                Livro livroEncontrado = biblioteca.buscarLivro(tituloBuscado);
                if (livroEncontrado != null) {
                    System.out.println("Livro encontrado - Título: " + livroEncontrado.getTitulo() +
                            ", Autor: " + livroEncontrado.getAutor());
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            case 3:
                biblioteca.mostrarLivros();
                break;
            case 4:
                System.out.println("Saindo do programa.");
                System.exit(0);
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        } 
    } while(x!=4); 
        sc.close();
    }
}