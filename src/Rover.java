public class Rover {
   public int posicaoX;
   public int posicaoY;
 
   public static final int N = 1;
   public static final int E = 2;
   public static final int S = 3;
   public static final int W = 4;
   int mapaX = 0;
   int mapaY = 0;
   int orientacao = 'N';
   
   
   public Rover (){
   
    }    
   
   public void PosicaoInicial(int posX, int posY, int orientacao){
       this.posicaoX = posX;
       this.posicaoY = posY;
       this.orientacao = orientacao;      
    }   
   
   public void CriaCampo(int mapaX, int mapaY)
   {   
       this.mapaX = mapaX;
       this.mapaY = mapaY;
    }
   
  public void ImprimePosicao(){
    char direcao = 'N';
        
       switch (orientacao) {
           case 1:
               direcao = 'N';
               break;
           case 2:
               direcao = 'E';
               break;
           case 3:
               direcao = 'S';
               break;
           case 4:
               direcao = 'W';
               break;
           default:
               break;
       }
            System.out.println(posicaoX + " " + posicaoY + " " + direcao);
     }
  
  //recebe a string
    public void RecebeComandos(String comandos){
        for (int i = 0; i < comandos.length();i++)
            ExecutaComando(comandos.charAt(i));        
    }
        
    
  //trata o caractér específico   
    public void ExecutaComando(Character cmd){            
        if(cmd.equals('L') || cmd.equals('R') ){
            if(cmd.equals('L')){
                virarEsquerda();
            }
            else{
                virarDireita();
            }
        } else           
            mover();
    }
    
    //metodo para movimentar
    public void mover(){            
            if(orientacao == N && ((posicaoY) < mapaY) )
                this.posicaoY++;
            else if (orientacao == S && ((posicaoY) > 0))                
                this.posicaoY--;            
            else if (orientacao == E && ((posicaoX) < mapaX ))
                this.posicaoX++;
            else if (orientacao == W && ((posicaoX) > 0))
                this.posicaoX--;
                                        
    }
    
    //metodos para rotação
    public void virarEsquerda(){        
        if ((orientacao - 1) < N)
            orientacao = W;   
        else  
             orientacao--;              
    }
    
    public void virarDireita(){
        if ((orientacao + 1) > W)
            orientacao = N;   
        else 
            orientacao++;                
    }       
            
  }