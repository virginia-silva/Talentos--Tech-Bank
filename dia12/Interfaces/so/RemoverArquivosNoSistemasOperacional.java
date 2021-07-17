package dia12.interfaces.so;

public class RemoverArquivosNoSistemasOperacional implements Linux {
    @Override
    public void runCommandOnLinux() {
        System.out.println("rm");
    }

}
