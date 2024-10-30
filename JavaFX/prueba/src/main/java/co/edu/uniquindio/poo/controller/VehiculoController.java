package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Vehiculo;
import java.util.Collection;

public class VehiculoController {

    private Empresa empresa;

    public VehiculoController(Empresa empresa) {
        this.empresa = empresa;
    }

    // Método genérico para agregar un vehículo
    public boolean crearVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof Auto) {
            return empresa.getAutos().add((Auto) vehiculo);
        } else if (vehiculo instanceof Moto) {
            return empresa.getMotos().add((Moto) vehiculo);
        } else if (vehiculo instanceof Camioneta) {
            return empresa.getCamionetas().add((Camioneta) vehiculo);
        }
        return false;
    }

    // Métodos para obtener las listas de cada tipo de vehículo
    public Collection<Auto> obtenerAutos() {
        return empresa.getAutos();
    }

    public Collection<Moto> obtenerMotos() {
        return empresa.getMotos();
    }

    public Collection<Camioneta> obtenerCamionetas() {
        return empresa.getCamionetas();
    }

    // Método para eliminar un vehículo por matrícula
    public boolean eliminarVehiculo(int numeroDeMatricula) {
        return eliminarAuto(numeroDeMatricula) || eliminarMoto(numeroDeMatricula) || eliminarCamioneta(numeroDeMatricula);
    }

    private boolean eliminarAuto(int numeroDeMatricula) {
        return empresa.getAutos().removeIf(auto -> auto.getNumeroDeMatricula() == numeroDeMatricula);
    }

    private boolean eliminarMoto(int numeroDeMatricula) {
        return empresa.getMotos().removeIf(moto -> moto.getNumeroDeMatricula() == numeroDeMatricula);
    }

    private boolean eliminarCamioneta(int numeroDeMatricula) {
        return empresa.getCamionetas().removeIf(camioneta -> camioneta.getNumeroDeMatricula() == numeroDeMatricula);
    }

    // Método para actualizar un vehículo
    public boolean actualizarVehiculo(int numeroDeMatricula, Vehiculo vehiculoActualizado) {
        Vehiculo vehiculoExistente = obtenerVehiculoPorMatricula(numeroDeMatricula);
        if (vehiculoExistente != null) {
            vehiculoExistente.setModelo(vehiculoActualizado.getModelo());
            vehiculoExistente.setMarca(vehiculoActualizado.getMarca());
            vehiculoExistente.setAñoDeFabricacion(vehiculoActualizado.getAñoDeFabricacion());
            vehiculoExistente.setDiasReserva(vehiculoActualizado.getDiasReserva());
            vehiculoExistente.setPrecioBase(vehiculoActualizado.getPrecioBase());

            if (vehiculoExistente instanceof Auto && vehiculoActualizado instanceof Auto) {
                ((Auto) vehiculoExistente).setNumeroDePuertas(((Auto) vehiculoActualizado).getNumeroDePuertas());
            } else if (vehiculoExistente instanceof Moto && vehiculoActualizado instanceof Moto) {
                ((Moto) vehiculoExistente).setCaja(((Moto) vehiculoActualizado).getCaja());
            } else if (vehiculoExistente instanceof Camioneta && vehiculoActualizado instanceof Camioneta) {
                ((Camioneta) vehiculoExistente).setCapacidadDeCarga(((Camioneta) vehiculoActualizado).getCapacidadDeCarga());
            }
            return true;
        }
        return false;
    }

    private Vehiculo obtenerVehiculoPorMatricula(int numeroDeMatricula) {
        for (Auto auto : empresa.getAutos()) {
            if (auto.getNumeroDeMatricula() == numeroDeMatricula) return auto;
        }
        for (Moto moto : empresa.getMotos()) {
            if (moto.getNumeroDeMatricula() == numeroDeMatricula) return moto;
        }
        for (Camioneta camioneta : empresa.getCamionetas()) {
            if (camioneta.getNumeroDeMatricula() == numeroDeMatricula) return camioneta;
        }
        return null;
    }
}
