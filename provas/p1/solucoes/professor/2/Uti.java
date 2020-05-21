import javax.swing.JOptionPane;

public class Uti {

    public static void cadastrarComorbidades(Paciente paciente, Leitor leitor) {
        String temComorbidade;
        temComorbidade = leitor.leString("O paciente tem comorbidades? (S) para sim e (N) para não");
        if(temComorbidade.equals("S")){
            int quantidadeDeComorbidades;
            quantidadeDeComorbidades = leitor.leInteiro("Quantas comorbidades o paciente tem?");

            String nomeDaComorbidade;
            int anosDeConvivencia;
            for(int i = 0 ; i < quantidadeDeComorbidades ; i++) {
                nomeDaComorbidade = leitor.leString("Qual o nome da comorbidade?");
                anosDeConvivencia = leitor.leInteiro("Há quantos anos o paciente convive com ela?");

                Comorbidade comorbidade = new Comorbidade(nomeDaComorbidade, anosDeConvivencia);

                paciente.adicionaComorbidade(comorbidade);
            }
        }
    }

    public static void main(String[] args) {

        ListaInfinitaPaciente pacientes = new ListaInfinitaPaciente(10);
        Leitor leitor = new Leitor();

        int opcao;

        do {
            String menu = "(1) Cadastrar um paciente\n";
            menu += "(2) Listar todos os pacientes\n";
            menu += "(3) Listar todos os pacientes com uma determinada comorbidade\n";
            menu += "(4) Listar todos os pacientes sem comorbidades\n";
            menu += "(5) Sair\n";

            opcao = leitor.leInteiro(menu);

            switch(opcao) {
                case 1:
                    String nome;
                    int idade;
                    nome = leitor.leString("Digite seu nome");
                    idade = leitor.leInteiro("Digite sua idade");

                    Paciente paciente = new Paciente(nome, idade);

                    cadastrarComorbidades(paciente, leitor);

                    // Objeto paciente está pronto!
                    pacientes.adicionaPaciente(paciente);

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, pacientes);

                    break;
                case 3:
                    String nomeDaComorbidade;

                    nomeDaComorbidade = leitor.leString("Digite o nome da comorbidade");

                    pacientes.imprimeComComorbidade(nomeDaComorbidade);

                    break;
                case 4:
                    pacientes.imprimeSemComorbidade();

                    break;
                case 5:
                    break;
            }
        } while(opcao != 5);


    }
}
