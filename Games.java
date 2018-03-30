package api.igdb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Games {
    private Integer id;
    private String name;
    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer newId) {
        this.id = newId;
    }

    @Override
    public String toString() {
        return "Game{"+
                "id="+id+'\'' +
                ", name=" + name +
                "}";
    }
}
