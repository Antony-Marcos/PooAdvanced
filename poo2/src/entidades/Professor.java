package entidades;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    public Professor(int id, String nome,String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getId(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }


}
