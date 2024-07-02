/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guilh
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numeroConta = (int) (Math.random() * 10000);
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do titular:");
        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do titular:");
        String saldoInicialInput = JOptionPane.showInputDialog(null, "Digite o saldo inicial:");
float saldoInicial;

if (saldoInicialInput != null && !saldoInicialInput.isEmpty()) {
    saldoInicial = Float.parseFloat(saldoInicialInput);
} else {
    JOptionPane.showMessageDialog(null, "Valor inválido para o saldo inicial.", "Erro", JOptionPane.ERROR_MESSAGE);
    return; 
}


        Conta conta = new Conta(numeroConta, saldoInicial);
        Pessoa titular = new Pessoa(nome, cpf);

        int opcao;
        do {
            String escolha = "Selecione uma opção:\n" +
                    "1 - Depositar\n" +
                    "2 - Sacar\n" +
                    "3 - Imprimir dados\n" +
                    "4 - Dados do projeto\n" +
                    "5 - Sair";

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, escolha));

            switch (opcao) {
                case 1:
                    float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor a depositar:"));
                    conta.depositar(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    float valorSaque = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor a sacar:"));
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    String dadosConta = "Nome do titular: " + titular.getNome() + "\nCPF: " + titular.getCpf() + "\nNúmero da conta: " + conta.getNumero() + "\nSaldo: " + conta.getSaldo();
                    JOptionPane.showMessageDialog(null, dadosConta, "Dados da Conta", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Projeto realizado por Guilherme Poppi Lima - RGM 34029940", "Dados do Projeto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo... tchau!!", "Encerramento", JOptionPane.INFORMATION_MESSAGE);
                    break;                
            }
        } while (opcao != 5);
    }
}
