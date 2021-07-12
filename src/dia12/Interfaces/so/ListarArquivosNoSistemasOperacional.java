package dia12.interfaces.so;

public class ListarArquivosNoSistemasOperacional implements Linux, Windows {
    @Override
    public void runCommandOnLinux() {
        System.out.println("ls");
    }

    @Override
    public void runCommandOnWindows() {
        System.out.println("dir");
    }
}
