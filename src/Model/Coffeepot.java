package Model;

public class Coffeepot
{
  private String color;
  private double capacity;

  public Coffeepot(String color, double capacity)
  {
    this.color = color;
    this.capacity = capacity;
  }

  public String getColor()
  {
    return color;
  }

  public double getCapacity()
  {
    return capacity;
  }

  @Override public String toString()
  {
    return color + "/" + capacity;
  }
}
