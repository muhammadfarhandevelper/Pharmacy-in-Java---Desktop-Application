package AllPages;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class databasefile {

    Connection con;
    Statement st;
    ResultSet rs;

    databasefile() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muqaddas_phramacy", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ResultSet adminlogin(String username, String password) {
        int check = 0;
        String query = "select username, password from admin where username='" + username + "' AND password='" + password + "'";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            check = 1;
            if(check==1){
                Adminlogin adl = new Adminlogin();
               JOptionPane.showMessageDialog(adl,"Please on Server ","Alert",0);
            }
            System.out.println(e);
            
        }

        return rs;
    }

    public int medicineinsert(String medicinename, String medicineformula, String medicineweight,String medicine_quantity ,String expiredate, String medicine_one_price , String medicineprice) {
        int a = 0;
        String query = "insert into medicine_table (medicine_name , medicine_formula , medicine_weight , medicine_quantity ,expire_date ,medicine_one_price ,total_price) values ('" + medicinename + "' , '" + medicineformula + "' , '" + medicineweight + "' , '"+medicine_quantity+"' ,'" + expiredate + "', '"+medicine_one_price+"' ,'" + medicineprice + "')";
        try {
            a = st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }

        return a;
    }

    public ResultSet medicinedata() {

        String query = "select * from medicine_table";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }

        return rs;
    }

    public ResultSet medicinefilterdata(String search) {
        search = search + "%";
        String query = "select * from medicine_table where medicine_name LIKE '" + search + "' OR medicine_formula LIKE '" + search + "'";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public void deleteRecords(String search) {
        String query = "delete from medicine_table where ID ='" + search + "'";
        try {
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void UpdatemedicineRecord(String medicinename, String medicineformula, String medicineweight,String medicine_quantity ,String expiredate, String medicine_one_price , String medicineprice ,int medicineid) {
        String query = " update medicine_table  set medicine_name='" + medicinename + "', medicine_formula='" + medicineformula + "', medicine_weight='" + medicineweight + "', medicine_quantity='"+medicine_quantity+"' ,expire_date='" + expiredate + "', medicine_one_price='"+medicine_one_price+"' ,total_price='" + medicineprice + "' where ID= '" + medicineid + "'";
        try {
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int  sellerdata(String s_name, String s_company, int s_bill, String selldate) {
        int a =0;
        String query = "insert into seller_table (seller_name, seller_company, seller_bill_amount, seller_date)values ('" + s_name + "', '" + s_company + "', '" + s_bill + "' , '" + selldate + "')";
        try {
            a= st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }

    public ResultSet sellerfilterdata(String search) {
        search = search + "%";
        String query = "select * from seller_table where seller_name LIKE '" + search + "' OR seller_company LIKE '"+search+"' OR seller_date LIKE '"+search+"'";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public ResultSet sellerdataTable() {
        String query = "select * from seller_table";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(rs);
        return rs;
    }

    public void deletesellerRecords(String search) {
        String query = "delete from seller_table where  ID = '" + search + "' ";
        try {
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Updatesellerrecords(String s_name, String s_company, int s_bill, String selldate, int s_id) {
        String query = "update seller_table set seller_name = '" + s_name + "' , seller_company= '" + s_company + "' , seller_bill_amount = '" + s_bill + "', seller_date='" + selldate + "'  where ID = '" + s_id + "'";
        try {
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //   Employee DataBase
    public int  Employeeinsert(String e_name, String e_sal, String emp_date, String emp_status) 
    {
        int a = 0;
        String query = "insert into employee_table (employee_name, employee_sallary, Joinning_date , sallary_status)values ('" + e_name + "', '" + e_sal + "' , '" + emp_date + "' , '" + emp_status + "')";
        try {
          a =  st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }

    public ResultSet employeedata() 
    {
        String query = "select * from employee_table";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public ResultSet employeefilterdata(String search) {
        
        search = search + "%";
        String query = "select * from employee_table where id LIKE '" + search + "' OR employee_name LIKE '" + search + "' OR employee_sallary LIKE '" + search + "' OR Joinning_date LIKE '" + search + "'";
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public void DeleteEmployeeRecord(String search) {
        
        String query = "delete from employee_table where id = '"+search+"'";
        try 
        {
            st.executeUpdate(query);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

    }

    public int UpdateEmployeeRecords( String e_name, String e_sal, String emp_date, String emp_status, int e_id) {
        int a = 0;
        String query = "update employee_table set employee_name= '" +e_name + "' , employee_sallary= '" + e_sal + "' , Joinning_date= '"+emp_date+"' , sallary_status = '"+emp_status+"' where ID = '" + e_id + "'";
        try 
        {
            a = st.executeUpdate(query);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return a;
    }
  
    public int totalemployee()
  {
      int totalemployee=0;
      try{
      String query = "select COUNT(*) from employee_table"; 
      rs=st.executeQuery(query);
      rs.next();
      totalemployee = rs.getInt(1);
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return totalemployee;
  }
    
      public int totalmedicine()
  {
      int totalmedicine=0;
      try{
      String query = "select COUNT(*) from medicine_table"; 
      rs=st.executeQuery(query);
      rs.next();
      totalmedicine = rs.getInt(1);
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return totalmedicine;
  }
         public int totalsellers()
  {
      int totalsellers=0;
      try{
      String query = "select COUNT(*) from seller_table"; 
      rs=st.executeQuery(query);
      rs.next();
      totalsellers = rs.getInt(1);
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return totalsellers;
  }
   
   public int totalsell()
  {
      int totalsell=0;
      try{
      String query = "select sum(total_price) from medicine_table"; 
      rs=st.executeQuery(query);
      if(rs.next()){
      totalsell = rs.getInt(1);
      }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return totalsell;
  }   
    
  public int expireproductcount(String firstdate , String lastdate){
      int expireproduct=0;
      
                  
      try{
          
          String query = "select COUNT(ID) from medicine_table where expire_date between '"+firstdate+"' AND '"+lastdate+"';";
          rs = st.executeQuery(query);
          if(rs.next()){
              expireproduct = rs.getInt(1);
          }
          
      }catch(Exception e){
          System.out.println(e);
      }
      
      return expireproduct;
  }

   public ResultSet expirechecker(String firstdate , String lastdate){
    
       
         String query = "select * from medicine_table where expire_date between '"+firstdate+"' AND '"+lastdate+"'";    
       
       try{
            
           
         rs = st.executeQuery(query);
        
           
       }catch(Exception e){
           System.out.println(e);
       }

return rs;
}
   
}


