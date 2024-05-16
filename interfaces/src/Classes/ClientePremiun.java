package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClientePremiun implements CRUD, Calculavel {
    @Override
    public void Inserir() {
        JOptionPane.showMessageDialog(null,"Inserindo clientePremiun");
    }

    @Override
    public void Atualizar() {
        JOptionPane.showMessageDialog(null,"Atualizando clientePremiun");
    }

    @Override
    public void Apagar() {
        JOptionPane.showMessageDialog(null,"Apagando clientePremiun");
    }

    @Override
    public void Ler() {
        JOptionPane.showMessageDialog(null,"Lendo clientePremiun");
    }

    @Override
    public void Selecionar() {
        JOptionPane.showMessageDialog(null,"Selecionando clientePremiun");
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
        double prod1 = 30;
        double prod2 = 30;
        double soma = prod1+prod2;
        return soma;
    }
}
