public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos ac = new AgendaContatos();

        ac.exibirContato();

        ac.adicionarContato("Rodrigo", 123456);
        ac.adicionarContato("Rodrigo", 555);
        ac.adicionarContato("Rodrigo Siqueira", 111111);
        ac.adicionarContato("Rodrigo DIO", 456789);
        ac.adicionarContato("Giovanna", 11111111);

        ac.exibirContato();

        System.out.println(ac.pesquisaPorNome("Rodrigo"));

        ac.removeContato("null");

        ac.exibirContato();
    }
}
