package guru.springframework.sfgpetclinic.model;

/**
 * Created by lorenzo on 19/11/18.
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
