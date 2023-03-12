package domain;

public abstract class Entity {
    protected int id;
    protected boolean isDeleted;

    public Entity() {}
    public Entity(int id, boolean isDeleted) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    abstract public String serialize();

    abstract public void parse(String objectRepresentation);
}
