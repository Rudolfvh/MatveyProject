package bel.matvey.theme.conditional.Task_04.entity;

    public class Stock{

    public int minPrice,maxPrice,currentPrice;

    String company;

            public Stock(String companyName, int current) {
                this.minPrice = current;
                this.maxPrice = current;
                this.currentPrice = current;
                this.company = companyName;
            }

            public void updatePrice (int price){
                if(this.maxPrice < price)this.maxPrice = price;
                if(this.minPrice > price)this.minPrice = price;
                this.currentPrice = price;
            }

            public void printInformation () {
                System.out.print("Company = " + '"' + this.company + '"' + ", ");
                System.out.print("Current Price = " + currentPrice + ", ");
                System.out.print("Min Price = " + this.minPrice + ", ");
                System.out.println("Max Price = " + this.maxPrice);
            }

    }
