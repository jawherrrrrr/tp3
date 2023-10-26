public class Laboratoire {
    public String nom;
    public String specialite;
    public Adresse A
    public Bureau B[]
    public Laboratoire() {
    }
public Laboratoire (String nom, String specialite, Adresse A, Bureau B[]){
        this. specialite = specialite;
        this.nom = nom;
        this.A =A;
        this. B=new Bureau [50];
        this.B=B;
    }
    public void afficher()
System.out.println(" Nom: "+nom+" specialite" +specialite)
this.A.afficher(;
int i;
int n=this.B.length;
for (i=0;i<n; i++)
    {
this. B[i].afficher ();
}
}
public String toString() {
    String result = "***" + nom + "*****";
    result += specialite;
    result += "adresse: " + A;
    int i;
    int n = this.B.length;
    for (i = 0; i < n; i++) {
        result += this.B[i];
    }
*/
    for (Bureau BB : B) {
        if (BB != null)
            result += BB;
    }
    return result;
}}