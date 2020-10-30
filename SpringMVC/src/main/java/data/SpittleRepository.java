package data;
import java.util.List;

import metadata.Spitter;
import metadata.Spittle;
public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);
    Spittle findOne(long id);
    void save(Spitter spitter);
    Spitter fineByUsername(String username);
}
