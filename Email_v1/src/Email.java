public class Email {

    private String user;
    private String host;
    private String domain;

    public Email(String user, String host, String domain) {
        this.user = user;
        this.host = host;
        this.domain = domain;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return user + "@" + host + "." + domain;
    }
}
