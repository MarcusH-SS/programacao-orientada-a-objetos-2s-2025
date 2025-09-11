public class simulacao {
    
    public static void main(String[] args) {
        System.out.println("simulacao");

        Carro opala = new Carro("ACLR300", "comodoro", 76, 0);
        
        opala.placa = "ACLR300";

        radar radar = new radar(60, "Pistão Sul");
        radar.LimiteVelocidade = 60;
        radar.Localizacao = "Pistão Sul";

        radar.avaliarvelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.setVelocidade(-60);
        opala.acelerar(); // 70
        
        opala.frear(); //60

        radar.avaliarvelocidade(opala);
    }
}
