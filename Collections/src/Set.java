public class Set {

    // Atributos
    private String nome;
    private int codigoConvidado;

    public Set(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public String toString() {
        return "Set [nome=" + nome + ", codigoConvidado=" + codigoConvidado + "]";
    }

}
