package repositories;

import domain.Performance;

import java.util.HashMap;
import java.util.Map;

public abstract class Repository<TEntity> implements IRepository<TEntity>{
    protected String path;


    protected String filedDelimiter = "\\|";
    protected Map<Integer, TEntity> data = new HashMap<Integer, TEntity>();

    public Repository() {}
    public Repository(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public Map<Integer, TEntity> getData() {
        return data;
    }
    public void setData(Map<Integer, TEntity> data) {
        this.data = data;
    }
}
