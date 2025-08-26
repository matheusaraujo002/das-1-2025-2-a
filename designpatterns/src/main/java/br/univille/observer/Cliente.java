package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var ZeDoBar = new ConcreteSubscribers();
        var Caramelo = new ConcreteSubscribers();
        var TiaRoseli = new ConcreteSubscribers();

        grupoFamilia.subscribe(ZeDoBar);
        grupoFamilia.subscribe(Caramelo);
        grupoFamilia.subscribe(TiaRoseli);

        grupoFamilia.setMainState("Bom dia meu povo 👍");
        grupoFamilia.notifySubscribers();
    }
}
