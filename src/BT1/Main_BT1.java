/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;



/**
 *
 * @author Administrator
 */
public class Main_BT1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       HoaDon hoadon = new HoaDon.Builder()
            .addhdheader(new HoaDonHeader("HD1", "Trân Văn Tý", "07/11/2020"))
               
            .addcthd(new CTHD("Dép lào", 5, 20000, 5))
            .addcthd(new CTHD("Dép quai hậu", 10, 200000, 10))
            .build();
        System.out.println(hoadon.toString());
               
    }
            
   
             
   
    
}
