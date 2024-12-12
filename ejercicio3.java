import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {
        int numero, elementos=0, suma=0;
        float media;

        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un númro"));

        while (numero>=0) {
            suma+=numero;
            elementos++;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro númro"));
        }
        if (elementos==0) {
            JOptionPane.showMessageDialog(null, "Error la division entre 0 no exixte");
        }else{
            media=(float) suma/elementos;
            JOptionPane.showMessageDialog(null, "La media es: "+media);
        }
    }
}
