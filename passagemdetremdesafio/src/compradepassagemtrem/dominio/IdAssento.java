package compradepassagemtrem.dominio;

public enum IdAssento {
    ASSENTO_1(1),
    ASSENTO_2(2),
    ASSENTO_3(3),
    ASSENTO_4(4),
    ASSENTO_5(5),
    ASSENTO_6(6),
    ASSENTO_7(7),
    ASSENTO_8(8),
    ASSENTO_9(9),
    ASSENTO_10(10);

    private final int id;

    IdAssento(int id) {
        this.id = id;
    }

    public static IdAssento retornaAssentoPorId(int numeroAssento) {
        for (IdAssento assento : IdAssento.values()) {
            if (assento.id == numeroAssento) {
                return assento;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }
}
