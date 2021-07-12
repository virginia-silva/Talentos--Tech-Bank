package dia12.interfaces.so;

public class Main {

    public static void runLinuxCommand(Linux linux) {
        linux.runCommandOnLinux();
    }

    public static void runWindowsCommand(Windows windows) {
        windows.runCommandOnWindows();
    }

    public static void runCommand(Object o) {
        if (o instanceof Windows) {
            runWindowsCommand((Windows) o);
        }

        if (o instanceof Linux) {
            runLinuxCommand((Linux) o);
        }
    }

    public static void main(String[] args) {
        ListarArquivosNoSistemasOperacional l = new ListarArquivosNoSistemasOperacional();
        RemoverArquivosNoSistemasOperacional r = new RemoverArquivosNoSistemasOperacional();
        runCommand(l);
        System.out.println("-----");
        runCommand(r);


        System.out.println("-----");
        System.out.println(l instanceof Object);
        System.out.println(l instanceof ListarArquivosNoSistemasOperacional);
        System.out.println(l instanceof Windows);
        System.out.println(l instanceof Linux);

        System.out.println("-----");
        System.out.println(r instanceof Object);
        System.out.println(r instanceof RemoverArquivosNoSistemasOperacional);
        System.out.println(r instanceof Windows);
        System.out.println(r instanceof Linux);


    }

}
