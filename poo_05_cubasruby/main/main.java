package vallegrande.edu.pe.poo_05_cubasruby.main;

import vallegrande.edu.pe.poo_05_cubasruby.view.view;
import vallegrande.edu.pe.poo_05_cubasruby.model.model;
import vallegrande.edu.pe.poo_05_cubasruby.controller.controller;

public class main {

    public static void main(String[] args) {

        view vista = new view();
        model modelo = new model();

        new controller(vista, modelo);
    }
}