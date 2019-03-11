/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

class zz{
  JFrame jf;
 JTable jt;
 JScrollPane js;
 zz(){
     String m[]={"blood type","unit"};
     String z[][]=new String[8][2];
     try {
               Class.forName("oracle.jdbc.OracleDriver");
               Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","MINI","123456789");
               PreparedStatement p = c.prepareStatement("select unit from blood");
               ResultSet r = p.executeQuery();
               r.next();
              
               String abneg = r.getString(1);
              r.next();
               String bpos = r.getString(1);
              r.next();
               String bneg = r.getString(1);
               r.next();
               String oneg = r.getString(1);
               r.next();
               String opos = r.getString(1);
               r.next();
               String abpos = r.getString(1);
                r.next();
               String apos = r.getString(1);
               r.next();
               String aneg = r.getString(1);
               System.out.println(abneg+" "+bpos+" "+bneg+" "+oneg+" "+opos+" "+abpos+" "+apos+" "+aneg);
               z[0]=new String[2];
               z[0][0]="A-";
               z[0][1]=abneg;
              z[1]=new String[2];
               z[1][0]="B+";
               z[1][1]=bpos;
               
               z[2]=new String[2];
               z[2][0]="B-";
               z[2][1]=bpos;
               
               z[3] = new String[2];
               z[3][0] = "O-";
               z[3][1] = oneg;
               
               z[4] = new String[2];
               z[4][0] = "O+";
               z[4][1] = opos;
               
               z[5] = new String[2];
               z[5][0] = "AB+";
               z[5][1] = abpos;
               
               z[6] = new String[2];
               z[6][0] = "A+";
               z[6][1] = apos;
               
               z[7] = new String[2];
               z[7][0] = "A-";
               z[7][1] = aneg;
      
     
     }
     catch(Exception e){
         
     }
     
     jf=new JFrame();
 jt=new JTable(z,m);
 js=new JScrollPane(jt);
 jf.add(js);
 jf.setVisible(true);
 jf.setSize(200,300);
     
     
     
 }
    

}


public class demo_table {
    
  public static void main(String a[]){
      
      new zz();
  }
}
