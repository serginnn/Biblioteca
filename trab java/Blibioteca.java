import java.util.ArrayList;

class biblioteca { 
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) { 
        livros.add(livro);
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void mostrarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
            }
        }
    }
}
