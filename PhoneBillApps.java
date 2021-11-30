/*Group 2:
 * Nur Syafiqah bt Nor Azizam 2016299276
 * Nur Ainin Sofiya bt Ahmad Rozaidi 2016284118
 * Noor Adzleen bt Arsad 2016299234
 * Nurul Syakirah bt Norizan 2016299218
 */

import java.util.Scanner;
public class PhoneBillApps
{
    
    public static void main(String[]args)
    {
        
           Scanner inp=new Scanner(System.in);
           
         
          //Declare array
          
          PhoneBill[]arrPhoneBill;
          
          arrPhoneBill=new PhoneBill[3];
           
          for(int j=0;j<3;j++)
          {
              System.out.print("Enter your staff number?: ");
              String StaffNum=inp.next();
              System.out.print("Enter your name? :");
              String nm=inp.next();
              System.out.print("Enter department name?:");
              String Deptnm=inp.next();
              System.out.print("How many minutes?:");
              int mins=inp.nextInt();
              
              arrPhoneBill[j]=new PhoneBill(StaffNum,nm,Deptnm,mins);
            }
            
            double totpriceHRC=0.0;
            double totpriceSALE=0.0;
            double totpriceACCT=0.0;
            
            for(int j=0;j<arrPhoneBill.length;j++)
            {
                
               
                switch(arrPhoneBill[j].getDeptName())
               {
                   case "HRC":totpriceHRC=totpriceHRC+arrPhoneBill[j].calcPhoneBill();
                               break;
                   case "SALE":totpriceSALE=totpriceSALE+arrPhoneBill[j].calcPhoneBill();
                                break;
                   case "ACCT":totpriceACCT=totpriceACCT+arrPhoneBill[j].calcPhoneBill();
                                break;
                }
                
                
            }
            System.out.println("Total price of Phone Bill for HRC deparment is RM "+"\t"+totpriceHRC);
            System.out.println("Total price of Phone Bill for SALE deparment is "+"\t"+totpriceSALE);
            System.out.println("Total price of Phone Bill for ACCT deparment is "+"\t"+totpriceACCT);
            
            
            //check the highest phone bill 
            double max=0.0;
            
            for(int j=0;j<3;j++)
            {
                if(arrPhoneBill[j].calcPhoneBill()>max)
                {
                    max=arrPhoneBill[j].calcPhoneBill();
                }
            }
            
            System.out.println("The highest amount of phone billl is RM"+"\t"+max);
            
            
            //check the min phone bill
            double min=max;
            
            for(int j=0;j<3;j++)
            {
                if(arrPhoneBill[j].calcPhoneBill()<min)
                {
                    min=arrPhoneBill[j].calcPhoneBill();
                    to.String()=arrPhoneBill[j];
                }
            }
            
            System.out.println("The lowest amount of phone bill is RM"+"/t"+min);
            System.out.println(arrPhoneBill[to.String()]);
            
                
             
            
                
                
                
                
                
                
                     
                     
          
           
            
     
                
            
                
                          
                       
                   

              
            }
            
           
                 
                
            
              
              
              

            
                
                
            
    }

    