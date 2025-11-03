public class Main {
    public static void main(String[] args) {
        // Criando autores
        Autor autor1 = new Autor("J.K. Rowling", "Britânica");
        Autor autor2 = new Autor("George R. R. Martin", "Americano");

        // Criando livros
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Livro livro2 = new Livro("Game of Thrones", "George R. R. Martin", 1996);
        LivroDigital livroDigital1 = new LivroDigital("O Hobbit", "J.R.R. Tolkien", 1937, "EPUB");

        // Criando clientes
        Cliente cliente1 = new Cliente("Lucas", 25, true);
        Cliente cliente2 = new Cliente("Ana", 30, false);

        // Criando funcionários
        Funcionario funcionario1 = new Funcionario("Roberto", "Bibliotecário");

        // Criando uma biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 123");

        // Criando categorias
        Categoria categoria1 = new Categoria("Fantasia");
        Categoria categoria2 = new Categoria("Ficção Científica");

        // Criando editora
        Editora editora1 = new Editora("Editora Fantasy", "Avenida Liberdade, 456");

        // Registro de livros e clientes
        funcionario1.registrarLivro(livro1);
        funcionario1.registrarLivro(livro2);
        funcionario1.registrarLivro(livroDigital1);
        funcionario1.registrarCliente(cliente1);
        funcionario1.registrarCliente(cliente2);

        // Categorias
        categoria1.adicionarLivro(livro1);
        categoria2.adicionarLivro(livro2);

        // Publicando livros
        editora1.publicarLivro(livro1);
        editora1.publicarLivro(livro2);

        // Empréstimos e devoluções
        cliente1.emprestarLivro(livro1);
        cliente1.emprestarLivro(livro2); // Tentando emprestar um livro não disponível
        cliente2.emprestarLivro(livro1); // Cliente sem carteira

        // Devoluções
        cliente1.devolverLivro(livro1);

        // Transações
        Transacao transacao1 = new Transacao(cliente1, livro1, "Emprestar");
        transacao1.realizarTransacao();
        Transacao transacao2 = new Transacao(cliente1, livro1, "Devolver");
        transacao2.realizarTransacao();
    }
}
