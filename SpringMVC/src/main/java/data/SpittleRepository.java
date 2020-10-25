package data;
import java.util.List;

import metadata.Spittle;
public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);
}
