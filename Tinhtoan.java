import javax.swing.JOptionPane;
public class Tinhtoan {
    public static void main(String[] args){
        String strNum1, strNum2;
       
        strNum1 = JOptionPane.showInputDialog(null, " Hãy nhập số thứ 1", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Hãy nhập số thứ 2: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double Cong1;
        double difference;
        double product;
        Cong1 = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        double quotient = 0;
        if (num2 != 0) {
            quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, quotient, "thuong", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Khong the chia cho 0");
        }

        JOptionPane.showMessageDialog(null, Cong1, "Tong", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, difference, "hieu", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, product, "tich", JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
        


    }
}
