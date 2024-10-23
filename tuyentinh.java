import javax.swing.JOptionPane;
public class tuyentinh {
    public static void main(String[] args){
        //ax+b=0
        JOptionPane.showMessageDialog(null, " phan mem tinh toan ax+b=0");
        String a, b;
       
        a = JOptionPane.showInputDialog(null, " Hãy nhập hệ số a", "Nhập a", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Hãy nhập hệ số tự do b: ", "Nhập b", JOptionPane.INFORMATION_MESSAGE);
        double soa = Double.parseDouble(a);
        double sob = Double.parseDouble(b);
        double nghiem;
        nghiem = -sob /soa;
        if (soa !=0) {
            JOptionPane.showMessageDialog(null, nghiem, "nghiem cua phuong trinh la", JOptionPane.INFORMATION_MESSAGE);

        } else {
            if (sob != 0) {
            JOptionPane.showMessageDialog(null, "phuong trinh vo nghiem");
            } else { JOptionPane.showMessageDialog(null, "phuong trinh vo so nghiem"); }
        }
        // he phuong trinh

        String a12, a11, a21, a22, b2, b1;
        JOptionPane.showMessageDialog(null, " phan mem tinh toan he phuong trinh 2 an");
        a11 = JOptionPane.showInputDialog(null, " Hãy nhập hệ số a11", "Nhập a11", JOptionPane.INFORMATION_MESSAGE);
        a12 = JOptionPane.showInputDialog(null, " Hãy nhập hệ số a12", "Nhập a12", JOptionPane.INFORMATION_MESSAGE);
        b1 = JOptionPane.showInputDialog(null, "Hãy nhập hệ số tự do b1: ", "Nhập b1", JOptionPane.INFORMATION_MESSAGE);
        
        a21 = JOptionPane.showInputDialog(null, " Hãy nhập hệ số a21", "Nhập a21", JOptionPane.INFORMATION_MESSAGE);
        a22 = JOptionPane.showInputDialog(null, "Hãy nhập hệ số tự do a22: ", "Nhập a22", JOptionPane.INFORMATION_MESSAGE);
        b2 = JOptionPane.showInputDialog(null, "Hãy nhập hệ số tự do b2: ", "Nhập b2", JOptionPane.INFORMATION_MESSAGE);

        double soa11 = Double.parseDouble(a11);
        double soa12 = Double.parseDouble(a12);
        double soa21 = Double.parseDouble(a21);
        double soa22 = Double.parseDouble(a22);
        double sob1 = Double.parseDouble(b1);
        double sob2 = Double.parseDouble(b2);
        
        double D = soa11*soa22-soa21*soa12;
        double D1 = sob1*soa22 -sob2*soa12; // he Crammer
        double D2 = soa11*sob2 -soa21*sob1;
        double x1 =D1/D;
        double x2 =D2/D;
        
        if (D !=0) {
            JOptionPane.showMessageDialog(null, x1, "nghiem x1", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, x2, "nghiem x2", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (soa11/soa21 == soa12/soa22) {
                if (soa12/soa22 ==sob1/sob2) {
                    JOptionPane.showMessageDialog(null, "vo so nghiem");


                } else { 
                    JOptionPane.showMessageDialog(null, "vo  nghiem");
    

            } 
            }
        }
         // phuong trinh bac 2
         JOptionPane.showMessageDialog(null, " phan mem tinh toan ax^2+bx+c=0");
         String ak ,bk ,ck;
         ak = JOptionPane.showInputDialog(null, " Hãy nhập hệ số a", "Nhập a", JOptionPane.INFORMATION_MESSAGE);
         bk = JOptionPane.showInputDialog(null, " Hãy nhập hệ số b", "Nhập b", JOptionPane.INFORMATION_MESSAGE);
         ck = JOptionPane.showInputDialog(null, "Hãy nhập hệ số tự do c: ", "Nhập c", JOptionPane.INFORMATION_MESSAGE);
         double an = Double.parseDouble(ak);
         double bn = Double.parseDouble(bk);
         double cn = Double.parseDouble(ck);
         double denta = bn*bn-4*an*cn;
         if (an ==0) {
            if (bn !=0) {
                double no = -cn/bn;
                JOptionPane.showMessageDialog(null, no, "nghiem cua phuong trinh la", JOptionPane.INFORMATION_MESSAGE);
    
            } else {
                if (cn != 0) {
                JOptionPane.showMessageDialog(null, "phuong trinh vo nghiem");
                } else { JOptionPane.showMessageDialog(null, "phuong trinh vo so nghiem"); }
         }
         } else {
            if (denta > 0) {
                double xk1 = (-bn + Math.sqrt(denta)) / (2 * an);
                double xk2 = (-bn - Math.sqrt(denta)) / (2 * an);
                JOptionPane.showMessageDialog(null, xk1, "nghiem x1", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, xk2, "nghiem x2", JOptionPane.INFORMATION_MESSAGE);
        
             } else {
                if (denta ==0){
                    double xkj = -bn/(2*an);
                    JOptionPane.showMessageDialog(null, xkj , "nghiem x1", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "vo  nghiem");
                }
             }
            
         


        





    }
    }}
    
