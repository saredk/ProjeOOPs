package ProjectOOPs;

import class10.Car;

/*
Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
 */
 class P13Car {
    double carPrice;
    String color;

    public P13Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {

        return carPrice;
    }
}
class Truck extends P13Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.9;
        } else {
            return carPrice * 0.8;
        }
    }
}

class Sedan extends P13Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {

        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}

 class CarTester {
    public static void main(String[] args) {
        Truck truck = new Truck(25000, "Blue", 2500);
        Sedan sedan = new Sedan(20000, "Red", 18);

        System.out.println("Truck Sale Price: £" + truck.calculateSalePrice());
        System.out.println("Sedan Sale Price: £" + sedan.calculateSalePrice());
    }
}