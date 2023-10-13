package lesson9;

import java.util.Date;
import java.util.Objects;

public class Otzyv {
    private int rating;
    private String textOtzyv;
    private Date date;
    private User user;

    public Otzyv() {
    }

    public Otzyv(int rating, String textOtzyv, Date date, User user) {
        this.rating = rating;
        this.textOtzyv = textOtzyv;
        this.date = date;
        this.user = user;
    }

    public Otzyv(int rating, String textOtzyv) {
        this.rating = rating;
        this.textOtzyv = textOtzyv;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTextOtzyv() {
        return textOtzyv;
    }

    public void setTextOtzyv(String textOtzyv) {
        this.textOtzyv = textOtzyv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otzyv otzyv = (Otzyv) o;

        if (rating != otzyv.rating) return false;
        if (!Objects.equals(textOtzyv, otzyv.textOtzyv)) return false;
        if (!Objects.equals(date, otzyv.date)) return false;
        return Objects.equals(user, otzyv.user);
    }

    @Override
    public int hashCode() {
        int result = rating;
        result = 31 * result + (textOtzyv != null ? textOtzyv.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otzyv{" +
                "rating=" + rating +
                ", textOtzyv='" + textOtzyv + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
