import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ArquivoSystemItem relatorio = new Arquivo("Relatorio.txt");
        ArquivoSystemItem luz = new Arquivo("ContaLuz.pdf");
        ArquivoSystemItem site = new Arquivo("Codigo.tsx");
        ArquivoSystemItem api = new Arquivo("Codigo.java");
        ArquivoSystemItem relatorios = new Pasta("relatorios", Arrays.asList(relatorio));
        ArquivoSystemItem codigos = new Pasta("codigos", Arrays.asList(site, api));
        ArquivoSystemItem home = new Pasta("home", Arrays.asList(luz, relatorios, codigos));

        home.imprimir("");

    }
}
