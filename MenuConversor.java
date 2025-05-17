public class MenuConversor {

    static final String [] baseOpc   = {null,"USD","CLP","USD","BRL","USD","COP"};
    static final String [] targetOpc = {null,"CLP","USD","BRL","USD","COP","USD"};

    public void exhibirMenu () {

        System.out.println("""
                ************************************************************
                Sea Bienvenido(a) al Conversor de Moneda.
                
                1) Dólar           =>> Peso Chileno.
                2) Peso Chileno    =>> Dólar.
                3) Dólar           =>> Real Brasileño.
                4) Real Brasileño  =>> Dólar.
                5) Dólar           ==> Peso Colombiano.
                6) Peso Colombiano ==> Dólar.
                7) Salir.
                
                Elija una opción válida:
                ************************************************************
                """);
    }
}
