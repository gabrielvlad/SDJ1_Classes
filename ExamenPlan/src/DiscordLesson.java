public class DiscordLesson extends OnlineLesson{
  private String channelName;

  public DiscordLesson(String topic, Date date, Time start, Time end, Resource[] resources, boolean cameraRequired, String channelName) {
    super(topic, date, start, end, resources, cameraRequired);
    this.channelName = channelName;
  }

  public String getChannelName() {
    return channelName;
  }

  @Override
  public String nameOfSoftware() {
    return "Discord";
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof DiscordLesson))
      return false;
    else {
      DiscordLesson other = (DiscordLesson) obj;
      return super.equals(other) && other.channelName.equals(channelName);
    }
  }

  @Override
  public String toString() {
    return super.toString() + " and the channel name is "+ channelName;
  }
}
