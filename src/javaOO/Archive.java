package javaOO;

public class Archive {

	private Persona[] listaPersone;

	public Archive(int dim) {
		listaPersone = new Persona[dim];
	}

	public boolean addPerson(Persona p) {
		for (int i = 0; i < listaPersone.length; i++) {
			if(listaPersone[i] == null) {
				listaPersone[i] = p;
			}
		}
		return false;
	}

	public boolean removePersonBySurname(String cognome) {
		for (int i = 0; i < listaPersone.length; i++) {
			if (cognome.equals(listaPersone[i].cognome)) {
				listaPersone[i] = null;
				return true;
			}
		}
		return false;
	}

	/**
	 * Cerca una persona nell'archivio tramite il cognome.
	 * 
	 * @param cognome
	 * @return
	 */
	public Persona searchPersonBySurname(String cognome) {
		for (Persona p : listaPersone) {
			if (cognome.equals(p.cognome)) {
				return p;
			}
		}
		return null;
	}
}
