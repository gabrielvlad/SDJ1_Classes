import java.util.ArrayList;
import java.util.Arrays;

public class Lesson {
  private String topic;
  private Date date;
  private Time start, end;
  private ArrayList<Resource> resources;

  public Lesson(String topic, Date date, Time start, Time end, Resource[] resources) {
    super();
    this.topic = topic;
    this.date = date.copy();
    if(hasValidTime(start,end)) {
      this.start = start.copy();
      this.end = end.copy();
    }
    else
      throw new IllegalArgumentException("The time is invalid");
    this.resources = new ArrayList<>();
    this.resources.addAll(Arrays.asList(resources));
  }

  public String getTopic() {
    return topic;
  }

  public Date getDate() {
    return date;
  }

  public Resource[] getResources() {
    return (Resource[]) resources.toArray();
  }

  public ArrayList<Resource> getAllPDFs() {
    ArrayList<Resource> other = new ArrayList<>();
    for (int i = 0; i < resources.size(); i++) {
      if(resources.get(i).isPDF())
        other.add(resources.get(i));
    }
    return other;
  }

  public ArrayList<Resource> getAllslideShowFiles(){
    ArrayList<Resource> other = new ArrayList<>();
    for (int i = 0; i < resources.size(); i++) {
      if(resources.get(i) instanceof slideShowFile)
        other.add(resources.get(i));
    }
    return other;
  }

  public boolean hasSlideShows(){
    if (getAllslideShowFiles().size() > 0)
      return true;
    else
      return false;
  }

  public Time getDuration() {
    return start.timeUntil(end);
  }

  public static boolean hasValidTime(Time startTime, Time endTime) {
    try {
      startTime.timeUntil(endTime);
      return new Time(8,20,0).isBefore(startTime) && endTime.isBefore(new Time(21,10,0));
    }
    catch (IllegalArgumentException e) {
      return false;
    }
  }

  public String getDateTimeString() {
    return date.toString()+" "+start.toString()+" - "+end.toString();
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Lesson))
      return false;
    else {
      Lesson other = (Lesson) obj;
      return other.topic.equals(topic) && other.date.equals(date) && other.start.equals(start) && other.end.equals(end) && other.resources.equals(resources);
    }
  }

  @Override
  public String toString() {
    return '\"' + topic+ '\"' +
        ", date=" + date +
        ", start=" + start +
        ", end=" + end +
        ", resources=" + resources +
        '}';
  }
}
