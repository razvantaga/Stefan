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
import java.lang.Thread;
public class Game extends Thread{
    private Player p1;
    private Player p2;
    
    public void Game(){
        p1=null;
        p2=null;
    }
    
    public void Run(){
        Thread player1=new Thread();
        player1.start();
        p1.run();
        
        if(p1.getNrJetoane()!=0){
            Thread player2=new Thread();
            player2.start();
            p2.run();
        }
    }
}
