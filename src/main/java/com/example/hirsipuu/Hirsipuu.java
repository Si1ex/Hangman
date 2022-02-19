package com.example.hirsipuu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Hirsipuu extends Application {
    @Override
    public void start(Stage stage) {

        Circle paa = new Circle();      //Pää
        paa.setCenterX(150);
        paa.setCenterY(100);
        paa.setRadius(30);
        paa.setStroke(Color.RED);
        paa.setFill(Color.RED);

        Pane pane = new Pane();
        pane.getChildren().addAll(paa);

        Line vartalo = new Line();      //Vartalo
        vartalo.setStartX(paa.getCenterX());
        vartalo.setStartY(paa.getCenterY() + paa.getRadius());
        vartalo.setEndX(paa.getCenterX());
        vartalo.setEndY(paa.getCenterY() + paa.getRadius() + 100);
        vartalo.setStroke(Color.RED);
        pane.getChildren().addAll(vartalo);

        Line kasiv = new Line();    //Vasen käsi
        kasiv.setStartX(vartalo.getStartX());
        kasiv.setStartY(vartalo.getStartY()+20);
        kasiv.setEndX(120);
        kasiv.setEndY(200);
        kasiv.setRotate(0);
        kasiv.setStroke(Color.RED);
        pane.getChildren().addAll(kasiv);

        Line kasio = new Line();    //Oikea käsi
        kasio.setStartX(vartalo.getStartX());
        kasio.setStartY(vartalo.getStartY()+20);
        kasio.setEndX(180);
        kasio.setEndY(200);
        kasio.setRotate(0);
        kasio.setStroke(Color.RED);
        pane.getChildren().addAll(kasio);

        Line jalkav = new Line();   //Vasen jalka
        jalkav.setStartX(vartalo.getEndX());
        jalkav.setStartY(vartalo.getEndY());
        jalkav.setEndX(110);
        jalkav.setEndY(300);
        jalkav.setRotate(0);
        jalkav.setStroke(Color.RED);
        pane.getChildren().addAll(jalkav);

        Line jalkao = new Line();   //Oikea jlka
        jalkao.setStartX(vartalo.getEndX());
        jalkao.setStartY(vartalo.getEndY());
        jalkao.setEndX(190);
        jalkao.setEndY(300);
        jalkao.setRotate(0);
        jalkao.setStroke(Color.RED);
        pane.getChildren().addAll(jalkao);

        Line ylos = new Line();     //Viiva päästä ylöspäin
        ylos.setStartX(paa.getCenterX());
        ylos.setStartY(paa.getCenterY() - paa.getRadius());
        ylos.setEndX(paa.getCenterX());
        ylos.setEndY(paa.getCenterY() - paa.getRadius() - 30);
        ylos.setStroke(Color.BLACK);
        pane.getChildren().addAll(ylos);

        Line vasen = new Line();    //Hirsipuun vaaka osa
        vasen.setStartX(ylos.getEndX());
        vasen.setStartY(ylos.getEndY());
        vasen.setEndX(40);
        vasen.setEndY(40);
        vasen.setStroke(Color.BLACK);
        pane.getChildren().addAll(vasen);

        Line hirsi = new Line(); //Hirsipuun pysty osa
        hirsi.setStartX(vasen.getEndX());
        hirsi.setStartY(vasen.getEndY());
        hirsi.setEndX(40);
        hirsi.setEndY(330);
        hirsi.setStroke(Color.BLACK);
        pane.getChildren().addAll(hirsi);

        Ellipse ellipsi = new Ellipse(40, 400, 200, 70);    //Keltainen ellipsi = maa
        ellipsi.setStroke(Color.BLACK);
        ellipsi.setFill(Color.YELLOW);
        pane.getChildren().addAll(ellipsi);

        Scene pohja = new Scene(pane, 500, 500);
        stage.setTitle("Hirsipuu");
        stage.setScene(pohja);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}