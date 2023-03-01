package com.herbalife.examples;
import commercial.companyName.projectName.moduleName.MyClass;

public class InnerClassesExample {
    public static void main(String[] args) {
        TV sony = new TV();
        TV.Remote sonyRemote = sony.new Remote(); //You can create an inner class object only using the outer class object
        sonyRemote.increaseVolume();
        sonyRemote.decreaseVolume();
    }
}

class TV {
    private int volume;

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    //Inner class can access private members of the parent/outer class
    class Remote {
        public void increaseVolume() {
            volume++;
        }

        public void decreaseVolume() {
            volume--;
        }

        class Chip {
            class MicroPart {
            }
        }
    }

    class Button {
    }

    class CustomRemote extends Remote {

    }
    static class Wire {}
}
class MyWire extends TV.Wire {}