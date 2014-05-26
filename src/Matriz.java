
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhon Vargas
 */
public class Matriz {
    int mat [][];
    int fil ;
    int col;
    public  Matriz (){
        mat = new int [10][10];
        fil =0;
        col =0;
    }
    public void setFil(int f ){
        fil = f;
    }
    public int getFil(){
        return fil;
    }
    public void setCol(int c ){
        col = c;
    }
    public int getCol(){
        return col;
    }
    public void setElem(int a,int i, int j){
        mat[i][j] = a;
    }
    public int getElem(int i,int j){
       return mat[i][j];
    }

    

}
