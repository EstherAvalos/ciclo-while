import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (num>0) {
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
          
        }
        JOptionPane.showMessageDialog(null, --num);
    }
}
