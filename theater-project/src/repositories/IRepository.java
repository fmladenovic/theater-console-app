package repositories;

import domain.Performance;

import java.util.List;
import java.util.Map;

public interface IRepository<TEntity> {
    void serializer();
    void parser();
}
