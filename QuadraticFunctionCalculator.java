package com.mycompany.quadraticfunctioncalculator;

import javax.swing.*;

public class QuadraticFunctionCalculator {

    public static void main(String[] args) {

        String input;
        double a, b, c, discriminant, root1, root2, vertex, sumOfRoots, productOfRoots;

        JOptionPane.showMessageDialog(null, "Welcome to this quadratic calculator!");

        do {
            input = JOptionPane.showInputDialog("Enter the coefficient of x^2 (The \"a\" in ax^2)");
            a = Integer.parseInt(input);
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "This is not a quadratic function, enter a non-zero number");
            }
        } while (a == 0);

        input = JOptionPane.showInputDialog("Enter the coefficient of x (The \"b\" in bx)");
        b = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter c");
        c = Integer.parseInt(input);

        discriminant = Math.pow(b, 2) - 4 * a * c;

        root1 = (-b + Math.sqrt(discriminant)) / 2 * a;

        if (discriminant > 0) {
            root2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            JOptionPane.showMessageDialog(null, "There are two distinct roots, " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            JOptionPane.showMessageDialog(null, " There is only one root which is repeated twice, " + root1);
        } else {
            JOptionPane.showMessageDialog(null, "There are no real roots");
        }

        JOptionPane.showMessageDialog(null, "The y-intercept is " + c);

        vertex = -b / (2 * a);
        JOptionPane.showMessageDialog(null, "The vertex of this quadratic function is " + vertex);

        sumOfRoots = -b / a;
        JOptionPane.showMessageDialog(null, "The sum of all roots is " + sumOfRoots);
        
        productOfRoots = c / a;
        JOptionPane.showMessageDialog(null, "The product of all roots is " + productOfRoots);
        
        JOptionPane.showMessageDialog(null, "Thank you for using this program");
    }
}
