class LinearSearch{
  public static void main(String args[]){
    int A[]={1,2,3,4,5};
    int key=4;
    boolean flag=false;
    for(int i=0;i<A.length;i++)
    {
       if(key==A[i])
       {
          System.out.println("key is found at:"+i);
          flag=true;
          break;
       }
    }
    if(flag==false)
    System.out.println("key is not found:");
  }
}
 

