package calculator;

import javax.swing.*;

public class Controller {
    int add(int a, int b) {
        int summa = a + b;
        return summa;
    }

    int difference(int w, int e) {
        return w - e;
    }

    int composition(int h, int m) {
        return h * m;
    }

    double div(int o, int p) {
        if (p != 0) {
            return (double) o / p;
        } else {
            return 0;
        }
    }
}
