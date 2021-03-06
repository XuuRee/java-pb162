/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb162.project.geometry;

/**
 * Use extends Circle?
 * 
 * @author xvalchar
 */
public class OlympicRings extends Circle {

    private final Circle blackCircle;
    private final Circle blueCircle;
    private final Circle redCircle;
    private final Circle yellowCircle;
    private final Circle greenCircle;
   
    public OlympicRings(Vertex2D center, double radius) {
        blackCircle = new Circle(center, radius);
        redCircle = new Circle(new Vertex2D(center.getX() + 2 * radius + 10, center.getY()), radius);
        blueCircle = new Circle(new Vertex2D(center.getX() - 2 * radius - 10, center.getY()), radius);
        greenCircle = new Circle(new Vertex2D(center.getX() + radius + 5, center.getY() - radius), radius);
        yellowCircle = new Circle(new Vertex2D(center.getX() - radius - 5, center.getY() - radius), radius);
        blueCircle.setColor("blue");
        redCircle.setColor("red");
        yellowCircle.setColor("yellow");
        greenCircle.setColor("green");
    }
       
    public Circle getBlackRing() {
        return blackCircle;
    }
    
    public Circle getBlueRing() {
        return blueCircle;
    }
    
    public Circle getRedRing() {
        return redCircle;
    }
    
    public Circle getYellowRing() {
        return yellowCircle;
    }
    
    public Circle getGreenRing() {
        return greenCircle;
    }
}
