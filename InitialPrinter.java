//Creaters name is Hugo Lapa
//Program will print the creators initials
class InitialCreator {
  //main method
  public static void main(String[] args) 
  {
    //calls all the necessary methods, to create intials
    letterH();
    createSpace();
    letterL();
    System.exit(0);
  }

  //method prints the letter H
  public static void letterH () 
  {
    System.out.println("H       H");
    System.out.println("H       H");
    System.out.println("H       H");
    System.out.println("HHHHHHHHH");
    System.out.println("H       H");
    System.out.println("H       H");
    System.out.println("H       H");
    return;
  }

  //method creates space between the intials
  public static void createSpace () 
  {
    System.out.println("");
    return;
  }

  //method prints the letter L
  public static void letterL () 
  {
    System.out.println("L");
    System.out.println("L");
    System.out.println("L");
    System.out.println("L");
    System.out.println("L");
    System.out.println("L");
    System.out.println("LLLLLLLLL");
    return;
  }
}
