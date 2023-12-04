package com.kevin;

public class Ticket {
    int Origin;
    int Destination;
    int Price;

    public Ticket() {
    }
    public Ticket(int origin, int destination, int price) {
        this.Origin = origin;
        this.Destination = destination;
        this.Price = price;
    }

    public int getOrigin() {
        return Origin;
    }

    public void setOrigin(int origin) {
        Origin = origin;
    }

    public int getDestination() {
        return Destination;
    }

    public void setDestination(int destination) {
        Destination = destination;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
