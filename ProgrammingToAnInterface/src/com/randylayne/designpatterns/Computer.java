package com.randylayne.designpatterns;

interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through monitor");
    }
}

class Projector implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through projector");
    }
}

public class Computer {
    displayModule dm;

    public static void main(String[] args) {
        Computer cm = new Computer();
        displayModule dm = new Monitor();
        displayModule dm2 = new Projector();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm2);
        cm.display();
    }

    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }
}