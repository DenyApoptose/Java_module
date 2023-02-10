/*Énoncé : Votre entreprise déménage dans de nouveaux locaux. Les cartons sont faits (34 cartons au total)
        et le camion de l’entreprise de déménagement arrive. Les déménageurs remplissent leur camion
        avec vos cartons. Le camion a une capacité de 9 cartons. Une foisle camion plein, ilsrejoignent le
        nouveau local où ils déchargent vos cartons. Ils effectuent autant de voyages que nécessaire pour
        vider votre ancien local.*/


public class DemenagementEntreprise {
  public static void main(String[] args) {
    int nombreCartons = 34;
    int capaciteCamion = 9;
    int voyagesNecessaires = (int) Math.ceil((double) nombreCartons / capaciteCamion);

    System.out.println("Nombre de voyages necessaires : " + voyagesNecessaires);
  }
}
