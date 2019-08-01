package com.example.akash.puzzlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level_1 extends AppCompatActivity {


    boolean Win = false;
    int score = 0;
  //  int count1=1, count2=2, count3=3, count4=4, count5=5, count6=6, count7=7, count8=0, count9=8;
     int count1=0, count2=6, count3=5, count4=8, count5=7, count6=2, count7=3, count8=4, count9=1;
    int image_lc[] = {R.drawable.lc0, R.drawable.lc1, R.drawable.lc2, R.drawable.lc3, R.drawable.lc4, R.drawable.lc5, R.drawable.lc6, R.drawable.lc7, R.drawable.lc8, R.drawable.lc0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1);

        setImage(1, count1);
        setImage(2, count2);
        setImage(3, count3);
        setImage(6, count6);
        setImage(9, count9);
        setImage(8, count8);
        setImage(7, count7);
        setImage(4, count4);
        setImage(5, count5);
    }

    public void option1(View v) {
        if (!Win) {
            if (count1 != 0) {
                if (count2 == 0) {
                    setTextScore();
                    count2 = count1;
                    count1 = 0;
                    setImage(1, count1);
                    setImage(2, count2);
                    win();
                } else if (count4 == 0) {
                    setTextScore();
                    count4 = count1;
                    count1 = 0;
                    setImage(1, count1);
                    setImage(4, count4);
                    win();
                }
            }
        }
    }
    public void option2(View v) {
        if(!Win) {
            if (count2 != 0) {
                if (count1 == 0) {
                    setTextScore();
                    count1 = count2;
                    count2 = 0;
                    setImage(2, count2);
                    setImage(1, count1);
                    win();
                } else if (count3 == 0) {
                    setTextScore();
                    count3 = count2;
                    count2 = 0;
                    setImage(2, count2);
                    setImage(3, count3);
                    win();
                } else if (count5 == 0) {
                    setTextScore();
                    count5 = count2;
                    count2 = 0;
                    setImage(2, count2);
                    setImage(5, count5);
                    win();
                }
            }
        }
    }
    public void option3(View v) {
        if(!Win) {
            if(count3 != 0) {
                if (count2 == 0) {
                    setTextScore();
                    count2 = count3;
                    count3 = 0;
                    setImage(2, count2);
                    setImage(3, count3);
                    win();
                } else if (count6 == 0) {
                    setTextScore();
                    count6 = count3;
                    count3 = 0;
                    setImage(3, count3);
                    setImage(6, count6);
                    win();
                }
            }
        }
    }
    public void option4(View v) {
        if(!Win) {
            if(count4 != 0) {
                if (count1 == 0) {
                    setTextScore();
                    count1 = count4;
                    count4 = 0;
                    setImage(4, count4);
                    setImage(1, count1);
                    win();
                } else if (count7 == 0) {
                    setTextScore();
                    count7 = count4;
                    count4 = 0;
                    setImage(4, count4);
                    setImage(7, count7);
                    win();
                } else if (count5 == 0) {
                    setTextScore();
                    count5 = count4;
                    count4 = 0;
                    setImage(4, count4);
                    setImage(5, count5);
                    win();
                }
            }
        }
    }
    public void option5(View v) {
        if(!Win) {
            if(count5 != 0) {
                if (count2 == 0) {
                    setTextScore();
                    count2 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(2, count2);
                    win();
                } else if (count4 == 0) {
                    setTextScore();
                    count4 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(4, count4);
                    win();
                } else if (count6 == 0) {
                    setTextScore();
                    count6 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(6, count6);
                    win();
                }  else if (count8 == 0) {
                    setTextScore();
                    count8 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(8, count8);
                    win();
                }
            }
        }
    }
    public void option6(View v) {
        if(!Win) {
            if(count6 != 0) {
                setTextScore();
                if (count5 == 0) {
                    count5 = count6;
                    count6 = 0;
                    setImage(5, count5);
                    setImage(6, count6);
                    win();
                } else if (count3 == 0) {
                    setTextScore();
                    count3 = count6;
                    count6 = 0;
                    setImage(3, count3);
                    setImage(6, count6);
                    win();
                } else if (count9 == 0) {
                    setTextScore();
                    count9 = count6;
                    count6 = 0;
                    setImage(9, count9);
                    setImage(6, count6);
                    win();
                }
            }
        }
    }
    public void option7(View v) {
        if(!Win) {
            if(count7 != 0) {
                if (count4 == 0) {
                    setTextScore();
                    count4 = count7;
                    count7 = 0;
                    setImage(7, count7);
                    setImage(4, count4);
                    win();
                } else if (count8 == 0) {
                    setTextScore();
                    count8 = count7;
                    count7 = 0;
                    setImage(7, count7);
                    setImage(8, count8);
                    win();
                }
            }
        }
    }
    public void option8(View v) {
        if(!Win) {
            if(count8 != 0) {
                if (count7 == 0) {
                    setTextScore();
                    count7 = count8;
                    count8 = 0;
                    setImage(8, count8);
                    setImage(7, count7);
                    win();
                } else if (count9 == 0) {
                    setTextScore();
                    count9 = count8;
                    count8 = 0;
                    setImage(8, count8);
                    setImage(9, count9);
                    win();
                } else if (count5 == 0) {
                    setTextScore();
                    count5 = count8;
                    count8 = 0;
                    setImage(8, count8);
                    setImage(5, count5);
                    win();
                }
            }
        }
    }
    public void option9(View v) {
        if(!Win) {
            if(count9 != 0) {
                if (count8 == 0) {
                    setTextScore();
                    count8 = count9;
                    count9 = 0;
                    setImage(8, count8);
                    setImage(9, count9);
                    win();
                } else if (count6 == 0) {
                    setTextScore();
                    count6 = count9;
                    count9 = 0;
                    setImage(6, count6);
                    setImage(9, count9);
                    win();
                }
            }
        }
    }


    public void setImage(int option, int count) {

        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        ImageView img3 = (ImageView) findViewById(R.id.image3);
        ImageView img4 = (ImageView) findViewById(R.id.image4);
        ImageView img5 = (ImageView) findViewById(R.id.image5);
        ImageView img6 = (ImageView) findViewById(R.id.image6);
        ImageView img7 = (ImageView) findViewById(R.id.image7);
        ImageView img8 = (ImageView) findViewById(R.id.image8);
        ImageView img9 = (ImageView) findViewById(R.id.image9);

        if (option==1)
            img1.setImageResource(image_lc[count]);
        else if(option==2)
            img2.setImageResource(image_lc[count]);
        else if (option==3)
            img3.setImageResource(image_lc[count]);
        else if (option==4)
            img4.setImageResource(image_lc[count]);
        else if (option==5)
            img5.setImageResource(image_lc[count]);
        else if (option==6)
            img6.setImageResource(image_lc[count]);
        else if (option==7)
            img7.setImageResource(image_lc[count]);
        else if (option==8)
            img8.setImageResource(image_lc[count]);
        else if (option==9)
            img9.setImageResource(image_lc[count]);
    }

    public void win() {
        if(count1 == 1 && count2 == 2 && count3 == 3 && count4 == 4 && count5 == 5 && count6 == 6 && count7 == 7 && count8 == 8 && count9 == 0){
            Win = true;
            Intent intent = new Intent(Level_1.this, YouWin.class);
            intent.putExtra("level", "আপনি একটি  লেভেল অতিক্রম করেছেন");
            intent.putExtra("Moves", ("এবং আপনি মোট " + score + " বার পাজল সরিয়েছেন"));
            intent.putExtra("lebel", "1");
            startActivity(intent);
        }
    }

    public void setTextScore() {
        TextView idScore = (TextView)findViewById(R.id.idScore);
        idScore.setText("Moves : " + (++score));
    }
}
