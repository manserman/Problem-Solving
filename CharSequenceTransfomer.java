import java.util.ArrayList;
import java.util.List;

/**
 * La classe CharSequenceTransformer permet de compresser et de décompresser
 * des séquences de caractères en regroupant les caractères consécutifs avec leur
 * nombre de répétitions. Elle utilise une liste interne de la classe Config
 * pour stocker chaque caractère et sa fréquence, ce qui permet de reconvertir
 * les chaînes compressées en leur forme d'origine.
 *
 * Méthodes principales :
 * - compress(String chaine) : Prend une chaîne d'entrée et la compresse en 
 *   représentant chaque groupe de caractères consécutifs par le nombre de répétitions
 *   suivi du caractère.
 * - decompress() : Reconstruit la chaîne d'origine à partir des données stockées
 *   après une opération de compression.
 *
 * Exemple d'utilisation :
 * - Chaîne d'entrée : "aaabbc"
 *   Résultat après compression : "3a2b1c"
 *   Résultat après décompression : "aaabbc"
 *
 * Cette classe peut être utile pour des tâches de réduction de l'espace mémoire
 * et pour des transformations de chaînes nécessitant une gestion des séquences répétées.
 */

public class CharSequenceTransformer {

	List<Config> listeChaine = new ArrayList<>();

	public String Compress(String chaine) {
		if (chaine == null || chaine.isEmpty()) {
			return "";
		}
		listeChaine.clear();
		int i = 0;

		while (i < chaine.length()) {
			int repetition = 1;

			if (i != chaine.length() - 1)
				while (chaine.charAt(i) == chaine.charAt(i + 1)) {
					repetition++;
					i++;
				}
			listeChaine.add(new Config(chaine.charAt(i), repetition));
			i++;
		}
		StringBuilder str = new StringBuilder();
		for (Config c : listeChaine) {
			str.append(c.getNb());
			str.append(c.getC());
		}
		return str.toString();

	}

	public String decompress() {
		StringBuilder str = new StringBuilder();
		for (Config c : listeChaine) {
			int i = 0;
			while (i < c.getNb()) {
				str.append(c.getC());
				i++;
			}
		}
		return str.toString();
	}

	private class Config {
		private final char c;
		private final int nb;

		public Config(char c, int nb) {
			this.nb = nb;
			this.c = c;

		}

		public int getNb() {
			return nb;
		}

		public char getC() {
			return c;
		}

	}

}
