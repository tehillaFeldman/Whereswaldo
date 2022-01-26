class linkedList {

   class Node {
       String touristName;
       int passportNumber;
       String destinationCity;
       Node next;

       // Constructor 
       public Node(String aTouristName, int aPassportNumber, String aDestinationCity) {
           super();
           touristName = aTouristName;
           passportNumber = aPassportNumber;
           destinationCity = aDestinationCity;
           next = null;
       }

       public String toString() {
           return "Node [touristName=" + touristName + ", passportNumber=" + passportNumber + ", destinationCity="
                   + destinationCity + "]";
       }

   }

   Node head;
   public int size;

   public void addFirst(String touristName, int passportNumber, String destinationCity) { 
       Node new_node = new Node(touristName, passportNumber, destinationCity);
       new_node.next = head;
       head = new_node;
       size++;
   }

   public String findNode(String touristName) {
       String destination = "";
       Node traverse = head;

       while (traverse != null) {

           if (traverse.touristName.equals(touristName))
               return traverse.destinationCity;
           traverse = traverse.next;
       }
       return destination;
   }

   public int size() {
       return size;
   }

}