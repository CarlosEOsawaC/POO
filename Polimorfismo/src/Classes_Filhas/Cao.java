package Classes_Filhas;

import Classes_Pai.Animal;

public class Cao extends Animal {
    private int hora;
    private boolean EMcasa;
    public void Atividade(int hora){
        this.hora = hora;
        if (this.hora>=6 && this.hora<=7) {
            System.out.println("Hora de comer");
        }else{
            System.out.println("Brincando");
        }
    }
    public void Atividade(int hora,Boolean EMcasa){
        this.hora = hora;
        this.EMcasa = EMcasa;
        if (this.EMcasa == true) {
        if (this.hora>22) {
            System.out.println("Dormindo");
        }else{
            System.out.println("Brincando/deitado");
        }
        }else{
            System.out.println("Rotina Alterada");
        }
    }

    @Override
    public void locomover() {

    }

    @Override
    public void comida() {

    }

    @Override
    public void som() {

    }
}
