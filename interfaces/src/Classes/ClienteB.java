package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClienteB implements CRUD, Calculavel {
    @Override
    public void Inserir() {
        JOptionPane.showMessageDialog(null,"Inserindo clienteB");
    }

    @Override
    public void Atualizar() {
        JOptionPane.showMessageDialog(null,"Atualizando clienteB");
    }

    @Override
    public void Apagar() {
        JOptionPane.showMessageDialog(null,"Apagando clienteB");
    }

    @Override
    public void Ler() {
        JOptionPane.showMessageDialog(null,"Lendo clienteB");
    }

    @Override
    public void Selecionar() {
        JOptionPane.showMessageDialog(null,"Selecionando clienteB");
    }

    @Override
    public String imprimir() {
        return "IMPRESSO COM SUCESSO";
    }

    @Override
    public double CalcularImposto() {
        double imp = 0.15;
        double ImpTotal = imp*CalcularCompra();
        return ImpTotal;
    }

    @Override
    public double CalcularCompra() {
        double prod1 = 20;
        double prod2 = 20;
        double soma = prod1+prod2;
        return soma;
    }
}
