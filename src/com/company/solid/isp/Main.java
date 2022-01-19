package com.company.solid.isp;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);
        if (transport!= null){
            runTrasnport();
        }
    }

    private static void runTrasnport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            default:
                System.out.println("Selecione o tipo de entrega");
        }
    }
}
