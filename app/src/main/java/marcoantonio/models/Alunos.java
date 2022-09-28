package marcoantonio.models;

importjavax.persistence.Entity;
importjavax.persistence.Table;
importjavax.persistence.Id;
importjavax.persistence.GeneratedValue;
importjavax.persistence.GenerationType;

@Entity
@Table(name="alunos")
public class Aluno {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;

    public void set Id(int id) {
         this.id = id;
    }
     
    public int getId() {
         return id;
    }
    
    public void setNome(String nome) {
         this.nome = nome;
    } 
     
    public String getNome() {
         return nome;     
    }
        
    public void setIdade(int idade) {
         this.idade = idade;
    } 
    
    public int getIdade() {
         return idade;     
    } 
} 
