/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author shakil10vr
 */
public class MethodExample {
    public static int sum(int x, int y)
    {
        int total =0;
        
        for(int i=x;i<y;i++)
        {
            total= total+i;
        }
        return total;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sum(1,10));
    }
    
}
