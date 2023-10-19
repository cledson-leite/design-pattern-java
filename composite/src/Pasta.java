

import java.util.List;

public class Pasta implements ArquivoSystemItem {
    
    private String name;
    private List<ArquivoSystemItem> children;
    
    public Pasta(String name, List<ArquivoSystemItem> children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public void imprimir(String structure) {
        System.out.println(structure + name);
        for (ArquivoSystemItem child : children) {
            child.imprimir(structure + "| ");
        }
    }
    
}
