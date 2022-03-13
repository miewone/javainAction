package chapter2;

enum Color{
    RED,
    GREEN
}
public class Apple {
    String name;

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                '}';
    }

    Color color;
    int weight;

    public Apple(Color color,int weight)
    {
        this.color = color;
        this.weight=weight;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
