package muralla2e;

import java.util.Scanner;

public class Product {
    public void getProducts(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Number of Products: ");
        int np = scan.nextInt();
        
        Products[] pr = new Products[np];
        
        for (int i = 0; i < np; i++){
                       
            System.out.println("\nEnter Details for Product " + (i + 1));
            System.out.print("ID: ");
            int id = scan.nextInt();
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            System.out.print("Stocks: ");
            int stocks = scan.nextInt();
            System.out.print("Sold: ");
            int sold = scan.nextInt();
            System.out.println("");
            
            pr[i] = new Products(id, name, price, stocks, sold);
        }
        double totalProfit = 0, totalTep = 0;
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Price", "Stocks", "Sold", "Profit", "TEP", "Status");
        for (Products pr1 : pr) {
            pr1.viewProducts();
            totalProfit += pr1.profit;
            totalTep += pr1.tep;
        }  
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.printf("Total Profits: %.2f\n", totalProfit);
        System.out.printf("Total Estimate Price: %.2f\n", totalTep);
        
    }
}
