import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer>  agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removeContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer num = null;
        if (!agendaContatoMap.isEmpty()) {
            num = agendaContatoMap.get(nome);
        }
        return num;
    }

    
}
