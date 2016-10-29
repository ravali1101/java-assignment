class AreaTriCir
{  
  public static void main(String args[])
  {  
    int a=5;
    switch(a)
    {
      case 1: 
      { 
        int b=2,h=3,area; 
        area=(b*h)/2;
        System.out.println("The area of triangle is : "+area);
        break; 
      }   
      case 2: 
      { 
        double area;
        double r=2;
        area=3.14594*r*r;
        System.out.println("area of circle is : "+area);
        break;
      }
      default:
      {
        System.out.println("Wrong Choice");
      }
    }    
       
  }  
}  