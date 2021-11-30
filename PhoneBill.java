

public class PhoneBill
{
   private String StaffNo;
   private String name;
   private String deptName;
   private int minutes;

   
    public PhoneBill(String Staffnum , String n, String Deptnm, int mins)
    {
        StaffNo=Staffnum; 
        name= n;
        deptName=Deptnm;
        minutes=mins;
        
    }

    
    public String getStaffNo()
    {
        return StaffNo;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDeptName()
    {
        return deptName;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    
    public void setPhoneBill(String StaffNum, String n , String Deptnm, int mins)
    {
        StaffNo=StaffNum;
        name=n;
        deptName=Deptnm;
        minutes=mins;
    }
    
    public String display()
    {
        return"StaffNo:"+StaffNo+
        "\n Name :"+name+"\n Dept Name :"+deptName+
        "\n Minutes : "+minutes;
    }
        
    //processor
    public double calcPhoneBill()
        {
            double price=0.0;
           
            
            
            if(minutes<=100)
            {
                price=minutes*0.2;
            }
            else if(minutes>100 && minutes<=150)
            {
               price=(100*0.2)+(minutes-100)*0.35;
            }
            else
            {
               price=(100*0.2)+(150*0.35)+(minutes-250)*0.15;
            }
            
            return price;
        }
        
    
    
        
     
        
      
    
        
    
    
    
    
    
    
    
}

