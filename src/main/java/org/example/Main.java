package org.example;

import MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(1l,"yesica","palacion", LocalDate.of(2001,9,17),"3117151235","yesicapalaciovasquez@gmail.com","medellin","1001234326","empacadora","2017,09,12",1000000d,"sura","108354782735","1","union libre");

        Area area1 = new Area();
        Area area2 = new Area(1l,"empaque","janet","prado centro",30,LocalDate.of(2024,10,2),"jornada completa","sacar la produccion","calle 59#27-4","generando empelo");

        Beneficiario beneficiario1 = new Beneficiario();
        Beneficiario beneficiario2 = new Beneficiario(1l,"santiago","orrego","3137835349",LocalDate.of(1998,11,7),"julian@gmail.com","calle59#21-7",1000000d,LocalDate.of(2018,11,18),"union libre");

        Sucursal sucursal1 = new Sucursal();
        Sucursal sucursal2 = new Sucursal(1l,"panificadora","cll58#21-88","424215314151","panaderia@gmail.com",LocalDate.of(2001,9,17),30,"abierto","de 6 am a 6pm","liliana");

        Nomina nomina1 = new Nomina();
        Nomina nomina2 = new Nomina(1l,"pepito",LocalDate.of(2024,9,30),"cedula",12,"minimo","veinte","transferencia","produccion","dulceria");








    }
}