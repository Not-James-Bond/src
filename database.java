import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class database extends JFrame implements ActionListener

{
//declaring GUI Controls

 JLabel lblname;
 JTextField txtname;
 JLabel lblsub;
 JTextField txtsub;
 JButton b1,b2;
 static JPanel p1;


//variables for connection, command and recordset
 Connection connect;  
 PreparedStatement pstm;
 ResultSet rs;
 String sql;


database()
{
//initialising GUI controls

lblname=new JLabel("Please enter your name");
txtname = new JTextField(25);
lblsub=new JLabel("Please enter Subject");
txtsub = new JTextField(25);
b1= new JButton("Save");
b2= new JButton("Show");
p1= new JPanel();
getContentPane().add(p1);
setVisible(true);

setSize(300,300);

//Adding controls on panel
p1.add(lblname);
p1.add(txtname);
p1.add(lblsub);
p1.add(txtsub);
p1.add(b1);
p1.add(b2);


//attach control with actionlistener
b1.addActionListener(this);
b2.addActionListener(this);
}

public static void main(String srgs[])
{
database d = new database();


}

public void actionPerformed(ActionEvent ae)
{
Object obj= ae.getSource();
if (obj == b1)
{
// Code to save data in database
 try {  
//Establisshing Connection
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection connect =DriverManager.getConnection("jdbc:odbc:BCA");
pstm=connect.prepareStatement("insert into login values(?,?)");
        pstm.setString(1,txtname.getText());
        pstm.setString(2,txtsub.getText());
       //execute method to execute the query
          pstm.executeUpdate();
	  pstm.close();
          connect.close();
    JOptionPane.showMessageDialog(null,"data inserted","Confirmation", JOptionPane.INFORMATION_MESSAGE);  
       
    } catch (Exception e) {  
     JOptionPane.showMessageDialog(null,"Failed to Connect to Database","Error Connection", JOptionPane.ERROR_MESSAGE);  
     System.exit(0);  
    }  
}
else
{

 try {  
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection connect =DriverManager.getConnection("jdbc:odbc:BCA");
Statement s= connect.createStatement();
String str = "select * from login";
s.execute(str);
ResultSet rs = s.getResultSet();
while((rs!=null) && (rs.next()))
            {
                System.out.println(rs.getString(1) + " : " + rs.getString(2));
            }

     JOptionPane.showMessageDialog(null,"Data displayd on console","Data From Database", JOptionPane.INFORMATION_MESSAGE);  

       
    } catch (Exception e) {  
                System.out.println(e);  
     JOptionPane.showMessageDialog(null,"Failed to Connect to Database","Error Connection", JOptionPane.ERROR_MESSAGE );  
     System.exit(0);  
    }  
}
}
}










