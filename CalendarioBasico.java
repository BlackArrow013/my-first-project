
/**
 * La idea de este ejercicio es crear un calendario basico con el dia, el mes
 * y el año en el que nos encontremos, y modificarlo a nuestro antojo. Cada mes
 * tendra treinta dias, todos y cada uno de los meses.
 *
 * @author (Jorge Jaular)
 * @version (30-10-2017)
 */
public class CalendarioBasico
{
    // El dia establecido en el calendario en valor numerico o entero.
    private int day;
    // El mes establecido en el calendario en valor numerico o entero.
    private int month;
    // El año establecido en el calendario en valor numerico o entero.
    private int year;

    /**
     * El constructor del calendario, creara la fecha por defecto 01-01-01
     */
    public CalendarioBasico()
    {
        day = 01;
        month = 01;
        year = 01;
    }

    /**
     * Permite avanzar la fecha del calendario en un dia.
     */
    public void avanzarFecha()
    {
        day += 01;
        if (day > 30) {
            month += 01;
            day = 01;
            if (month > 12) {
                year += 01;
                month = 01;
            }
        }
    }

    /**
     * Permite establecer la fecha del calendario alterando la preestablecida.
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
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
            dosNumYear = "0" + year;
        }
        return dosNumDay + "-" + dosNumMonth + "-" + dosNumYear;
    }

}
