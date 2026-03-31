
import model.Circulo;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Circulo x = new Circulo();

        //x.setPi(Double.parseDouble(JOptionPane.showInputDialog("Diga o valor de Pi: ")));
        x.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Diga o valor do raio da circunferência: ")));

        JOptionPane.showMessageDialog(null, "a area da circunferencia é = " + x.getArea());

    }
}
