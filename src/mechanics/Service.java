package mechanics;

import transport.Bus;
import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class Service {
    Queue<Transport> list = new LinkedList<>();

    public void addAuto (){
    }
    public void checkupAuto () {
    }

    public Queue<Transport> getList() {
        return list;
    }

    public void setList(Queue<Transport> list) {
        this.list = list;
    }

}
