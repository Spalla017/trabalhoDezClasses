class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println(titulo + " foi emprestado.");
        } else {
            System.out.println(titulo + " não está disponível no momento.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println(titulo + " foi devolvido.");
    }
}

class Autor {
    String nome;
    String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public void escreverLivro(Livro livro) {
        System.out.println(this.nome + " escreveu o livro: " + livro.titulo);
    }
}

class Cliente {
    String nome;
    int idade;
    boolean possuiCarteiraBiblioteca;

    public Cliente(String nome, int idade, boolean possuiCarteiraBiblioteca) {
        this.nome = nome;
        this.idade = idade;
        this.possuiCarteiraBiblioteca = possuiCarteiraBiblioteca;
    }

    public void emprestarLivro(Livro livro) {
        if (possuiCarteiraBiblioteca) {
            livro.emprestar();
        } else {
            System.out.println(nome + " não possui uma carteira de biblioteca válida.");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
    }
}

class Funcionario {
    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void registrarCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.nome + " registrado com sucesso.");
    }

    public void registrarLivro(Livro livro) {
        System.out.println("Livro " + livro.titulo + " registrado na biblioteca.");
    }
}

class Categoria {
    String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        System.out.println("Livro " + livro.titulo + " adicionado à categoria " + nome);
    }
}

class Transacao {
    Cliente cliente;
    Livro livro;
    String tipoTransacao;

    public Transacao(Cliente cliente, Livro livro, String tipoTransacao) {
        this.cliente = cliente;
        this.livro = livro;
        this.tipoTransacao = tipoTransacao;
    }

    public void realizarTransacao() {
        if (tipoTransacao.equals("Emprestar")) {
            cliente.emprestarLivro(livro);
        } else if (tipoTransacao.equals("Devolver")) {
            cliente.devolverLivro(livro);
        }
    }
}

class Biblioteca {
    String nome;
    String endereco;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarInfo() {
        System.out.println("Bem-vindo à biblioteca " + nome + " localizada em " + endereco);
    }
}

class Editora {
    String nome;
    String endereco;

    public Editora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void publicarLivro(Livro livro) {
        System.out.println("Editora " + nome + " publicou o livro: " + livro.titulo);
    }
}

class LivroDigital extends Livro {
    String formato;

    public LivroDigital(String titulo, String autor, int anoPublicacao, String formato) {
        super(titulo, autor, anoPublicacao);
        this.formato = formato;
    }

    @Override
    public void emprestar() {
        System.out.println("Empréstimo do livro digital " + titulo + " no formato " + formato);
    }

    @Override
    public void devolver() {
        System.out.println("Livro digital " + titulo + " devolvido.");
    }
}
