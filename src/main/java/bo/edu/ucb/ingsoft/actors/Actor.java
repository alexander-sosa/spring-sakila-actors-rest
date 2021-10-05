package bo.edu.ucb.ingsoft.actors;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * actor_id 
 * first_name
 * last_name
 * last_update
 * 
 */

@Entity(name = "actor") 
public class Actor {
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actorId;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "last_update")
    private Date update;

    public Actor(Integer actorId, String name, String lastname, Date update){
        this.name = name;
        this.lastname = lastname;
        this.actorId = actorId;
        this.update = update;
    }

    public Actor(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Date getUpdate() {
        return update;
    }
    
    public void setUpdate(Date update) {
        this.update = update;
    }
}
