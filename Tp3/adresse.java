class adresse {
    private String gouvernorat;
    private String ville;
    private int codePostal;

    public adresse(String gouvernorat, String ville, String codePostal) {
        this.gouvernorat = gouvernorat;
        this.ville = ville;
        this.codePostal = codePostal;
    }
    public String getGouvernorat() {
        return gouvernorat;
    }
    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    public void modifier(int c){
        codePostal=c;
    }
    public String toString() {
        return codePostal:"+codepostal+" gouvernorat:
        "+gouvernorat+" ville:
        "+ville";
    }
    }