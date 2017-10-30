
/**
 * La idea de este ejercicio es crear un calendario básico con el día, el mes
 * y el año en el que nos encontremos, y modificarlo a nuestro antojo. Cada mes
 * tendrá treinta días, todos y cada uno de los meses.
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
     * El constructor del calendario, creará la fecha por defecto 01-01-01
     */
    public CalendarioBasico()
    {
        day = 01;
        month = 01;
        year = 01;
    }
    
    /**
     * Permite avanzar la fecha del calendario en un día.
     */
    public void avanzarFecha()
    {
        day += 1;
    }

    /**
     * Devuelve en forma de tipo String la fecha en la que nos encontramos 
     * según un calendario.
     */


}
