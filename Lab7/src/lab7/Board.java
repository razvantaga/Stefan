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
public class Board {
    private ArrayList<Token> list;
    private int m;
    
    public void Board(){
        list=null;
        m=0;
    }
    
    public int getNumber(){
        for(int i=0;i<list.size();i++)
            m++;
    return m;
    }
}
