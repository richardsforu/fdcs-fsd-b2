class NestedIf{
    public static void main(String[] args){
      
      int age=89;
      int exp=18;

        if(age >= 25){
           if(exp >=15){
             System.out.println("Accepted");
           }else{
              System.out.println("Experince should be > =15");
           }
        }else{
             
          System.out.println("Not Accepted");
        }



    }
}