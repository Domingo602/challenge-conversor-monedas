import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String opcion = null;
        Cambio cambio = new Cambio();
        MenuConversor menu = new MenuConversor();
        Scanner lectura = new Scanner(System.in);

        while (opcion != "7") {
            try{
                menu.exhibirMenu();

                opcion = lectura.nextLine();

                if (!opcion.matches("[0-9]*")) {
                    System.out.println("Opción no numérica: "+ opcion+" , intente nuevamente.");
                }else {
                    Integer opcionInt = Integer.valueOf(opcion);
                    if (opcionInt >= 1 && opcionInt <= 6) {

                        cambio.setBaseCode(MenuConversor.baseOpc[opcionInt]);
                        cambio.setTargetCode(MenuConversor.targetOpc[opcionInt]);
                        System.out.println("Ingresa el valor en " + cambio.getBaseCode() + " que deseas Convertir: ");
                        cambio.setAmount(Double.valueOf(lectura.nextLine()));
                        ConsultaCambios consulta = new ConsultaCambios();
                        consulta.buscaCambios(cambio, opcionInt);
                        System.out.println("El valor " + cambio.getAmount() + " [" +
                                cambio.getBaseCode() + "]" + " corresponde al valor final de =>>> " +
                                cambio.getConversionResult() + " " + cambio.getTargetCode());
                    } else if (opcionInt == 7) {
                        break;
                    } else {
                        System.out.println("Opción errónea: " + opcion + " , intente nuevamente.");
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("Cambio no encontrado "+e.getMessage());
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
        System.out.println("Programa Conversor de Moneda ha Finalizado");
    }
}
