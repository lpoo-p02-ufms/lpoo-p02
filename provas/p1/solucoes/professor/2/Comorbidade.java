public class Comorbidade {
    private String nome;
    private int anosDeConvivencia;

    public Comorbidade(String nome, int anosDeConvivencia) {
        setNome(nome);
        setAnosDeConvivencia(anosDeConvivencia);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnosDeConvivencia(int anosDeConvivencia) {
        if(anosDeConvivencia > getAnosDeConvivencia())
            this.anosDeConvivencia = anosDeConvivencia;
    }

    public int getAnosDeConvivencia() {
        return anosDeConvivencia;
    }
}
