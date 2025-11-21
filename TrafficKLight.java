class TrafficLight {
    String color;
    int duration;

    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    void changeColor(String newColor) {
        color = newColor;
    }

    boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("Red", 30);

        System.out.println("Is red? " + t.isRed());
        t.changeColor("Green");
        System.out.println("Is green? " + t.isGreen());
    }
}
