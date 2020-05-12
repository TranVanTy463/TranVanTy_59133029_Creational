/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Administrator
 */
public class Main_BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder mstr = new MyStringBuilder.Builder()
                .addString(" Tên môn học : Mẫu thiết kế" )
                 .addString("\n" )
                .addString(" Điểm chuyên cần : " )
                .addFloat(6)
                .addString("\n" )
                 .addString(" Điều kiện dự thi :" )
                .addBool(true)
                .builder();
        System.out.println(mstr.toString());
    }
    
}
