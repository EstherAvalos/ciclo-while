import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while (numero>0) {
            if(numero<-1){
                
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            System.out.println(numero);
        }

    }
}
