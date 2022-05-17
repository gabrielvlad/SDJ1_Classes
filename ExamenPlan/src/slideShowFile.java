public class slideShowFile extends Resource
{
  private int numberOfSlides;

  public slideShowFile(String fileName, String extension, int numberOfSlides){
    super(fileName, extension);
    this.numberOfSlides = numberOfSlides;
  }

  public boolean equals (Object Obj){
    if (!(Obj instanceof slideShowFile))
      return false;
    else{
        slideShowFile other = (slideShowFile) Obj;
        return super.equals(Obj) && numberOfSlides == other.numberOfSlides;
    }

  }
}
