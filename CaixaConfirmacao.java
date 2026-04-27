import javax.swing.JOptionPane;

public class CaixaConfirmacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar.", "Resposta", JOptionPane.INFORMATION_MESSAGE);
        
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu não continuar.", "Resposta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

