package org.example.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Associate {
    @Value("1")
    private String id;
    @Value("Manoj")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Associate : {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
