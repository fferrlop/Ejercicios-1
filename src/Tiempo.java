public class Tiempo {

    public static final int SEGUNDOS_EN_UN_MINUTO = 60;
    public static final int MINUTOS_EN_UNA_HORA = 60;
    public static final int HORAS_EN_UN_DIA = 24;
    public static final int DIAS_EN_EL_AÑO = 365;

        public static int calcular_segundos_en_año (int año) {
            return año * DIAS_EN_EL_AÑO * HORAS_EN_UN_DIA * MINUTOS_EN_UNA_HORA * SEGUNDOS_EN_UN_MINUTO;
        }

}
