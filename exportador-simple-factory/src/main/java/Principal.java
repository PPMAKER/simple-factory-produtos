import com.ppmaker.exportador.ExportadorListaProduto;
import com.ppmaker.exportador.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 05728612148
 */
public class Principal {

    public static void main(String[] args) {
       final List<Produto> produtos = new ArrayList<>();
       produtos.add(new Produto(1, "TV", "LG", "1234-a", 1200));
       produtos.add(new Produto(2, "Geladeira", "Eletrolux", "Delux", 400));
       produtos.add(new Produto(3, "Notebook", "Asus", "Predator", 850));
       
       ExportadorListaProduto exportadorListaHtml = ExportadorListaProduto.newInstance();
       System.out.println("Lista em HTML\n");
       System.out.println(exportadorListaHtml.exportar(produtos));
       
       ExportadorListaProduto exportadorListaMarkdown = ExportadorListaProduto.newInstance("md");
       System.out.println("Lista em Markdown");
       System.out.println(exportadorListaMarkdown.exportar(produtos));
       
       ExportadorListaProduto exportadorListaCSV = ExportadorListaProduto.newInstance("csv");
       System.out.println("Lista de Produtos em CSV\n");
       System.out.println(exportadorListaCSV.exportar(produtos));
    }
    
}