import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        char nuevaNota='0';
        Byte Registro= Byte.parseByte(JOptionPane.showInputDialog("Ingrese su calificación"));
        if (Registro>=19 && Registro<=20) {
            nuevaNota='A';
        } else if (Registro >=16 && Registro<=18) {
            nuevaNota='B';
        } else if (Registro>=13 && Registro<=15) {
            nuevaNota='C';
        } else if (Registro>=10 && Registro <=12) {
            nuevaNota='D';
        }else if (Registro>=1 && Registro <=9) {
            nuevaNota='E';
        } else {
            JOptionPane.showMessageDialog(null,"El valor ingresado no es valido");
        }
        JOptionPane.showMessageDialog(null, "Calificacion: "+ Registro +"\n Nota: "+ nuevaNota);
        }
    }
