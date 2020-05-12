/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class HoaDon 
{
    HoaDonHeader hdheader;
    ArrayList<CTHD> cthd = new ArrayList<>();

    public HoaDon() {
    }

    protected HoaDon(Builder buider) 
    {
        this.hdheader=buider.hdheader;
        this.cthd=buider.cthd;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "hdheader=" + hdheader + ", cthd=" + cthd.toString() + '}';
    }

   
    
   public static class Builder 
    {
        
        HoaDonHeader hdheader;
        ArrayList<CTHD> cthd = new ArrayList<>();

       public Builder() {
           
        }

      
        public Builder addhdheader(HoaDonHeader hdheader)
        {
            this.hdheader = hdheader;
            return this;
        }
        public Builder addcthd( CTHD cthd)
        {
            this.cthd.add(cthd);
            return this;
        }
     
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

}
