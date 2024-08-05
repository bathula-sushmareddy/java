class Binary{
    public static void main(String args[]){
       int a[]={1,2,3,4,5,6,99,100};
       boolean flag=false;
       int l=0,h=a.length-1,key=6,m;
       while(l<=h){
          m=(l+h)/2;
          if(a[m]==key){
             System.out.println("element found at "+m);
             flag=true;
             break;
          }
          else if(key>a[m]){
             l=m+1;
          }   
          else{
             h=m-1;
          }
       }
       if(flag==false)
             System.out.println("element not found");
     }
}
      
    
