import javax.swing.JOptionPane;

public class Leitor {
    public static String leString(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static int leInteiro(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }
}
