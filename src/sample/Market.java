package sample;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Market {
    public double priceApples;
    public double priceOranges;
    public double priceBananas;
    public double priceGrapes;
    public int randMin = 1; //cents
    public int randMax = 999; //cents
    public int randUpdateMin = 1;//cents
    public int randUpdateMax = 50;//cents
    public double startPrice=1.5;

    Random randPrice = new Random();
    DecimalFormat money = new DecimalFormat("0.00");

    public Market() {
        this.priceApples = updatePrice(startPrice);
        this.priceOranges = updatePrice(startPrice);
        this.priceBananas = updatePrice(startPrice);
        this.priceGrapes = updatePrice(startPrice);
    }
    public void updateAllPrices() {
        this.priceApples = updatePrice(this.priceApples);
        this.priceOranges = updatePrice(this.priceOranges);
        this.priceBananas = updatePrice(this.priceBananas);
        this.priceGrapes = updatePrice(this.priceGrapes);
    }


    public double updatePrice(double currentPrice) {
        double newPrice = currentPrice;
        double priceChange = (randPrice.nextInt(randUpdateMax)/100.0);
        int signOfChange = randPrice.nextInt(2)+1;
        if (signOfChange == 2) {
            priceChange = -priceChange;
        }
        newPrice += priceChange;
        if (newPrice < 0.50){
            newPrice=0.50;
        } else if (newPrice >9.99){
            newPrice=9.99;
        }
        return newPrice;
    }

    public double getPriceApples() {
        return priceApples;
    }

    public void setPriceApples(int priceApples) {
        this.priceApples = priceApples;
    }

    public double getPriceOranges() {
        return priceOranges;
    }

    public void setPriceOranges(int priceOranges) {
        this.priceOranges = priceOranges;
    }

    public double getPriceBananas() {
        return priceBananas;
    }

    public void setPriceBananas(int priceBananas) {
        this.priceBananas = priceBananas;
    }

    public double getPriceGrapes() {
        return priceGrapes;
    }

    public void setPriceGrapes(int priceGrapes) {
        this.priceGrapes = priceGrapes;
    }
}