package bel.matvey.theme.conditional.Task_04.entity;

    public class Stock{

    public int minPrice,maxPrice,currentPrice;

    String company;

            public Stock(String companyPrice, int current) {
                this.minPrice = current;
                this.maxPrice = current;
                this.currentPrice = current;
                this.company = companyPrice;
            }

            public void updatePrice (int stock){
                if(this.maxPrice < stock)this.maxPrice = stock;
                if(this.minPrice > stock)this.minPrice = stock;
                this.currentPrice = stock;
            }

            public void printInformation () {
                System.out.print("Company = " + '"' + this.company + '"' + ", ");
                System.out.print("Current Price = " + this.currentPrice + ", ");
                System.out.print("Min Price = " + this.minPrice + ", ");
                System.out.println("Max Price = " + this.maxPrice);
            }

    }
