/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 */
import javax.swing.JOptionPane;

interface OperacoesConta {
    void depositar(float valor);
    void sacar(float valor);
}

public class Conta implements OperacoesConta {
    private int numero;
    private float saldo;

    public Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(float valor) {
        saldo += valor;
    }

    @Override
    public void sacar(float valor) {
        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            saldo -= valor;
        }
    }
}

