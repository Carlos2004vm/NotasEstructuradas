import javax.swing.JOptionPane;

public class notasestructuradas {
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <= 2; est++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la nota 1 del estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la nota 2 del estudiante"));
            float notafinal = (nota1 + nota2) / 2;
            JOptionPane.showInputDialog(null, "Informacion del estudiante}\nnombre: " + nombre + "nota final:" + notafinal);
            if (notafinal <= 3) {
                 JOptionPane.showInputDialog(null, "El estudiante reprobo el curso");
            }else{
                JOptionPane.showInputDialog(null, "El estudiante aprobo el curso");
            }
        }
    }
}
