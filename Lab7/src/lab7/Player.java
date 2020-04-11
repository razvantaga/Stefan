/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import  java.lang.Runnable;
public class Player 
        implements Runnable{
    private char name;
    private int nr_jet;
    
   public char getName(){
       return name;
   }
    
    public int getNrJetoane(){
        return nr_jet;
    }
    
    public void run(){
        int count=100;
        for(int i=0;i<count;i++){
            ArrayList<Token> list=new ArrayList<Token>(count);
            if(list.get(i)!=null)
                nr_jet++;
        }
    }
}
