package Sistema_IPTU;

public class apartamento {
    private município município;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiElevador;


    public município getMunicípio() {
        return this.município;
    }

    public void setMunicípio(município município) {
        this.município = município;
    }

    public Double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean isPossuiElevador() {
        return this.possuiElevador;
    }

    public Boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

    
}
