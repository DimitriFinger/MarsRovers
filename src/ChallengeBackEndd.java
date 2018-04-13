public class ChallengeBackEndd {  
    public static void main(String[] args) {
       Rover rover = new Rover();
       
       
       String TamCampo = "5 5"; 
       String[] partesCampo = TamCampo.split(" "); 
       int Xcamp = Integer.parseInt(partesCampo[0]);
       int Ycamp = Integer.parseInt(partesCampo[1]);            
       rover.CriaCampo(Xcamp, Ycamp);
       
       String PosInicial = "3 3 E";
       String[] partesPosInicial = PosInicial.split(" ");
       int posX = Integer.parseInt(partesPosInicial[0]);
       int posY = Integer.parseInt(partesPosInicial[1]);
       int dir = Rover.N;
       if("N".equals(partesPosInicial[2]))
           dir = Rover.N;
       else if ("E".equals(partesPosInicial[2]))
           dir = Rover.E;
       else if ("S".equals(partesPosInicial[2]))
           dir = Rover.S;
       else if("W".equals(partesPosInicial[2]))
           dir = Rover.W;
                   
             
       rover.PosicaoInicial(posX,posY,dir);
       
       rover.ImprimePosicao();
       rover.RecebeComandos("MMRMMRMRRM");
       rover.ImprimePosicao();
       
       
    }
}
