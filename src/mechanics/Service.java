package mechanics;

import transport.Bus;
import transport.Transport;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Service {

    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();
    public void addAuto (Transport<?> transport){
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в ТО");
        } else {
            transportQueue.add(transport);
        }
    }
    public void checkupAuto () {
        Transport<?> transport = transportQueue.poll();
        if (transport != null) {
            transport.getMechanics().get(0).checkupAuto;
        }


    }
}
