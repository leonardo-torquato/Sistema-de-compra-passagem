package compradepassagemtrem.dominio;

public class Assento {
    private EstadoAssento estadoAssento;
    private IdAssento idAssento;
    private Passageiro passageiro;

    public Assento(EstadoAssento estadoAssento, IdAssento idAssento) {
        this.estadoAssento = estadoAssento;
        this.idAssento = idAssento;
    }

    @Override
    public String toString() {
        return "Assento{" +
                "estadoAssento=" + estadoAssento +
                ", idAssento=" + idAssento +
                ", passageiro=" + passageiro +
                '}';
    }

    public EstadoAssento getEstadoAssento() {
        return estadoAssento;
    }

    public void setEstadoAssento(EstadoAssento estadoAssento) {
        this.estadoAssento = estadoAssento;
    }

    public IdAssento getIdAssento() {
        return idAssento;
    }

    public void setIdAssento(IdAssento idAssento) {
        this.idAssento = idAssento;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
}
