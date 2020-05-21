import javax.swing.JOptionPane;

public class ListaInfinitaPaciente {
    private Paciente[] pacientes;
    private int quantidadeDePacientes;

    public ListaInfinitaPaciente(int tamanhoInicial) {
        setQuantidadeDePacientes(0);
        pacientes = new Paciente[tamanhoInicial];
    }

    public void adicionaPaciente(Paciente paciente) {
        if(getQuantidadeDePacientes() == pacientes.length)
            redimensionaVetor();

        pacientes[quantidadeDePacientes] = paciente;
        quantidadeDePacientes++;
    }

    private void redimensionaVetor() {
        Paciente[] novoVetor = new Paciente[pacientes.length*2];

        for(int i = 0 ; i < pacientes.length ; i++)
            novoVetor[i] = pacientes[i];

        pacientes = novoVetor;
    }

    private void setQuantidadeDePacientes(int quantidadeDePacientes) {
        if(quantidadeDePacientes > 0)
            this.quantidadeDePacientes = quantidadeDePacientes;
    }

    public int getQuantidadeDePacientes() {
        return quantidadeDePacientes;
    }

    public void imprimeSemComorbidade() {
        for(int i = 0 ; i < getQuantidadeDePacientes() ; i++) {
            if(!pacientes[i].possuiComorbidade())
                JOptionPane.showMessageDialog(null, pacientes[i]);
        }
    }

    public void imprimeComComorbidade(String nomeComorbidade) {
        for(int i = 0 ; i < getQuantidadeDePacientes() ; i++) {
            if(pacientes[i].possuiComorbidade(nomeComorbidade))
                JOptionPane.showMessageDialog(null, pacientes[i]);
        }
    }

    @Override
    public String toString() {
        String texto = "";
        for(int i = 0 ; i < getQuantidadeDePacientes() ; i++) {
            texto += pacientes[i].toString();
            texto += "\n";
        }

        return texto;
    }
}
