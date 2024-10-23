import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Vui long nhap ten cua ban: ");
        JOptionPane.showMessageDialog(null, "Xin chao " +result + "!");
        System.exit(0);
    }

}
