import java.util.Arrays;
class BubbleSort{
  public static void main(String args[]){
      int a[]={1,9,5,70,44};
      System.out.println("arrays before sorting:"+Arrays.toString(a));
      int n=a.length;
      for(int i=0;i<n-1;i++)
      {
        for(int j=0;j<n-1;j++)
        {
          if(a[j]>a[j+1]){
             int temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
           }
        }
      }
      System.out.println("arrays after sorting:"+Arrays.toString(a));
   }
}
