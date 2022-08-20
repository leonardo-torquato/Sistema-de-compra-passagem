package compradepassagemtrem.dominio;

public enum EstadoAssento {
        VAGO("Disponível para reserva."),
        OCUPADO("Assento reservado.");

        private final String nomeRelatorio;

        EstadoAssento(String nomeRelatorio) {
                this.nomeRelatorio = nomeRelatorio;
        }

        public String getNomeRelatorio() {
                return nomeRelatorio;
        }
}
