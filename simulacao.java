public class simulacao {
    
    public static void main(String[] args) {
        System.out.println("simulacao");

        Carro opala = new Carro();
        opala.ano = 76;
        opala.modelo = "comodoro";
        opala.placa = "ACLR300";
        opala.velocidade = 0;

        radar radar = new radar();
        radar.LimiteVelocidade = 60;
        radar.Localizacao = "Pistão Sul";

        radar.avaliarvelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); // 70

        radar.avaliarvelocidade(opala);
    }
}
