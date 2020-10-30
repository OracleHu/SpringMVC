package dataAcess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import metadata.Spitter;

@Component
@SessionScope
public class SaveData {
	List<Spitter> spitter_repository;

	public SaveData() {
		spitter_repository = new ArrayList<Spitter>();
	}

	public void save(Spitter spitter) {
		spitter_repository.add(spitter);
	}
	public Spitter getByUsername(String username) {
		Spitter result = null;
		for(Spitter spitter:spitter_repository) {
			if(spitter.getUsername().compareToIgnoreCase(username) == 0) {
				result = spitter;
				break;
			}
		}
		return result;
	}
}
