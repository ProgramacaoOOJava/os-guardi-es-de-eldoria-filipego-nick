public class Personagem {
   public String nome,classe;      //Declaração de variáveis
    public int nivel,pontos_vida;
    public double poder_base;

    public Personagem(String nome, String Classe, int nivel, int pontos_vida, double poder_base){ //Método construtor do personagem
        this.nome=nome;                 //Estabelecimento dos atributos do personagem
        this.classe=Classe;
        this.nivel=nivel;
        this.pontos_vida=pontos_vida;
        this.poder_base=poder_base;
    }

    public void exibirStatus(){ //Exibe na tela os atributos dos personagens
        System.out.println("Nome do personagem: "+nome+"\nClasse: "+classe+"\nNivel: "+nivel+"\nPontos de vida: "+pontos_vida+"\nQuantidade de poder: "+poder_base+"\n\n"); /
        }
    }


