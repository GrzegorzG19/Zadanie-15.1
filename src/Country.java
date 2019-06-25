public class Country {
    private String small;
    private String full;
    private int people;

    @Override
    public String toString() {
        return "Country{" +
                "small='" + small + '\'' +
                ", full='" + full + '\'' +
                ", people=" + people +
                '}';
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getSmall() {
        return small;
    }

    public String getFull() {
        return full;
    }

    public int getPeople() {
        return people;
    }

    public Country(String small, String full, int people) {
        this.small = small;
        this.full = full;
        this.people = people;
    }
}
