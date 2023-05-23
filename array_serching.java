import java.net.ProtocolFamily;
import java.util.*;
public class array_serching {

public static void array(int marks[])
{
    for(int i=0;i<marks.length;i++)
    {
        marks[i]=marks[i]+1;
    }
}



 
public static int arraySc(int number[],int key)
{
  for(int i=0;i<number.length;i++)
  {
    if(number[i]==key)
    {
        return i;
    }
  }
    return -1;
    }
  


    public static int getLargest(int number[] )
   {
    int largest=Integer.MIN_VALUE;
    int Smallest=Integer.MAX_VALUE;
  for(int i=0;i<number.length;i++)
  {
    if(largest<number[i])
    {
        largest=number[i];
    }
}
for(int i=0;i<number.length;i++)
{
  if(Smallest>number[i])
  {
     Smallest=number[i];
  }
  
}
System.out.println("the smallest number inn the array is :"+Smallest);
return largest;
 
   }




   public static void reverseArray(int number[])
      {  
        System.out.print("the orginal array is : ");
        for(int j=0;j<number.length;j++)
        { 
             int orginal=number[j];
        
        System.out.print("  "+number[j]);
        }
        System.out.println();

        System.out.print("the revese array is : ");
       
    for(int i=(number.length-1);i>=0;i--)
    { 
        int reverse=number[i];
        System.out.print(  "  "+reverse);
    }

    }



    public static int binarySearch(int number[],int key)
    {
      int start=0;
      int end=(number.length-1);
      while(start<=end)
      {
        int mid =(start+end)/2;
        if(number[mid]==key)
        {
            return mid;
        }
        if(number[mid]<key)
        {
            start=start+1;
        }
        else{
            end=end-1;
        }
      }
      return -1;
    }


    public static void reverse(int number[])
    {
      int first=0,last=number.length-1;
      while(first<last)
      {
        int temp=number[last];
        number[last]=number[first];
        number[first]=temp;
        first++;
        last--;
      }
    }



    public static void arrayPair(int number[])
    {int tp=0;
      for(int i=0;i<number.length;i++)
      {
      //  int curr=number[i];
        for(int j=i+1;j<number.length;j++)
        {
          System.out.print("("+number[i]+","+number[j]+")  ");
          tp++;
        }
        System.out.println("  ");
        System.out.println("  ");
      }
      System.out.println("the total pair is equal to :  "+tp);
    }



    public static void subArray(int number[])
    {
      int m=number.length;
      
      for(int i=0;i<number.length;i++)
      {
       
        for(int j=i;j<number.length;j++)
        {
          int sum=0;
          for(int k=i;k<=j;k++)
        {
          System.out.print(number[k]+"  ");
          sum=sum+number[k];
          
        }
        System.out.println("the sum of sub array os :   "+sum);
        System.out.println("");
        
      }
      System.out.println("-----------------------------------------------");
    }
    int total=(m*(m+1))/2;
    System.out.println("the total number of sub array os :   "+total);
  }



  public static void maxSubArrayBrute(int number[])
  {
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++)
      {
        System.out.println("the subarray sum for the number  "+number[i]+"is  ");
        
        for(int j=i;j<number.length;j++)
        { 
        
          int sum=0;
          for(int k=i;k<=j;k++)
        {
          sum=sum+number[k];
          
        }
         
        System.out.println("the sum is "+sum);
         if(maxSum<sum)
         {
          maxSum=sum;
         }
          
        }
      
      System.out.println(" ---------------------------------------------------------");
    }
    System.out.println(" ---------------------------------------------------------");
      System.out.println("max sum"+ maxSum);
  }



  public static void maxSubArrayPrefix(int number[])
  {
    int maxSum=Integer.MIN_VALUE;
     
    int prefix[]=new int[number.length];

    //calculate prefix array
    prefix[0]=number[0];
    for(int i=1;i<prefix.length;i++)
    {
      prefix[i]=prefix[i-1]+number[i];
    }


    for(int i=0;i<number.length;i++)
      {
        
        
        for(int j=i;j<number.length;j++)
        { 
        
         int  sum= i==0? prefix[j]:prefix[j]-prefix[i-1];
          if(maxSum<sum)
          {
            maxSum=sum;
          }
        }
      }
      System.out.println("max sum="+maxSum);
    }


    public static void subArrayKadane(int number[])
    {
      int ms=Integer.MIN_VALUE;
      int cs=0;
      for(int i=0;i<number.length;i++)
      {
        cs=cs+number[i];
        if(cs<0){
          cs=0;
        }
        ms=Math.max(cs,ms);
      }
      System.out.println("the max number of a subarray is :"+ms);
    }



    public static int trappingWater(int height[])
    {
       int n=height.length;
       //calculation left max bundary array
       int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
          leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
       
        //calculation the right boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
          rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
         
        int trappedwater=0;
        //loop
        
        for(int i=0;i<n;i++)
        {
          int waterlevel=Math.min(leftMax[i],rightMax[i]);
          //trapped water=waterlevel-height
          trappedwater+=waterlevel-height[i];
        }
         
       return trappedwater;
      }




      public static int BuySellStocl(int price[])
      {
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++)
        {
          if(buyPrice<price[i])
          {
            int profit=price[i]-buyPrice;  //indivial profit of a day
          
          maxprofit=Math.max(maxprofit,profit);

        }
        else{
          buyPrice=price[i];
        }
      }
return maxprofit;
    }

    
    public static void main(String [] args)
    {
         /*   int marks[]={99,200,30};
           array(marks);
           //print
           for(int i=0;i<marks.length;i++)  //first code for array to print it
    {
        System.out.print(marks[i]+" ");
    }
      System.out.println();*/

      //---------------------------------------------------------------------

      /* 
      int number[]={2,4,6,8,10,12,14,16};
      int key=10;
      int index= arraySc(number, key);
      if(index==-1)
      {
        System.out.println("not found");//to find the index of number using lineae search
      }
      else{
        System.out.println("key is at index  "+index);
      }
      */

      int number[]={2,4,6,-18,10};
      int key =10;
 
      int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
       //System.out.println(   "the total volume of water occupied is   "+trappingWater(height));     //important dsa question trapping water mostly in interview 
      
      int price[]={7,1,5,3,6,4};
     // System.out.println(   "the maxium profit is "+BuySellStocl(price));

       // subArrayKadane(number);  // it tell the max subarray sum using kadane algo it is most optimise way with time complexity of O(n)

       
       
      //maxSubArrayPrefix(number);  //it tell the max subarray sum of a array this is prefix way method; 
      

      //maxSubArrayBrute(number);//it tell the max subarray sum of a array this is brute forse method; 

        //subArray(number); //to find sub array and there sum 

      //arrayPair(number);  //to finf the pair of arrya


      /* 
      int index=binarySearch(number, key);
      System.out.println("the index of the given number  "+key+"  is :index "+index);//to search the index using binarySearch
*/
     
       
      // reverseArray(number);  //to reverse a desire array but the time and space complixity will be high so we another way that is
      
      
       /*reverse(number);
      for(int i=0;i<number.length;i++)
      {
        System.out.print(number[i]+" ");
      }
          System.out.println( "");  //this is better way to revese the sorted array as time complexitis O(n) while space O{1}
          */

      //System.out.println("the largest number of given array is : "+getLargest(number));//to get the largest number in a array

}
}
