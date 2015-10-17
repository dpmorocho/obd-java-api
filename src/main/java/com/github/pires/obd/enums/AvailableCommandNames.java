package com.github.pires.obd.enums;

/**
 * Names of all available commands.
 */
public enum AvailableCommandNames {

    AIR_INTAKE_TEMP("Temperatura de entrada de aire"),
    AMBIENT_AIR_TEMP("Temperatura ambiental de aire"),
    ENGINE_COOLANT_TEMP("Temperatura del refrigerante"),
    BAROMETRIC_PRESSURE("Presión Barométrica"),
    FUEL_PRESSURE("Presión del combustible"),
    INTAKE_MANIFOLD_PRESSURE("Temperatura del colector de admisión"),
    ENGINE_LOAD("Carga del motor"),
    ENGINE_RUNTIME("Tiempo de ejecución del motor"),
    ENGINE_RPM("RPM del motor"),
    SPEED("Velocidad"),
    MAF("Flujo de masa de aire"),
    THROTTLE_POS("Posición del acelerador"),
    TROUBLE_CODES("Códigos de averías"),
    FUEL_LEVEL("Nivel de combustible"),
    FUEL_TYPE("Tipo de combustible"),
    FUEL_CONSUMPTION_RATE("Tasa de consumo de combustible"),
    TIMING_ADVANCE("Variador"),
    DTC_NUMBER("Códigos de diagnóstico"),
    EQUIV_RATIO("Lambda"),
    DISTANCE_TRAVELED_AFTER_CODES_CLEARED("Distancia desde último borrado de códigos de averías"),
    CONTROL_MODULE_VOLTAGE("Módulo de control de voltaje"),
    ENGINE_FUEL_RATE("Tasa de combustible del motor"),
    FUEL_RAIL_PRESSURE("Presión del carril de combustible"),
    VIN("ID del vehículo (VIN)"),
    DISTANCE_TRAVELED_MIL_ON("Distancia recorrida con MIL"),
    TIME_TRAVELED_MIL_ON("Tiempo transcurrido con MIL"),
    TIME_SINCE_TC_CLEARED("Tiempo desde el último borrado de códigos"),
    REL_THROTTLE_POS("Posición relativa del acelerador"),
    PIDS_01_20("Available PIDs 01-20"),
    PIDS_21_40("Available PIDs 21-40"),
    PIDS_41_60("Available PIDs 41-60"),
    ABS_LOAD("Carga absoluta"),
    ENGINE_OIL_TEMP("Temperatura del aceite del motor"),
    AIR_FUEL_RATIO("Tasa de aire/combustible"),
    WIDEBAND_AIR_FUEL_RATIO("Tasa de la banda de aire/combustible");

    private final String value;

    /**
     * @param value
     */
    private AvailableCommandNames(String value) {
        this.value = value;
    }

    /**
     * @return a {@link String} object.
     */
    public final String getValue() {
        return value;
    }

}
