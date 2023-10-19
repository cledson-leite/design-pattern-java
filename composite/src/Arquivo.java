

public class Arquivo implements ArquivoSystemItem {
    private String name;

    public Arquivo(String name) {
        this.name = name;
    }

    @Override
    public void imprimir(String structure) {
        System.out.println(structure + name);
    }
    
}
