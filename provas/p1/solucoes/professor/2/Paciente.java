public class Paciente {
    private String nome;
    private int idade;
    private int contadorDeComorbidades;

    private Comorbidade[] comorbidades;

    public Paciente(String nome, int idade) {
        setNome(nome);
        setIdade(idade);

        comorbidades = new Comorbidade[10];
        setContadorDeComorbidades(0);
    }

    public void adicionaComorbidade(Comorbidade comorbidade) {
        comorbidades[contadorDeComorbidades] = comorbidade;
        setContadorDeComorbidades(getContadorDeComorbidades()+1);
    }

    public boolean possuiComorbidade(String nomeDaComorbidade) {
        for(int i = 0 ; i < contadorDeComorbidades ; i++) {
            Comorbidade comorbidadeAtual = comorbidades[i];

            if(comorbidadeAtual.getNome().equals(nomeDaComorbidade))
                return true;
        }
        return false;
    }

    public boolean possuiComorbidade() {
        if(getContadorDeComorbidades() == 0)
            return false;
        else
            return true;
    }

    public String toString() {
        String texto;

        texto = getNome();
        texto += ",";
        texto += getIdade();
        texto += ",";

        for(int i = 0 ; i < contadorDeComorbidades ; i++) {
            texto += comorbidades[i].getNome();
            texto += ",";
        }

        return texto;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0)
            this.idade = idade;
    }

    public void setContadorDeComorbidades(int contadorDeComorbidades) {
        if(contadorDeComorbidades > 0)
            this.contadorDeComorbidades = contadorDeComorbidades;
    }

    public int getContadorDeComorbidades() {
        return contadorDeComorbidades;
    }
}
