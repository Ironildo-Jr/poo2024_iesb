package br.edu.iesb.poo2024.atividadeAvaliativa;

public enum EnumExcecoes {
    INGRESSO_CLIENTE("Cliente ou sessao invalidos"), SALA("Sala indisponivel"), MENOR_IDADE("Cliente nao pode ver o filme por causa da idade"), SESSAO_CHEIA("Sessao cheia"), ID_INVALIDO("ID invalido");

    private String mensagem;

    private EnumExcecoes(String msg){
        mensagem = msg;
    }

    public String getMensagem() {
        return mensagem;
    }
}
