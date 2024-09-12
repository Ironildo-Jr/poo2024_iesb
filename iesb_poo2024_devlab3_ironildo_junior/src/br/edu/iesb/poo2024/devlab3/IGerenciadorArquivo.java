package br.edu.iesb.poo2024.devlab3;

public interface IGerenciadorArquivo {
    public static final String TIP_ARQUIVO_CSV = ".csv";
    public static final String TIP_ARQUIVO_TXT = ".txt";

    public void lerArquivoDisco(String pathArquivo, boolean isPrint);
}
