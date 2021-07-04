package pl.kobietydokodu.koty;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import pl.kobietydokodu.koty.domain.Kot;


@Repository
public class KotDAO {
	List<Kot> koty = new ArrayList<Kot>();
	
	public void dodajKota(Kot kot) {
		koty.add(kot);
		System.out.println(kot.getImie());
	}
	
	public List<Kot> getKoty() {
		System.out.println("Zwrócono listê kotów");

		return koty;
	}
	
	public Kot getKotById(Integer id) {
		if (id<koty.size()) {
			return koty.get(id);
		} else {
			return null;
		}
	}
}
