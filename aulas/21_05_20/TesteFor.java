public class TesteFor {
    public static void main(String[] args) {
        int vetor[3] = new int[5];
        vetor[0] = 10;
        vetor[1] = 15;
        vetor[2] = 20;

        for(int i = 0, conteudoAtual ; i < vetor.length ; i++) {
            conteudoAtual = vetor[i];

            System.out.println(conteudoAtual);
        }

        for(int conteudoAtual : vetor) {
            conteudoAtual = leitor.leInteiro();
        }

    }
}
