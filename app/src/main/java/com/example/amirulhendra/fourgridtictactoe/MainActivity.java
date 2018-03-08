package com.example.amirulhendra.fourgridtictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);

        turn = 1;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b1.setText("X");
                        } else if (turn == 2 ) {
                            turn = 1;
                            b1.setText("O");
                        }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b10.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b10.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b10.setText("O");
                    }
                }
                endGame();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b11.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b11.setText("O");
                    }
                }
                endGame();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b12.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b12.setText("O");
                    }
                }
                endGame();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b13.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b13.setText("O");
                    }
                }
                endGame();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b14.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b14.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b14.setText("O");
                    }
                }
                endGame();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b15.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b15.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b15.setText("O");
                    }
                }
                endGame();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b16.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b16.setText("X");
                    } else if (turn == 2 ) {
                        turn = 1;
                        b16.setText("O");
                    }
                }
                endGame();
            }
        });


    }

    public void endGame() {
        String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();

        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();

        i = b9.getText().toString();
        j = b10.getText().toString();
        k = b11.getText().toString();
        l = b12.getText().toString();

        m = b13.getText().toString();
        n = b14.getText().toString();
        o = b15.getText().toString();
        p = b16.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X") && d.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(a.equals("X") && f.equals("X") && k.equals("X") && p.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(a.equals("X") && e.equals("X") && i.equals("X") && m.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(b.equals("X") && f.equals("X") && j.equals("X") && n.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(c.equals("X") && g.equals("X") && k.equals("X") && o.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(d.equals("X") && h.equals("X") && l.equals("X") && p.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(e.equals("X") && f.equals("X") && g.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(i.equals("X") && j.equals("X") && k.equals("X") && l.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(m.equals("X") && n.equals("X") && o.equals("X") && p.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(m.equals("X") && j.equals("X") && g.equals("X") && d.equals("X")){
            Toast.makeText(MainActivity.this, "Player 1 (X) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }




        if(a.equals("O") && b.equals("O") && c.equals("O") && d.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(a.equals("O") && f.equals("O") && k.equals("O") && p.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(a.equals("O") && e.equals("O") && i.equals("O") && m.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(b.equals("O") && f.equals("O") && j.equals("O") && n.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(c.equals("O") && g.equals("O") && k.equals("O") && o.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(d.equals("O") && h.equals("O") && l.equals("O") && p.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(e.equals("O") && f.equals("O") && g.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(i.equals("O") && j.equals("O") && k.equals("O") && l.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(m.equals("O") && n.equals("O") && o.equals("O") && p.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(m.equals("O") && j.equals("O") && g.equals("O") && d.equals("O")){
            Toast.makeText(MainActivity.this, "Player 2 (O) wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
        }



    }


}
