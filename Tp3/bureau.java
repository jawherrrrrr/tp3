public class bureau {
    public int code;
    public String nom;
    public chercheur c[];

    public bureau(int code,String nom, chercheur c1[]){
        this.code=code;
        this.nom=nom;
        this.c=new chercheur[5];
        this.c=c1;
    }
    public void Afficher_bureau(){
        System.out.println(" le code de cet bureau est : " +code+ " , son nom est : " +nom);
        int i;
        int n=this.c.length;
        for(i=0;i<n;i++){
            this.c[i].Afficher_chercheur();
            System.out.println(this.c[i].toString());
        }
    }
    public String toString(){
        String result=" le code de cet bureau est : " +code+ " , son nom est : " +nom;
        int i;
        int n=this.c.length;
        for(i=0;i<n;i++){
            result+=this.c[i].toString();
        }
        return result;
    }


}
