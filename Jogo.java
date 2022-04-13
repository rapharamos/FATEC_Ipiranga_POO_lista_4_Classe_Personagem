import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem("Cacador", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 4, 10);
        Personagem guloso = new Personagem("Guloso", 4, 10, 2);
        Personagem preguica = new Personagem("Preguica", 1, 10, 10);
        Random gerador = new Random();
        while(true){
            int oQueFazer = gerador.nextInt(4)+1;
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    soneca.cacar();
                    guloso.cacar();
                    break;
                case 2:
                    cacador.comer();
                    soneca.comer();
                    guloso.comer();
                    preguica.comer();
                    break;
                case 3:
                    cacador.dormir();
                    soneca.dormir();
                    guloso.dormir();
                    preguica.dormir();
                    break;
                case 4:
                    cacador.cacar();
                    soneca.dormir();
                    guloso.comer();
            }
            System.out.println("==============================");
            Thread.sleep(2000);
        }
    }
}
