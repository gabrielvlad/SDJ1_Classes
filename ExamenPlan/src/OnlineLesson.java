public abstract class OnlineLesson extends Lesson {
  private boolean cameraRequired;

  public OnlineLesson(String topic, Date date, Time start, Time end, Resource[] resources, boolean cameraRequired) {
    super(topic, date, start, end, resources);
    this.cameraRequired = cameraRequired;
  }

  public boolean isCameraRequired() {
    return cameraRequired;
  }

  public String nameOfSoftware() {
    return null;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof OnlineLesson))
      return false;
    else {
      OnlineLesson other = (OnlineLesson) obj;
      return super.equals(other) && other.cameraRequired == cameraRequired;
    }
  }

  @Override
  public String toString() {
    return super.toString() + " is camera required? : " + cameraRequired + ",";
  }
}
