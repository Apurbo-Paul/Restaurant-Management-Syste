/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Apurbo
 */
public class Superclass {
    
    public double Fish;
    public double Rice;
    public double Vegetable;
    public double Meat;
    public double Tehari;
    public double Friedrice;
    public double MorogPolaw;
    public double SutkiVorta;
    public double ChickenBiriani;
    public double KacciBiriani;
    
    public double ColdCoffee;
    public double VanilaIceCream;
    public double VanilaMilk;
    public double Sprite;
    public double Mirinda;
    public double Pepsi;
    public double CocaCola;
    public double MilkShake;
    public double Water;
    public double Borhani;
    
    
     public double Meals;
     public double Drinks;
     public double TotalofMD;
       
    public double AllTotalofMD;
    
     public double GetAmount()
     {
     Meals=Fish + Rice + Vegetable + Meat + Tehari + Friedrice + MorogPolaw + SutkiVorta+ChickenBiriani+KacciBiriani;
      Drinks= MilkShake + ColdCoffee + VanilaIceCream  + VanilaMilk + Sprite + Mirinda + Pepsi+ CocaCola+Water+Borhani;                                                                                            
     TotalofMD=Meals+Drinks;
     AllTotalofMD= TotalofMD;
        return  AllTotalofMD;
     }
     private JFrame frame;
     public void iExitSystem(){
     
      frame= new JFrame("Exit");
     if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restaurant Management System",
             JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
     System.exit(0);
     }

    
     }
   
    //==============Price=================//
     
    public double pFish=20;
    public double pRice=20;
    public double pVegetable=10;
    public double pMeat =80;
    public double pTehari=180;
    public double pFriedrice=80;
    public double pMorogPolaw=120;
    public double pSutkiVorta =40;
    public double pChickenBiriani=120;
    public double pKacciBiriani=160;
    
    public double pMilkShake=2;
    public double pVanilaMilk=3;
    public double pColdCoffee;
    public double pVanilaIceCream=50;
    public double pSprite=18;
    public double pMirinda=18;
    public double pPepsi=16;
    public double pCocaCola=18;
    public double pWater=20;
    public double pBorhani=120;
    
    
    public double mcTax = 0.90;
    public Double cFindTax(double cAmount)
    {
       double FindTax = cAmount - (cAmount * mcTax);
    return FindTax;
    
    }
        
}
