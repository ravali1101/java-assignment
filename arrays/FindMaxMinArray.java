public class FindMaxMinArray
{
    public static void main(String[] args) 
    {
       	int num[]=new int[]{4,43,5,54,3,65,6,99,10,23};
        int min=num[0];
        int max=num[0];
        for(int i=1;i<num.length;i++)
                {
                        if(num[i]>max)
                                max=num[i];
                        else if (num[i]<min)
                                min=num[i];
                       
                }
                System.out.println("the min number in given array is : "+min);
                System.out.println("the max number in given array is : "+max);
    }
}
