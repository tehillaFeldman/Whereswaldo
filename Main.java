class Main {

  public static void main(String[] args) {

    linkedList t1 = new linkedList();
    t1.addFirst("Page", 38967, "Oklahoma");
    t1.addFirst("West", 90356, "Italy");
    t1.addFirst("John", 23456, "Guatemala");
    //test second name
    System.out.println("Tourist Destination: " + t1.findNode("West"));
    //test first name
    System.out.println("Tourist Destination: " + t1.findNode("Page"));
    //test last name
    System.out.println("Tourist Destination: " + t1.findNode("John"));
    //try a name that does not exist
    System.out.println("Tourist Destination: " + t1.findNode("mark"));
    System.out.println("Size : " + t1.size);

  }
  
}




