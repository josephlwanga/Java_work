/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joseph;

/**
 *
 * @author Christian Rusipa
 */
public class Joseph {

    /**
     * @param args the command line arguments
     */

        public static void main(String args[]){
try{
int a[] = new int[4];
System .out.println("Access elem ent three :" + a[6]);
}catch(ArrayIndexOutOfBoundsException e){
System .out.println("Exception thrown :" + e);
}
System .out.println("Out of the block");
}
        // TODO code application logic here
    }
    

