public class UtilityMethods {

  boolean checkFitting(Customer customer, Cloth cloth){

      return customer.getSize() == cloth.getSize();
  }

public static double calculateSubtotal(Cloth []cloths){
    double  total = 0;

    for(Cloth i : cloths){
        total += i.getPrice();
    }

      return total;
}

public static void printClassNamesOfPayableEntities(Payable[] payables){
    for(Payable i : payables){
        System.out.println(i);
     }
}

public static void checkCustomerDiscount(Customer customer){
 if(customer instanceof Manager manager) {
     System.out.println(" Manger Discount : " + manager.getDISCOUNT());
 } else if (customer instanceof HourlyEmployee hourlyEmployee) {
     System.out.println(" Hourly Employee Discount : " + hourlyEmployee.getDISCOUNT());
 } else if (customer instanceof Student student ){
     System.out.println(" Student Discount : " +  student.getDISCOUNT());
 }
  };
}

