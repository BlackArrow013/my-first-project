
/**
 * La idea de este ejercicio es crear un calendario basico con el dia, el mes
 * y el a�o en el que nos encontremos, y modificarlo a nuestro antojo. Cada mes
 * tendra treinta dias, todos y cada uno de los meses.
 *
 * @author (Jorge Jaular)
 * @version (30-10-2017)
 */
public class CalendarioBasico
{
    // El día establecido en el calendario en valor numérico o entero.
    private int day;
    // El mes establecido en el calendario en valor numérico o entero.
    private int month;
    // El año establecido en el calendario en valor numérico o entero.
    private int year;

    /**
     * El constructor del calendario, creara la fecha por defecto 01-01-01
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * Permite avanzar la fecha del calendario en un dia.
     */
    public void avanzarFecha()
    {
        day += 1;
        if (day > 30) {
            month += 1;
            day = 1;
            if (month > 12) {
                year += 1;
                month = 1;
            }
        }
    }

    /**
     * Permite establecer la fecha del calendario alterando la preestablecida.
     */
    public void fijarFecha(int dias, int meses, int anyos)
    {
        day = dias;
        month = meses;
        year = anyos;
    }

    /**
     * Devuelve en forma de tipo String la fecha en la que nos encontramos 
     * segun un calendario. El formato es el siguiente: dd/mm/aa.
     */
    public String obtenerFecha()
    {
        String dosNumDay = day + "";
        String dosNumMonth = month + "";
        String dosNumYear = year + "";
        if (day < 10) {
            dosNumDay = "0" + day;
        }
        if (month < 10) {
            dosNumMonth = "0" + month;
        }
        if (year < 10) {
            dosNumMonth = "0" + year;
        }
        return dosNumDay + "-" + dosNumMonth + "-" + dosNumYear;
    }

}
