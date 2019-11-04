/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author Gregio
 */
public class RegistroPonto {
    
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro; 
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public void ApresentarRegistroPonto(){
        
        System.out.println("Funcionario: "+func);
        System.out.println("Data de Registro: "+dataRegistro);
        System.out.println("Horario Entrada: "+horaEntrada);
        System.out.println("Horario Saida: "+horaSaida);
    
    }
    
}
