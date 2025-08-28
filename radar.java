public class radar {
    public Integer LimiteVelocidade;
    public String Localizacao;

    public void avaliarvelocidade(Carro carro){
        if(carro.velocidade > this.LimiteVelocidade){
            //emitir notificação
        }
    }
    public void emitirnotificacao(String placa, Integer velocidadeobservada){
        System.out.println("Placa: "+ placa);
        System.out.println("Velocidade observada: "+ velocidadeobservada);
        System.out.println("Limite da via: "+ this.LimiteVelocidade);
    }

    }

