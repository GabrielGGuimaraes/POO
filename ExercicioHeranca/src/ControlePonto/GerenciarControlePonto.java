/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlePonto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gregio
 */
public class GerenciarControlePonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciarControlePonto gp = new GerenciarControlePonto();
        Scanner leitor = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("MENU");
            System.out.println("1.. Cadastrar Gerente");
            System.out.println("2.. Cadastrar Operador");
            System.out.println("3.. Cadastrar Secretaria");
            System.out.println("4.. Remover Gerente");
            System.out.println("5.. Remover Operador");
            System.out.println("6.. Remover Secretaria");
            System.out.println("7.. Registrar Entrada");
            System.out.println("8.. Registrar Saida");
            System.out.println("9.. Listar Gerentes");
            System.out.println("10.. Listar Operadores");
            System.out.println("11.. Listar Secretarias");
            System.out.println("12.. Listar Pontos");
            System.out.println("13. Sair");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(leitor.nextLine());
            switch (opc) {
                case 1:
                    gp.cadGerente();
                    break;
                case 2:
                    gp.cadOperador();
                    break;
                case 3:
                    gp.cadSecretaria();
                    break;
                case 4:
                    gp.remGerente();
                    break;
                case 5:
                    gp.remOperador();
                    break;
                case 6:
                    gp.remSecretaria();
                    break;
                case 7:
                    gp.regEntrada();
                    break;
                case 8:
                    gp.regSaida();
                    break;
                case 9:
                    gp.listarGerentes();
                    break;
                case 10:
                    gp.listarOperadores();
                    break;
                case 11:
                    gp.listarSecretarias();
                    break;
                case 12:
                    gp.listarPontos();
                    break;
                case 13:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (opc != 13);
    }
    public List<Gerente> gerentes = new ArrayList<>();
    public List<Secretaria> secretarias = new ArrayList<>();
    public List<Operador> operadores = new ArrayList<>();
    public List<RegistroPonto> pontos = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public void cadGerente() {

        Gerente gerente = new Gerente();
        System.out.print("Id: ");
        gerente.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.print("Nome: ");
        gerente.setNome(sc.nextLine());
        System.out.print("E-mail: ");
        gerente.setEmail(sc.nextLine());
        System.out.print("Documento: ");
        gerente.setDocumento(sc.nextLine());
        System.out.print("Login: ");
        gerente.setLogin(sc.nextLine());
        System.out.print("Senha: ");
        gerente.setSenha(sc.nextLine());

        gerentes.add(gerente);

    }

    public void cadOperador() {

        Operador operador = new Operador();
        System.out.print("Id: ");
        operador.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.print("Nome: ");
        operador.setNome(sc.nextLine());
        System.out.print("E-mail: ");
        operador.setEmail(sc.nextLine());
        System.out.print("Documento: ");
        operador.setDocumento(sc.nextLine());
        System.out.print("Valor Hora: ");
        operador.setValorHora(Double.parseDouble(sc.nextLine()));

        operadores.add(operador);

    }

    public void cadSecretaria() {

        Secretaria secretaria = new Secretaria();
        System.out.print("Id: ");
        secretaria.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.print("Nome: ");
        secretaria.setNome(sc.nextLine());
        System.out.print("E-mail: ");
        secretaria.setEmail(sc.nextLine());
        System.out.print("Documento: ");
        secretaria.setDocumento(sc.nextLine());
        System.out.println("Telefone: ");
        secretaria.setTelefone(sc.nextLine());
        System.out.println("Ramal: ");
        secretaria.setRamal(sc.nextLine());

        secretarias.add(secretaria);

    }

    public void remGerente() {
        int id;
        System.out.print("ID a ser Removido: ");
        id = Integer.parseInt(sc.nextLine());
        for (Gerente g : gerentes) {
            if (g.getIdFunc() == id) {
                gerentes.remove(g);
                break;
            }

        }

    }

    public void remOperador() {
        int id;
        System.out.println("ID a ser Removido: ");
        id = Integer.parseInt(sc.nextLine());
        for (Operador o : operadores) {
            if (o.getIdFunc() == id) {
                operadores.remove(o);
                break;
            }
        }

    }

    public void remSecretaria() {
        int id;
        System.out.println("ID a ser Removido: ");
        id = Integer.parseInt(sc.nextLine());
        for (Secretaria s : secretarias) {
            if (s.getIdFunc() == id) {
                secretarias.remove(s);
                break;
            }
        }

    }

    public void regEntrada() {
        int opc = 0;
        String nome;
        RegistroPonto ponto = new RegistroPonto();
        System.out.print("ID Ponto: ");
        ponto.setIdRegPonto(Long.parseLong(sc.nextLine()));
        System.out.println("Funcionario");
        System.out.println("1.Gerente");
        System.out.println("2.Operador");
        System.out.println("3.Secretaria");
        System.out.println("Opção: ");
        opc = Integer.parseInt(sc.nextLine());
        System.out.println("Nome funcionario: ");
        nome = sc.nextLine();
        switch (opc) {
            case 1:
                ponto.setFunc("Gerente");
                ponto.setNome(nome);
                break;
            case 2:
                ponto.setFunc("Operador");
                ponto.setNome(nome);
                break;
            case 3:
                ponto.setFunc("Secretaria");
                ponto.setNome(nome);
                break;
        }
        LocalDate dataRegistro = LocalDate.now();
        ponto.setDataRegistro(dataRegistro);
        LocalDateTime dataEntrada = LocalDateTime.now();
        ponto.setHoraEntrada(dataEntrada);

        pontos.add(ponto);

    }

    public void regSaida() {

        RegistroPonto ponto = new RegistroPonto();
        System.out.print("ID Ponto: ");
        long id = Long.parseLong(sc.nextLine());
        for (RegistroPonto p : pontos) {
            if (p.getIdRegPonto() == id){
                LocalDateTime dataSaida = LocalDateTime.now();
                p.setHoraSaida(dataSaida);
                break;
            }

        }

    }

    public void listarGerentes() {
        for (Gerente lg : gerentes) {
            System.out.println("Id: " + lg.getIdFunc());
            System.out.println("Nome: " + lg.getNome());
            System.out.println("Email: " + lg.getEmail());
            System.out.println("Documento: " + lg.getDocumento());
            System.out.println("Login: " + lg.getLogin());
            System.out.println("Senha: " + lg.getSenha());
            System.out.println("------------------------");
        }
    }

    public void listarOperadores() {
        for (Operador lo : operadores) {
            System.out.println("Id: " + lo.getIdFunc());
            System.out.println("Nome: " + lo.getNome());
            System.out.println("Email: " + lo.getEmail());
            System.out.println("Documento: " + lo.getDocumento());
            System.out.println("Valor Hora: " + lo.getValorHora());
            System.out.println("------------------------");
        }
    }

    public void listarSecretarias() {
        for (Secretaria ls : secretarias) {
            System.out.println("Id: " + ls.getIdFunc());
            System.out.println("Nome: " + ls.getNome());
            System.out.println("Email: " + ls.getEmail());
            System.out.println("Documento: " + ls.getDocumento());
            System.out.println("Telefone: " + ls.getTelefone());
            System.out.println("Ramal: " + ls.getRamal());
            System.out.println("------------------------");
        }
    }

    public void listarPontos() {
        for (RegistroPonto rp : pontos) {

            System.out.println("Funcionario: " + rp.getFunc() + " " + rp.getNome());
            System.out.println("Data Registro: " + rp.getDataRegistro());
            System.out.println("Horario Entrada: " + rp.getHoraEntrada());
            System.out.println("Horario Saida: " + rp.getHoraSaida());
            System.out.println("------------------------");
        }
    }

}
