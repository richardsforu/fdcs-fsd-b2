class MenuApp{
    public static void main(String[] args){
      
    java.util.Scanner sc=new java.util.Scanner(System.in);
    while(true){
      System.out.println("Menu");
      System.out.println("------------");
      System.out.println("1.Add record");
      System.out.println("2.List All");
      System.out.println("3.Find record");
      System.out.println("4.Update record");
      System.out.println("5.Delete record");
      System.out.println("6.Exit");
      System.out.println("Enter your choice: ");
      int ch=sc.nextInt();

      switch(ch){
        case 1:
        System.out.println("Adding records...");
        break;
         case 2:
          System.out.println("Listing all records...");
        break;
         case 3:
          System.out.println("Finding a  record...");
        break;
         case 4:
          System.out.println("Updating a record...");
        break;
         case 5:
          System.out.println("deleting record...");
        break;
         case 6:
          System.out.println("Thank you. Visit again..");
         System.exit(1);
         default:
          System.out.println("Invalic choice. try again..");
      } // end of switch
    }   // end of while loop
  
    } // end of main method
}