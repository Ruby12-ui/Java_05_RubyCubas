package vallegrande.edu.pe.poo_05_cubasruby.controller;

import vallegrande.edu.pe.poo_05_cubasruby.view.view;
import vallegrande.edu.pe.poo_05_cubasruby.model.model;

public class controller {

    view vista;
    model modelo;

    double num1;
    double num2;
    String operacion;

    public controller(view vista, model modelo){

        this.vista = vista;
        this.modelo = modelo;

        for(int i=0;i<10;i++){
            int numero = i;
            vista.numeros[i].addActionListener(e -> {
                vista.pantalla.setText(vista.pantalla.getText() + numero);
            });
        }

        vista.suma.addActionListener(e -> operar("+"));
        vista.resta.addActionListener(e -> operar("-"));
        vista.multi.addActionListener(e -> operar("*"));
        vista.div.addActionListener(e -> operar("/"));

        vista.igual.addActionListener(e -> calcular());

        vista.limpiar.addActionListener(e -> vista.pantalla.setText(""));
    }

    public void operar(String op){
        num1 = Double.parseDouble(vista.pantalla.getText());
        operacion = op;
        vista.pantalla.setText("");
    }

    public void calcular(){

        num2 = Double.parseDouble(vista.pantalla.getText());

        double resultado = 0;

        switch(operacion){

            case "+":
                resultado = modelo.sumar(num1,num2);
                break;

            case "-":
                resultado = modelo.restar(num1,num2);
                break;

            case "*":
                resultado = modelo.multiplicar(num1,num2);
                break;

            case "/":
                resultado = modelo.dividir(num1,num2);
                break;
        }

        vista.pantalla.setText(String.valueOf(resultado));
    }
}