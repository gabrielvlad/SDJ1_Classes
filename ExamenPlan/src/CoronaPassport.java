public class CoronaPassport {
  private String reason;
  private Date date;

  public CoronaPassport(String reason, Date date) {
    if (reason.equalsIgnoreCase("vaccinated") || reason.equalsIgnoreCase("tested") || reason.equalsIgnoreCase("infected"))
      this.reason = reason;
    else
      throw new IllegalArgumentException("The reason isn't valid");
    this.date = date.copy();
  }

  public String getReason() {
    return reason;
  }

  public Date getDate() {
    return date.copy();
  }

  @Override
  public String toString() {
    return "CoronaPassport{" +
        "reason='" + reason + '\'' +
        ", date=" + date +
        '}';
  }
}
