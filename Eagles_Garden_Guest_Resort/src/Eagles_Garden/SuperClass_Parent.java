/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eagles_Garden;

 import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author STEVE-KING
 */
public class SuperClass_Parent {
    
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    public double ChickenLegend;
    public double Filet_o_Fish;
    
    public double MilkShake;
    public double Vanilacone;
    public double ClassVanila;
    public double VanilaMilkShake;
    public double ChocolateMilkShake;
    
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalfMD;

    
    public double GetAmount()
    {
        Meals = Filet_o_Fish + ChickenBurger + ChickenBurgerM;
    
        Drinks = MilkShake + Vanilacone+ ClassVanila + VanilaMilkShake + ChocolateMilkShake;
            
        TotalofMD = Meals + Drinks;
            AllTotalfMD = TotalofMD;
            
            return AllTotalfMD;
            
    
    }
    
private JFrame frame;

public void iExitSystem(){
 frame=new JFrame("Exit");
  if ( JOptionPane.showConfirmDialog (frame,"confirm if you want to exit","Eagles Garden Managaement System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
      System.exit(0);
  }
  }
//===============================price===============================
 public double pChickenBurger=2.95;
    public double pChickenBurgerM=3.68;
    public double pBaconCheeseBurger=2.65;
    public double pChickenLegend=3-98;
    public double pFilet_o_Fish =3.56;
    
    public double pMilkShake=2.11;
    public double pVanilacone=2.20;
    public double pClassVanila=2.50;
    public double pVanilaMilkShake=1.95;
    public double pChocolateMilkShake=2.37;

    //==================================================================
    public double mcTax =0.90;
    
    public double cFindTax(double cAmount)
    {
        double FindTax =cAmount-(cAmount * mcTax);
        return FindTax;
        
    }
    //==================================================================
}




 

