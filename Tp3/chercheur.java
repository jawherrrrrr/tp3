
    public class chercheur {
        static int nbc = 0;
        public String nom;
        public String poste;
        public int nmac;

        public chercheur() {
            nbc++;
            public String toString () {

                return ("Nom: " + nom + " Poste: " + poste + " Nmac: " + nmac);
            }
        public chercheur(String nom, String poste, int nmac){
                this.nom = nom;
                this.poste = poste;
                this.nmac = nmac;
                nbc++;
?
                public void afficher ()
                {
                    System.out.println("Nom:" + nom + " Poste: " + poste + " Nmac: " + nmac);
                }
                public Boolean comparer (Chercheur C)
            }
            if (this.nmac == C.nmac) {
                if (this.nom == C.nom) {
                    if (this.poste == C.poste) {
                        return true;
                    }
                }
                return false;
            }
            public void modifier ( int c){
                nmac = c;
                public void ajouter (String nom, String poste,int nmac){
                    this.nom = nom;
                    this.poste = poste;
                    this.nmac = nmac;
                }
            }
        }
    }