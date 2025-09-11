public class radar {
    public Integer LimiteVelocidade;
    public String Localizacao;

      public radar(Integer LimiteVelocidade, String Localizacao){
        this.LimiteVelocidade = LimiteVelocidade;
        this.Localizacao = Localizacao;
      }

    public void avaliarvelocidade(Carro carro){
        if(carro.getVelocidade() > this.LimiteVelocidade){
            //emitir notificação
            emitirnotificacao(carro.placa, carro.getVelocidade());
        }
    }
    public void emitirnotificacao(String placa, Integer velocidadeobservada){
        System.out.println("Placa: "+ placa);
        System.out.println("Velocidade observada: "+ velocidadeobservada);
        System.out.println("Limite da via: "+ this.LimiteVelocidade);
    }

    }

