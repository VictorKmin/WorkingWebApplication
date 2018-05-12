package app.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    User user = new User();

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getUser(), car.getUser());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getModel(), getUser());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
