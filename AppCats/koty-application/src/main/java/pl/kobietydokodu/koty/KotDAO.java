package pl.kobietydokodu.koty;

import java.util.List;
import java.util.ArrayList;
import pl.kobietydokodu.koty.domain.Kot;

public class KotDAO {
	List<Kot> koty = new ArrayList<Kot>();
	
	public void dodajKota(Kot kot) {
		koty.add(kot);
	}
	
	public List<Kot> getKoty() {
		return koty;
	}
}