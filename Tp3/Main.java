public class Test {
 public static void main(String[] args){
Adresse adr;
adr=new Adresse();
adr.codePostal=2000;
adr.gouvernorat= "Tunis";
adr.ville="Tunis";
adr.afficher();
adr.modifier(1987);
adr.afficher();
adresse adr2=new Adresse(1500,"ariana,"ariana");
adr2.afficher();
adr2.modifier(10100);
adr2.afficher();
}}

 }