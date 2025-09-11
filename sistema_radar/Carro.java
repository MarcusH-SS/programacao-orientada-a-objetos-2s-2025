
public class Carro {
     public String placa;
     public String modelo;
     public Integer ano;
     private Integer velocidade;

     public Carro(String placa, String modelo, Integer ano, Integer velocidade){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
     }

     public Integer getVelocidade(){
      return this.velocidade;
     }

     public void setVelocidade(Integer velocidade){
      if(velocidade != null && velocidade >= 0){

      
      this.velocidade = velocidade;
      }
     }

     public void acelerar() {
        this.velocidade += 10;
     }

     public void frear(){
        this.velocidade -= 10;
     }
    
}