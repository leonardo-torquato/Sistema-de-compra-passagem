package compradepassagemtrem.dominio;

public class Vagao {
    private static final int quantidadeAssentos = IdAssento.values().length;
    private static final Assento[] assentos = new Assento[quantidadeAssentos];

    {
        for (int i = 0; i < quantidadeAssentos; i++) {
            IdAssento id = IdAssento.retornaAssentoPorId(i + 1);
            assentos[i] = new Assento(EstadoAssento.VAGO, id);
        }
    }

    public Vagao() {
    }

    public void mostrarAssentos() {
        System.out.println("-------------------------");
        System.out.println("RELAÇÃO ASSENTOS NO VAGÃO");
        System.out.println("-------------------------");
        for (Assento assento : assentos) {
            System.out.print("Assento [" + assento.getIdAssento().getId() + "]: ");
            System.out.println(assento.getEstadoAssento().getNomeRelatorio());
        }
    }

    public void reservarAssento(int numeroAssento, Passageiro passageiro) {
        IdAssento id = IdAssento.retornaAssentoPorId(numeroAssento);
        for (Assento assento : assentos) {
            if (assento.getIdAssento() == id && assento.getEstadoAssento() == EstadoAssento.VAGO) {
                assento.setEstadoAssento(EstadoAssento.OCUPADO);
                assento.setPassageiro(passageiro);
                System.out.println("Assento reservado com sucesso!");
                return;
            }
        }
        System.out.println("O assento escolhido já está ocupado!");
    }

    public void cancelarReserva(int numeroAssento, Passageiro passageiro) {
        IdAssento id = IdAssento.retornaAssentoPorId(numeroAssento);
        for (Assento assento : assentos) {
            if (assento.getIdAssento() == id && assento.getPassageiro() == passageiro) {
                assento.setEstadoAssento(EstadoAssento.VAGO);
                assento.setPassageiro(null);
                System.out.println("Cancelamento de reserva efetuada com sucesso!");
                return;
            }
        }
        System.out.println("Assento ou credenciais inválidas!");
    }

    public void buscarPassageiro(String nomePassageiro) {
        for (Assento assento : assentos) {
            Passageiro passageiro = assento.getPassageiro();
            if (passageiro != null && passageiro.getNome().equals(nomePassageiro)) {
                int numeroAssento = assento.getIdAssento().getId();
                System.out.println("Passageiro encontrado no assento " + numeroAssento);
                return;
            }
        }
        System.out.println("passageiro não encontrado");
    }

    public Assento[] getAssentos() {
        return assentos;
    }
}
