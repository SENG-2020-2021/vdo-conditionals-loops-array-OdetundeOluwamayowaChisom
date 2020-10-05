class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   byte [] daysOfTheMonthDefaulted = {5,8,12,18,20} ;
   
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
      float amountPayablePerDay = 2000F;
      float amountPaid = 6000F;
   
   // declare all the variables needed for your calculations
   float totalAmountToPay =0F;
   byte actualElements = 0;
   float mayo =amountPaid;
   byte daysPaidFor = 0;
   float amountLeftToPay;
   float Plus;

   // calculate and print total amount the debtor is to pay using for each loop
   for(byte i: daysOfTheMonthDefaulted){
     totalAmountToPay += amountPayablePerDay;
     actualElements++;
   }
   System.out.println("The number of the elements in the array is " + actualElements);
   System.out.println("The total amount the debtor is to pay is "+ totalAmountToPay);


   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 

   for(int i=0; i<actualElements; i++){

     if(mayo>=amountPayablePerDay){
       mayo = mayo - amountPayablePerDay;
       daysPaidFor++;

     }
     else if(mayo<amountPayablePerDay){
     break;
    }
   }

   for(int i=0; i<daysPaidFor;i++){
     System.out.println("The debtor paid for day " + daysOfTheMonthDefaulted[i]);
   }

   if(amountPaid%amountPayablePerDay>0 &&amountPaid<totalAmountToPay){
     System.out.println("The days not paid for completely is" + daysOfTheMonthDefaulted[daysPaidFor]);

     System.out.println("The amount left to pay per day " + daysOfTheMonthDefaulted[daysPaidFor] + "is" +(amountPayablePerDay -(amountPaid%amountPayablePerDay)));

   }
   

   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if(amountPaid<totalAmountToPay){
     amountLeftToPay= totalAmountToPay - amountPaid;
     System.out.println("The amount that is to be paid is " + amountLeftToPay);
   }
   else if(amountPaid>totalAmountToPay){
     Plus = amountPaid - totalAmountToPay;
     System.out.println("The amount been owed is " +Plus);
   }
   else if(amountPaid == totalAmountToPay){
     System.out.println("You have paid the exact amount!");
   }

   //kindly remove the statement below when you are done with the assignment
  
  }
}