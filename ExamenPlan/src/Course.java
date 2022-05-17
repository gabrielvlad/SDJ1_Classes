import java.util.ArrayList;

public class Course {
  private String name;
  private ArrayList<Lesson> schedule;

  public Course(String name) {
    this.name = name;
    schedule = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public int getNumberOfLessons() {
    return  schedule.size();
  }

  public void addLesson(Lesson lesson) {
    schedule.add(lesson);
  }

  public void removeLesson(Lesson lesson) {
    schedule.remove(lesson);
  }

  public boolean hasLessonOnDate(Date date) {
    for (int i = 0; i < schedule.size(); i++) {
      if(schedule.get(i).getDate().equals(date))
        return true;
    }
    return false;
  }

  public ArrayList<Lesson> getAllLessons() {
    return schedule;
  }

  public ArrayList<String> getAllTopics() {
    ArrayList<String> other = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++) {
      other.add(schedule.get(i).getTopic());
    }
    return other;
  }

  public ArrayList<OnlineLesson> getOnlineLessons() {
    ArrayList<OnlineLesson> onlineLessons = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++) {
      if(schedule.get(i) instanceof OnlineLesson)
        onlineLessons.add((OnlineLesson) schedule.get(i));
    }
    return onlineLessons;
  }

  public ArrayList<OnlineLesson> getOnlineLessonsWithCameraRequired() {
    ArrayList<OnlineLesson> onlineLessons = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++) {
      if (schedule.get(i) instanceof OnlineLesson) {
        if(((OnlineLesson) schedule.get(i)).isCameraRequired())
          onlineLessons.add((OnlineLesson) schedule.get(i));
      }
    }
    return onlineLessons;
  }

  public ArrayList<DiscordLesson> getDiscordLessons() {
    ArrayList<DiscordLesson> discordLessons = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++) {
      if(schedule.get(i) instanceof OnlineLesson) {
        if(((OnlineLesson) schedule.get(i)).nameOfSoftware().equals("Discord"))
          discordLessons.add((DiscordLesson) schedule.get(i));
      }
    }
    return discordLessons;
  }

  public ArrayList<ZoomLesson> getZoomLessonsWithBreakoutRooms() {
    ArrayList<ZoomLesson> zoomLessons = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++) {
      if(schedule.get(i) instanceof OnlineLesson) {
        if(((OnlineLesson) schedule.get(i)).nameOfSoftware().equals("Zoom"))
          zoomLessons.add((ZoomLesson) schedule.get(i));
      }
    }
    for (int i = 0; i < zoomLessons.size(); i++) {
      if(!zoomLessons.get(i).usesBreakoutRooms())
        zoomLessons.remove(zoomLessons.get(i));
    }
    return zoomLessons;
  }

  public ArrayList<Resource> getAllResources() {
    ArrayList<Resource> resources = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++) {
      Resource[] resources1 = schedule.get(i).getResources();
      for (int j = 0; j < schedule.get(i).getResources().length; j++) {
        resources.add(resources1[j]);
      }
    }
    return resources;
  }

  @Override
  public String toString() {
    return name + " the lesson being " + schedule;
  }
}
