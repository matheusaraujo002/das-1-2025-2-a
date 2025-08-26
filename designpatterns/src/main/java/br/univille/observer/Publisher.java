package br.univille.observer;

import java.util.ArrayList;

public class Publisher {
    // Lista estática
    // private Subscriber[] subscribers = new Subscriber[10];

    
    // Lista dinâmica de assinantes
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    private String mainState;

    // Getter
    public String getMainState() {
        return mainState;
    }

    // Setter
    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    // Inscreve um assinante na lista de assinantes
    public void subscribe(Subscriber assinante) {
        subscribers.add(assinante);
    }

    // Notifica todo mundo da mensagem nova
    public void notifySubscribers() {
        for(Subscriber umAssinante: subscribers) {
            umAssinante.update(mainState);
        }
    }
}
