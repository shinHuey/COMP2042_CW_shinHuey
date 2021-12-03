package test;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

/**
 * Created by filippo on 04/09/16.
 * Modified by Lim SHin Huey on 10/12/21.
 *
 * @author filippo
 * @author Lim Shin Huey
 * @version 1.2
 */

abstract public class Ball {

    private Shape ballFace;

    private Point2D center;

    Point2D up;
    Point2D down;
    Point2D left;
    Point2D right;

    private Color border;
    private Color inner;

    private int speedX;
    private int speedY;

    /**
     * Implementation of a 2D Ball moving in square with coordinates.
     * @param center - center
     * @param radiusA - radiusA
     * @param radiusB - radiusB
     * @param inner - inner
     * @param border - border
     */
    public Ball(Point2D center,int radiusA,int radiusB,Color inner,Color border){
        this.center = center;

        up = new Point2D.Double();
        down = new Point2D.Double();
        left = new Point2D.Double();
        right = new Point2D.Double();

        /* Refactor introduce variable */
        double centregetY = center.getY();
        double upY = centregetY - (radiusB / 2);
        double downY = centregetY + (radiusB / 2);
        double centre = center.getX();
        double leftX = centre - (radiusA / 2);
        double rightX = centre + (radiusA / 2);

        setDirection(upY, centre, up);
        setDirection(downY, centre, down);
        setDirection(centregetY, leftX, left);
        setDirection(centregetY, rightX, right);


        ballFace = makeBall(center,radiusA,radiusB);
        this.border = border;
        this.inner  = inner;
        speedX = 0;
        speedY = 0;
    }

    /* Refactor extract method */
    /**
     * This method used to set the direction.
     * @param y - y
     * @param x - x
     * @param direction - direction
     */
    public static void setDirection(double y, double x, Point2D direction) {
        direction.setLocation(x, y);
    }


    protected abstract Shape makeBall(Point2D center,int radiusA,int radiusB);

    public void move(){
        RectangularShape tmp = (RectangularShape) ballFace;
        setDirection(center.getY() + speedY, center.getX() + speedX, center);
        double w = tmp.getWidth();
        double h = tmp.getHeight();

        tmp.setFrame((center.getX() -(w / 2)),(center.getY() - (h / 2)),w,h);
        setPoints(w,h);


        ballFace = tmp;
    }

    public void setSpeed(int x,int y){
        speedX = x;
        speedY = y;
    }

    public void setXSpeed(int s){
        speedX = s;
    }

    public void setYSpeed(int s){
        speedY = s;
    }

    public void reverseX(){
        speedX *= -1;
    }

    public void reverseY(){
        speedY *= -1;
    }

    public Color getBorderColor(){
        return border;
    }

    public Color getInnerColor(){
        return inner;
    }

    public Point2D getPosition(){
        return center;
    }

    public Shape getBallFace(){
        return ballFace;
    }

    public void moveTo(Point p){
        center.setLocation(p);

        RectangularShape tmp = (RectangularShape) ballFace;
        double w = tmp.getWidth();
        double h = tmp.getHeight();

        tmp.setFrame((center.getX() -(w / 2)),(center.getY() - (h / 2)),w,h);
        ballFace = tmp;
    }

    private void setPoints(double width,double height){
        setDirection(center.getY()-(height / 2), center.getX(), up);
        setDirection(center.getY()+(height / 2), center.getX(), down);

        setDirection(center.getY(), center.getX()-(width / 2), left);
        setDirection(center.getY(), center.getX()+(width / 2), right);
    }

    public int getSpeedX(){
        return speedX;
    }

    public int getSpeedY(){
        return speedY;
    }


}
