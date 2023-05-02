import java.time.LocalDate;

public class Usuario {
    private int codigo;
    private String nome;
    private String senha;
    private int tentativasAcesso;
    private boolean primeiroAcesso;
    private LocalDate dataInativacao;
    private StatusUsuarioEnum status;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        primeiroAcesso = false;
        status = StatusUsuarioEnum.ATIVO;
        tentativasAcesso = 0;
        this.senha = senha;
    }

    public int getTentativasAcesso() {
        return tentativasAcesso;
    }

    public void setTentativasAcesso(int tentativasAcesso) {
        this.tentativasAcesso = tentativasAcesso;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public LocalDate getDataInativacao() {
        return dataInativacao;
    }

    public void setDataInativacao(LocalDate dataInativacao) {
        this.dataInativacao = dataInativacao;
    }

    public StatusUsuarioEnum getStatus() {
        return status;
    }

    public void setStatus(StatusUsuarioEnum status) {
        this.status = status;
    }

    public Usuario() {
        this.senha = "etec#123";
        this.primeiroAcesso = true;
        this.status = StatusUsuarioEnum.ATIVO;
    }
    void inativar(){
        dataInativacao = LocalDate.now();
        primeiroAcesso = false;
        status = StatusUsuarioEnum.INATIVO;
    }

    public String autenticar(String senha) {

        if (tentativasAcesso >= 3){
            status = StatusUsuarioEnum.BLOQUEADO;
            return ("Acesso negado");
        }
        if (status.equals(StatusUsuarioEnum.INATIVO) || status.equals(StatusUsuarioEnum.BLOQUEADO)) {
            return ("Acesso negado");
        }
        if (senha == "etec#123") {
            tentativasAcesso = 0;
            return ("Acesso liberado");
        }
        else if (senha != "etec#123"){
            tentativasAcesso += 1;
            return ("Usuario/senha inválidos");
        }
            return senha;
    }
    void exibirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Usuario: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Trocar senha: " + primeiroAcesso);
        System.out.println("Status: " + status);
        System.out.println(tentativasAcesso);
        System.out.println("------------------");
    }


}
