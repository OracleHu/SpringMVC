package dataAcess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import data.SpittleRepository;
import metadata.Spitter;
import metadata.Spittle;
@Component
@RequestScope
public class GetSpittles implements SpittleRepository {
    SaveData save_data;
    
    
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		// TODO Auto-generated method stub
		List<Spittle> result = new ArrayList<Spittle>();
		Spittle spittle1 = new Spittle("message-1",new Date(),120.09,200.9);
		spittle1.setId(new Long(1));
		result.add(spittle1);
		Spittle spittle2 = new Spittle("message-2",new Date(),210.09,250.9);
		spittle2.setId(new Long(2));
		result.add(spittle2);
		return result;
	}
	public SaveData getSave_data() {
		return save_data;
	}
	@Autowired
	public void setSave_data(SaveData save_data) {
		this.save_data = save_data;
	}
	@Override
   public Spittle findOne(long id) {
	   Spittle spittle3 = new Spittle("message-3",new Date(),210.09,250.9);
		spittle3.setId(new Long(3));
		return spittle3;
   }
	@Override
	public void save(Spitter spitter) {
		// TODO Auto-generated method stub
		save_data.save(spitter);
	}
	@Override
	public Spitter fineByUsername(String username) {
		// TODO Auto-generated method stub
		return save_data.getByUsername(username);
	}
}
