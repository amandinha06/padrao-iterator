package padroescomportamentais.iterator;

public class Musica {
    private String nome;
    private boolean nacional;

    public Musica(String nome, boolean nacional){
        this.nome = nome;
        this.nacional = nacional;
    }

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public boolean isNacional() {return nacional;}
    public void setNacional(boolean nacional){this.nacional = nacional;}
}
