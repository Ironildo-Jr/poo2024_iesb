package br.edu.iesb.poo2024.devlab1;

public class SistemaGestaoAlocacoesTccMain {
    public static void main(String args[]){
        Aluno aluno = alterarPessoa(new Aluno());
        aluno.getCpf();
        System.out.println("Ironildo Junior- 2312082021");
    }

    private static Aluno alterarPessoa(Pessoa p){
        return new Aluno(0, p.getNome(), p.getCpf(), p.getDataNascimento(), p.getId(), 0, null, 0, null);
    }
}
