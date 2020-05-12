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
public class MyStringBuilder {
    String str;

    protected MyStringBuilder(Builder builder) {
        this.str=builder.str;
    }
    
    public static class Builder
    {
        String str="" ;

        public Builder() {
            
        }
        public Builder addString(String s)
        {
            this.str=this.str+s;
            return this;
        }
        public Builder addFloat(float f)
        {
            this.str=this.str+f;
            return this;
        }
        public Builder addBool(boolean b)
        {
            this.str=this.str+b;
            return this;
        }

       public MyStringBuilder builder()
       {
           return new MyStringBuilder(this);
       }
        
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
    
}
