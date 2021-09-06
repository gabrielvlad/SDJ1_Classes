public class RectangleExampleInClass
{
  private int width;
  private int length;

  public void setLength(int value)
  {
    length = value;
  }

  public int getLength()
  {
    return length;
  }

  public void setWidth(int value)
  {
    width = value;
  }

  public int getWidth()
  {
    return width;
  }

  public void set(int length, int width)
  {
    this.length = length;
    this.width = width;
  }

  public int getArea()
  {
    return length + width;
  }

  public void setAll(int widthValue, int lengthValue){
    length = length;
    width = width;
  }
}
