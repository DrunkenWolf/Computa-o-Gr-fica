
package vizinhanca;


public class Main {

   
    public static void main(String[] args) {
        try {
            Imagem img = new Imagem("image.jpg");
            Vizinhanca vizinhanca = new Vizinhanca(img);
            vizinhanca.calcular4VizinhancaHorVert();
            vizinhanca.gerarImagemSaida("image.jpg");
            vizinhanca.calcular4VizinhancaDiagonal();
            vizinhanca.gerarImagemSaida("image.jpg");
            vizinhanca.calcular8Vizinhanca();
            vizinhanca.gerarImagemSaida("image.jpg");
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
        }
    }

}
