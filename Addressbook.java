
/**
 * @author Chetna Bisen
 *
 * Description: Address book program.
 */

import java.util.Scanner;
 class Addressbook {
 Scanner s = new Scanner(System.in);
  class Entry{
   private String firstName;
   private String lastName;
   private String address;
   private String city;
   private String state;
   private String pincode;
   private String phoneNumber;
   Entry(String firstName,String lastName,String address,
         String city,String state,String pincode,String phoneNumber){
         this.firstName=firstName;
         this.lastName=lastName;
         this.address=address;
         this.city=city;
         this.state= state;
         this.pincode=pincode;
         this.phoneNumber=phoneNumber;
   }


  public void readEntry(){
    System.out.println("First Name:"+firstName );
    System.out.println("Last Name:"+lastName );
    System.out.println("Address:"+address );
    System.out.println("Email:"+city );
    System.out.println("Address:"+state );
    System.out.println("Email:"+pincode );
    System.out.println("Email:"+phoneNumber );

 }
}



 private int entries=0;
 Entry[] details;
 public void Entries() {
 details=new Entry [10];
 for (int i = 0;i<details.length;i++){
         details[i] = new Entry();
 }
}

public int getEntries(){
        return details.length;
    }
 
public void add(String firstName,String lastName,String address,
         String city,String state,String pincode,String phoneNumber) {
 if (entries<details.length){
details[entries]=new Entry( firstName,lastName,address,
         city,state,pincode, phoneNumber);
entries++;
}
else System.out.println("No space for Entries" );
}
