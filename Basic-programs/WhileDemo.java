class WhileDemo{
    public static void main(String[] args){
      
       // break
       // continue
      int n=153;
      int r=0;
      int s=0;
      int t=n;
      while(n>0 ){
       r=n%10;
       s=s+(r*r*r);
       n=n/10; 
      }
      if(t==s){
         System.out.println("Armstrong");
      }else{
        System.out.println("Not"); 
      }
  

    }
}