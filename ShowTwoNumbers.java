import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNoti = "Mày vừa nhập: ";
        strNum1 = JOptionPane.showInputDialog(null, " Hãy nhập số thứ 1", "Input the first number", JOptionPane.INFORMATION_MESSAGE);

        strNoti += strNum1 + " and " ;

        strNum2 = JOptionPane.showInputDialog(null, "Hãy nhập số thứ 2: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNoti += strNum2;
        
        JOptionPane.showMessageDialog(null, strNoti, "Show two number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    


    }
}
