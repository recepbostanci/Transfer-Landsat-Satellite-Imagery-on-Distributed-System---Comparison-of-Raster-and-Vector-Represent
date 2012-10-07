/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jhlabs.image;
import java.io.IOException;
import java.util.Vector;
import java.awt.*;
/**
 *
 * @author Administrator
 */
public class Convex_Hull {
    // To keep the set of points
    Vector vecN = new Vector();
    // To keep the set of points that are on Convex
    Vector vecHull = new Vector();
    // Used for keeping the edge that leads having minimum area of rectangle

    Vector vecRect = new Vector();

    private int node_1, node_2;
    private int rightMax, leftMax, height;

    public void cleear(){
        vecRect.clear();
        vecHull.clear();
        vecN.clear();
    }

    public void setLeft(int n) {
        leftMax = n;
    }

    public void setRight(int n) {
        rightMax = n;
    }

    public void setHigh(int n) {
        height = n;
    }

    public int [][] getConvexPolygonInt() throws IOException {

        int [][] polygon = new int[2][vecHull.size()+1];

        Point pt = new Point();
        int temp;

        for (int h = 0; h < vecHull.size(); h++) {
            pt = (Point)vecHull.get(h);
            temp = (int)pt.getX();
            polygon[0][h] = temp;
        }

        pt = (Point)vecHull.get(0);
        temp = (int)pt.getX();
        polygon[0][vecHull.size()] = temp;

        for (int k = 0; k < vecHull.size(); k++) {
            pt = (Point)vecHull.get(k);
            temp = (int)pt.getY();
            polygon[1][k] = temp;
        }

        pt = (Point)vecHull.get(0);
        temp = (int)pt.getY();
        polygon[1][vecHull.size()] =  temp;

        return polygon;

    }

    public float [][] getConvexPolygonFloat() throws IOException {

        float [][] polygon = new float[2][vecHull.size()+1];

        Point pt = new Point();
        int temp;

        for (int h = 0; h < vecHull.size(); h++) {
            pt = (Point)vecHull.get(h);
            temp = (int)pt.getX();
            polygon[0][h] = temp;
        }

        pt = (Point)vecHull.get(0);
        temp = (int)pt.getX();
        polygon[0][vecHull.size()] = temp;

        for (int k = 0; k < vecHull.size(); k++) {
            pt = (Point)vecHull.get(k);
            temp = (int)pt.getY();
            polygon[1][k] = temp;
        }

        pt = (Point)vecHull.get(0);
        temp = (int)pt.getY();
        polygon[1][vecHull.size()] =  temp;

        return polygon;

    }


    // Algorithm of Gift Wrapping
    void wrap() {
        //  Index numbers of vecN
        int i, min, M;
        double th, v, temp, distance, disTemp;
        min = 0;
        // Number of points
        int N = vecN.size();
        // Finding the lowest right points
        for (i = 1; i < N; i++) {
            if (((Point)vecN.get(i)).getY() < ((Point)vecN.get(min)).getY()) {
                min = i;
            } else if (((Point)vecN.get(i)).getY()==((Point)vecN.get(min)).getY()) {
                if (((Point)vecN.get(i)).getX() > ((Point)vecN.get(min)).getX()) {
                    min = i;
                }
            }
        }

        Point first = new Point();
        first.x= ((Point)vecN.get(min)).x;
        first.y= ((Point)vecN.get(min)).y;
        Point firsts = new Point();
        firsts.x= ((Point)vecN.get(min)).x;
        firsts.y= ((Point)vecN.get(min)).y;
        // Add the starting points to vecN, so later when we find this point
        // again, the algorithm could terminate
        vecN.addElement(first);
        // Add it to vecHul, to have a list of points on Convex Hull
        vecHull.addElement(firsts);
        th = 0.0;

        // To keep track the number of points so far on the hull
        for (M = 0; M < N; M++) {
            // Swap the current points (M) with the latest point (min) on Convex
            // Hull, so we don't need to check points that already in list of
            // Convex Hull, except the starting point.
            swap((Point)vecN.get(M), (Point)vecN.get(min));
            min = N;
            v = th;
            th = 360.0;
            distance = 0.0;
            // For each points that are still not on Convex Hull
            for (i = M+1; i <= N; i++) {
                // Returning the angle between p1, p2, and the horizontal.
                temp = theta((Point)vecN.get(M), (Point)vecN.get(i));
                // Find the smallest angle, and also consider the longest length
                // just in case two points have same angle, but different length
                if (temp > v) {
                    if (temp == th){
                        disTemp = findD((Point)vecN.get(M),(Point)vecN.get(i));
                        if (disTemp > distance) {
                            distance = disTemp;
                            th = temp;
                            min = i;
                        }
                    } else if (temp < th) {
                        min = i;
                        th = temp;
                        distance = findD((Point)vecN.get(M),(Point)vecN.get(i));
                    }
                }
            }
            // Checking whether we find out the starting point, so we know when
            // to stop
            if (equal(first,(Point)vecN.get(min)) == false) {
                Point second = new Point();
                second.x= ((Point)vecN.get(min)).x;
                second.y= ((Point)vecN.get(min)).y;
                vecHull.addElement(second);
            } else {
                return;
            }
        }
    }

    // Finding the distance between two points
    public double findD(Point p1, Point p2) {
        double dx, dy, t;
        dx = Math.pow((p2.getX() - p1.getX()),2);
        dy = Math.pow((p2.getY() - p1.getY()),2);
        return Math.sqrt((double)dx+dy);
    }

    // Finding whether two nodes are equal or not
    public boolean equal(Point first, Point second) {
        if (first.getY() == second.getY()) {
            if (first.getX() == second.getX()) {
                return true;
            }
        }
        return false;
    }

    // Compute the angle from the horizontal made by the line between two points.
    public double theta (Point p1, Point p2) {
        double dx, dy, ax, ay, t;
        dx = p2.getX() - p1.getX();
        ax = Math.abs(dx);
        dy = p2.getY() - p1.getY();
        ay = Math.abs(dy);
        t = (ax+ay == 0) ? 0 : (double) dy/(ax+ay);
        if (dx < 0) {
            t = 2-t;
        } else if (dy < 0) {
            t = 4 + t;
        }
        return t*90.0;
    }

    // To swap between two points
    void swap(Point node_M, Point node_min) {
        Point temp = new Point();
        temp.x= node_M.x;
        temp.y= node_M.y;
        node_M.x=node_min.x;node_M.y= node_min.y;
        node_min.x=temp.x; node_min.y= temp.y;
    }

}
