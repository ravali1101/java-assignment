import java.io;

class AlphaOrder
{
    public static void main (String args[]) 
    {
            String str,s1,s2,len,result="";
            int i,j;
                 try{
                      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
                      System.out.print("Enter String : ");
                      System.out.flush();
                      str=obj.readLine();
                      len=str.length();
                      for(int i=0;i<len;i++)
                      {
                          for(int j=i+1;j<len;j++)
                          {
                              s1=str.charat(i);
                              s2=str.charat(j);
                              if(s1 < s2)
                                  result.concat(s1);
                              else
                                  result.concat(s2);
                          }
                      }
                    }
    catch(Exception e) {}
    }
}