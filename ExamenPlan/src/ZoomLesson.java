public class ZoomLesson extends OnlineLesson{
  private String link;
  private boolean breakoutRooms;

  public ZoomLesson(String topic, Date date, Time start, Time end, Resource[] resources, boolean cameraRequired, String link, boolean breakoutRooms) {
    super(topic, date, start, end, resources, cameraRequired);
    this.link = link;
    this.breakoutRooms = breakoutRooms;
  }

  public String getLink() {
    return link;
  }

  public boolean usesBreakoutRooms() {
    return breakoutRooms;
  }

  @Override
  public String nameOfSoftware() {
    return "Zoom";
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof ZoomLesson))
      return false;
    else {
      ZoomLesson other = (ZoomLesson) obj;
      return super.equals(other) && other.breakoutRooms == breakoutRooms && other.link.equals(link);
    }
  }

  @Override
  public String toString() {
    return super.toString() + " the link for the lesson is " + '\"' + link + '\"'+ " does it have breakout rooms? : " + breakoutRooms;
  }
}
