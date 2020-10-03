package com.company;

public class FloodFill {

    static int M = 8;
    static int N = 8;

    static void floodFill(int screen[][], int x, int y, int prevC, int newC) {
        if (x < 0 || x >= M || y < 0 || y>= N ) {
            return;
        }
        if (screen[x][y] != prevC) {
            return;
        }
        screen[x][y] = newC;

        floodFill(screen, x-1, y, prevC, newC );
        floodFill(screen, x+1, y, prevC, newC);
        floodFill(screen, x, y-1, prevC, newC);
        floodFill(screen, x, y+1, prevC, newC);

    }

    public static void main(String []args) {
        int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };

        int x=4, y=4, newC =3;
        int prevC = screen[x][y];

        floodFill(screen, x, y, prevC, newC);
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
    }
}

