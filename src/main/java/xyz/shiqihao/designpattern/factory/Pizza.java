package xyz.shiqihao.designpattern.factory;

class Pizza {
    String name;
    double price;

    double getPrice() {
        return price;
    }

    void prepare() {
        System.out.println("preparing pizza");
    }

    void box() {
        System.out.println("boxing pizza");
    }
}