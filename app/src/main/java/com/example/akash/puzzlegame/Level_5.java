package com.example.akash.puzzlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Level_5 extends AppCompatActivity {


    boolean Win = false;
  //  int count1=1, count2=2, count3=3, count4=4, count5=5, count6=6, count7=7, count8=8, count9=9, count10=10, count11=11, count12=12, count13=13, count14=14, count15=15, count16=16, count17=17, count18=18, count19=19, count20=20, count21=21, count22=22, count23=0, count24=23;
    int count1=12, count2=6, count3=10, count4=8, count5=7, count6=9, count7=3, count8=4, count9=1, count10=5, count11=11, count12=2, count13=21, count14=13, count15=14, count16=19, count17=18, count18=16, count19=17, count20=15, count21=0, count22=23, count23=20, count24=22;
    int image_lc[] = {R.drawable.lc0, R.drawable.lc1, R.drawable.lc2, R.drawable.lc3, R.drawable.lc4, R.drawable.lc5, R.drawable.lc6, R.drawable.lc7, R.drawable.lc8, R.drawable.lc9, R.drawable.lc10, R.drawable.lc11, R.drawable.lc12, R.drawable.lc13, R.drawable.lc14, R.drawable.lc15, R.drawable.lc16, R.drawable.lc17, R.drawable.lc18, R.drawable.lc19, R.drawable.lc20, R.drawable.lc21, R.drawable.lc22, R.drawable.lc23, R.drawable.lc0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_5);

        setImage(1, count1);
        setImage(2, count2);
        setImage(3, count3);
        setImage(4, count4);
        setImage(5, count5);
        setImage(6, count6);
        setImage(7, count7);
        setImage(8, count8);
        setImage(9, count9);
        setImage(10, count10);
        setImage(11, count11);
        setImage(12, count12);
        setImage(13, count13);
        setImage(14, count14);
        setImage(15, count15);
        setImage(16, count16);
        setImage(17, count17);
        setImage(18, count18);
        setImage(19, count19);
        setImage(20, count20);
        setImage(21, count21);
        setImage(22, count22);
        setImage(23, count23);
        setImage(24, count24);
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
                } else if (count5 == 0) {
                    setTextScore();
                    count5 = count1;
                    count1 = 0;
                    setImage(1, count1);
                    setImage(5, count5);
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
                }  else if (count6 == 0) {
                    setTextScore();
                    count6 = count2;
                    count2 = 0;
                    setImage(2, count2);
                    setImage(6, count6);
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
                } else if (count4 == 0) {
                    setTextScore();
                    count4 = count3;
                    count3 = 0;
                    setImage(3, count3);
                    setImage(4, count4);
                    win();
                } else if (count7 == 0) {
                    setTextScore();
                    count7 = count3;
                    count3 = 0;
                    setImage(3, count3);
                    setImage(7, count7);
                    win();
                }
            }
        }
    }
    public void option4(View v) {
        if(!Win) {
            if(count4 != 0) {
                if (count3 == 0) {
                    setTextScore();
                    count3 = count4;
                    count4 = 0;
                    setImage(4, count4);
                    setImage(3, count3);
                    win();
                } else if (count8 == 0) {
                    setTextScore();
                    count3 = count4;
                    count4 = 0;
                    setImage(4, count4);
                    setImage(3, count3);
                    win();
                }
            }
        }
    }
    public void option5(View v) {
        if(!Win) {
            if(count5 != 0) {
                if (count1 == 0) {
                    setTextScore();
                    count1 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(1, count1);
                    win();
                } else if (count9 == 0) {
                    setTextScore();
                    count9 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(9, count9);
                    win();
                } else if (count6 == 0) {
                    setTextScore();
                    count6 = count5;
                    count5 = 0;
                    setImage(5, count5);
                    setImage(6, count6);
                    win();
                }
            }
        }
    }
    public void option6(View v) {
        if(!Win) {
            if(count6 != 0) {
                if (count5 == 0) {
                    setTextScore();
                    count5 = count6;
                    count6 = 0;
                    setImage(5, count5);
                    setImage(6, count6);
                    win();
                } else if (count2 == 0) {
                    setTextScore();
                    count2 = count6;
                    count6 = 0;
                    setImage(2, count2);
                    setImage(6, count6);
                    win();
                } else if (count7 == 0) {
                    setTextScore();
                    count7 = count6;
                    count6 = 0;
                    setImage(7, count7);
                    setImage(6, count6);
                    win();
                } else if (count10 == 0) {
                    setTextScore();
                    count10 = count6;
                    count6 = 0;
                    setImage(10, count10);
                    setImage(6, count6);
                    win();
                }
            }
        }
    }
    public void option7(View v) {
        if(!Win) {
            if(count7 != 0) {
                if (count3 == 0) {
                    setTextScore();
                    count3 = count7;
                    count7 = 0;
                    setImage(7, count7);
                    setImage(3, count3);
                    win();
                } else if (count8 == 0) {
                    setTextScore();
                    count8 = count7;
                    count7 = 0;
                    setImage(7, count7);
                    setImage(8, count8);
                    win();
                } else if (count11 == 0) {
                    setTextScore();
                    count11 = count7;
                    count7 = 0;
                    setImage(7, count7);
                    setImage(11, count11);
                    win();
                } else if (count6 == 0) {
                    setTextScore();
                    count6 = count7;
                    count7 = 0;
                    setImage(7, count7);
                    setImage(6, count6);
                    win();
                }
            }
        }
    }
    public void option8(View v) {
        if(!Win) {
            if(count8 != 0) {
                if (count4 == 0) {
                    setTextScore();
                    count4 = count8;
                    count8 = 0;
                    setImage(8, count8);
                    setImage(4, count4);
                    win();
                } else if (count7 == 0) {
                    setTextScore();
                    count7 = count8;
                    count8 = 0;
                    setImage(8, count8);
                    setImage(7, count7);
                    win();
                } else if (count12 == 0) {
                    setTextScore();
                    count12 = count8;
                    count8 = 0;
                    setImage(8, count8);
                    setImage(12, count12);
                    win();
                }
            }
        }
    }
    public void option9(View v) {
        if(!Win) {
            if(count9 != 0) {
                if (count5 == 0) {
                    setTextScore();
                    count5 = count9;
                    count9 = 0;
                    setImage(5, count5);
                    setImage(9, count9);
                    win();
                } else if (count10 == 0) {
                    setTextScore();
                    count10 = count9;
                    count9 = 0;
                    setImage(9, count9);
                    setImage(10, count10);
                    win();
                } else if (count13 == 0) {
                    setTextScore();
                    count13 = count9;
                    count9 = 0;
                    setImage(13, count13);
                    setImage(9, count9);
                    win();
                }
            }
        }
    }
    public void option10(View v) {
        if(!Win) {
            if(count10 != 0) {
                if (count11 == 0) {
                    setTextScore();
                    count11 = count10;
                    count10 = 0;
                    setImage(11, count11);
                    setImage(10, count10);
                    win();
                } else if (count6 == 0) {
                    setTextScore();
                    count6 = count10;
                    count10 = 0;
                    setImage(6, count6);
                    setImage(10, count10);
                    win();
                } else if (count14 == 0) {
                    setTextScore();
                    count14 = count10;
                    count10 = 0;
                    setImage(14, count14);
                    setImage(10, count10);
                    win();
                } else if (count9 == 0) {
                    setTextScore();
                    count9 = count10;
                    count10 = 0;
                    setImage(9, count9);
                    setImage(10, count10);
                    win();
                }
            }
        }
    }
    public void option11(View v) {
        if(!Win) {
            if(count11 != 0) {
                if (count10 == 0) {
                    setTextScore();
                    count10 = count11;
                    count11 = 0;
                    setImage(10, count10);
                    setImage(11, count11);
                    win();
                } else if (count7 == 0) {
                    setTextScore();
                    count7 = count11;
                    count11 = 0;
                    setImage(7, count7);
                    setImage(11, count11);
                    win();
                }  else if (count12 == 0) {
                    setTextScore();
                    count12 = count11;
                    count11 = 0;
                    setImage(12, count12);
                    setImage(11, count11);
                    win();
                }  else if (count15 == 0) {
                    setTextScore();
                    count15 = count11;
                    count11 = 0;
                    setImage(15, count15);
                    setImage(11, count11);
                    win();
                }
            }
        }
    }
    public void option12(View v) {
        if(!Win) {
            if(count12 != 0) {
                if (count8 == 0) {
                    setTextScore();
                    count8 = count12;
                    count12 = 0;
                    setImage(8, count8);
                    setImage(12, count12);
                    win();
                } else if (count11 == 0) {
                    setTextScore();
                    count11 = count12;
                    count12 = 0;
                    setImage(11, count11);
                    setImage(12, count12);
                    win();
                } else if (count16 == 0) {
                    setTextScore();
                    count16 = count12;
                    count12 = 0;
                    setImage(16, count16);
                    setImage(12, count12);
                    win();
                }
            }
        }
    }
    public void option13(View v) {
        if(!Win) {
            if(count13 != 0) {
                if (count17 == 0) {
                    setTextScore();
                    count17 = count13;
                    count13 = 0;
                    setImage(17, count17);
                    setImage(13, count13);
                    win();
                } else if (count14 == 0) {
                    setTextScore();
                    count14 = count13;
                    count13 = 0;
                    setImage(14, count14);
                    setImage(13, count13);
                    win();
                } else if (count9 == 0) {
                    setTextScore();
                    count9 = count13;
                    count13 = 0;
                    setImage(9, count9);
                    setImage(13, count13);
                    win();
                }
            }
        }
    }
    public void option14(View v) {
        if(!Win) {
            if(count14 != 0) {
                if (count10 == 0) {
                    setTextScore();
                    count10 = count14;
                    count14 = 0;
                    setImage(10, count10);
                    setImage(14, count14);
                    win();
                } else if (count13 == 0) {
                    setTextScore();
                    count13 = count14;
                    count14 = 0;
                    setImage(13, count13);
                    setImage(14, count14);
                    win();
                } else if (count15 == 0) {
                    setTextScore();
                    count15 = count14;
                    count14 = 0;
                    setImage(15, count15);
                    setImage(14, count14);
                    win();
                } else if (count18 == 0) {
                    setTextScore();
                    count18 = count14;
                    count14 = 0;
                    setImage(18, count18);
                    setImage(14, count14);
                    win();
                }
            }
        }
    }
    public void option15(View v) {
        if(!Win) {
            if(count15 != 0) {
                if (count16 == 0) {
                    setTextScore();
                    count16 = count15;
                    count15 = 0;
                    setImage(16, count16);
                    setImage(15, count15);
                    win();
                } else if (count14 == 0) {
                    setTextScore();
                    count14 = count15;
                    count15 = 0;
                    setImage(14, count14);
                    setImage(15, count15);
                    win();
                } else if (count11 == 0) {
                    setTextScore();
                    count11 = count15;
                    count15 = 0;
                    setImage(11, count11);
                    setImage(15, count15);
                    win();
                } else if (count19 == 0) {
                    setTextScore();
                    count19 = count15;
                    count15 = 0;
                    setImage(19, count19);
                    setImage(15, count15);
                    win();
                }
            }
        }
    }
    public void option16(View v) {
        if (!Win) {
            if (count16 != 0) {
                if (count12 == 0) {
                    setTextScore();
                    count12 = count16;
                    count16 = 0;
                    setImage(16, count16);
                    setImage(12, count12);
                    win();
                } else if (count15 == 0) {
                    setTextScore();
                    count15 = count16;
                    count16 = 0;
                    setImage(16, count16);
                    setImage(15, count15);
                    win();
                } else if (count20 == 0) {
                    setTextScore();
                    count20 = count16;
                    count16 = 0;
                    setImage(16, count16);
                    setImage(20, count20);
                    win();
                }
            }
        }
    }
    public void option17(View v) {
        if (!Win) {
            if (count17 != 0) {
                if (count13 == 0) {
                    setTextScore();
                    count13 = count17;
                    count17 = 0;
                    setImage(13, count13);
                    setImage(17, count17);
                    win();
                } else if (count18 == 0) {
                    setTextScore();
                    count18 = count17;
                    count17 = 0;
                    setImage(18, count18);
                    setImage(17, count17);
                    win();
                } else if (count21 == 0) {
                    setTextScore();
                    count21 = count17;
                    count17 = 0;
                    setImage(21, count21);
                    setImage(17, count17);
                    win();
                }
            }
        }
    }
    public void option18(View v) {
        if(!Win) {
            if(count18 != 0) {
                if (count17 == 0) {
                    setTextScore();
                    count17 = count18;
                    count18 = 0;
                    setImage(17, count17);
                    setImage(18, count18);
                    win();
                } else if (count14 == 0) {
                    setTextScore();
                    count14 = count18;
                    count18 = 0;
                    setImage(14, count14);
                    setImage(18, count18);
                    win();
                } else if (count19 == 0) {
                    setTextScore();
                    count19 = count18;
                    count18 = 0;
                    setImage(19, count19);
                    setImage(18, count18);
                    win();
                } else if (count22 == 0) {
                    setTextScore();
                    count22 = count18;
                    count18 = 0;
                    setImage(22, count22);
                    setImage(18, count18);
                    win();
                }
            }
        }
    }
    public void option19(View v) {
        if(!Win) {
            if(count19 != 0) {
                if (count15 == 0) {
                    setTextScore();
                    count15 = count19;
                    count19 = 0;
                    setImage(15, count15);
                    setImage(19, count19);
                    win();
                } else if (count18 == 0) {
                    setTextScore();
                    count18 = count19;
                    count19 = 0;
                    setImage(18, count18);
                    setImage(19, count19);
                    win();
                } else if (count20 == 0) {
                    setTextScore();
                    count20 = count19;
                    count19 = 0;
                    setImage(20, count20);
                    setImage(19, count19);
                    win();
                } else if (count23 == 0) {
                    setTextScore();
                    count23 = count19;
                    count19 = 0;
                    setImage(23, count23);
                    setImage(19, count19);
                    win();
                }
            }
        }
    }
    public void option20(View v) {
        if(!Win) {
            if(count20 != 0) {
                if (count16 == 0) {
                    setTextScore();
                    count16 = count20;
                    count20 = 0;
                    setImage(16, count16);
                    setImage(20, count20);
                    win();
                }  else if (count19 == 0) {
                    setTextScore();
                    count19 = count20;
                    count20 = 0;
                    setImage(19, count19);
                    setImage(20, count20);
                    win();
                }  else if (count24 == 0) {
                    setTextScore();
                    count24 = count20;
                    count20 = 0;
                    setImage(24, count24);
                    setImage(20, count20);
                    win();
                }
            }
        }
    }
    public void option21(View v) {
        if(!Win) {
            if(count21 != 0) {
                if (count17 == 0) {
                    setTextScore();
                    count17 = count21;
                    count21 = 0;
                    setImage(17, count17);
                    setImage(21, count21);
                    win();
                } else if (count22 == 0) {
                    setTextScore();
                    count22 = count21;
                    count21 = 0;
                    setImage(22, count22);
                    setImage(21, count21);
                    win();
                }
            }
        }
    }
    public void option22(View v) {
        if(!Win) {
            if(count22 != 0) {
                if (count21 == 0) {
                    setTextScore();
                    count21 = count22;
                    count22 = 0;
                    setImage(21, count21);
                    setImage(22, count22);
                    win();
                } else if (count23 == 0) {
                    setTextScore();
                    count23 = count22;
                    count22 = 0;
                    setImage(23, count23);
                    setImage(22, count22);
                    win();
                }  else if (count18 == 0) {
                    count18 = count22;
                    count22 = 0;
                    setImage(18, count18);
                    setImage(22, count22);
                    win();
                }
            }
        }
    }
    public void option23(View v) {
        if(!Win) {
            if(count23 != 0) {
                if (count24 == 0) {
                    setTextScore();
                    count24 = count23;
                    count23 = 0;
                    setImage(24, count24);
                    setImage(23, count23);
                    win();
                } else if (count19 == 0) {
                    setTextScore();
                    count19 = count23;
                    count23 = 0;
                    setImage(19, count19);
                    setImage(23, count23);
                    win();
                } else if (count22 == 0) {
                    setTextScore();
                    count22 = count23;
                    count23 = 0;
                    setImage(22, count22);
                    setImage(23, count23);
                    win();
                }
            }
        }
    }
    public void option24(View v) {
        if (!Win) {
            if (count24 != 0) {
                if (count23 == 0) {
                    setTextScore();
                    count23 = count24;
                    count24 = 0;
                    setImage(24, count24);
                    setImage(23, count23);
                    win();
                } else if (count20 == 0) {
                    setTextScore();
                    count20 = count24;
                    count24 = 0;
                    setImage(24, count24);
                    setImage(20, count20);
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
        ImageView img10 = (ImageView) findViewById(R.id.image10);
        ImageView img11 = (ImageView) findViewById(R.id.image11);
        ImageView img12 = (ImageView) findViewById(R.id.image12);
        ImageView img13 = (ImageView) findViewById(R.id.image13);
        ImageView img14 = (ImageView) findViewById(R.id.image14);
        ImageView img15 = (ImageView) findViewById(R.id.image15);
        ImageView img16 = (ImageView) findViewById(R.id.image16);
        ImageView img17 = (ImageView) findViewById(R.id.image17);
        ImageView img18 = (ImageView) findViewById(R.id.image18);
        ImageView img19 = (ImageView) findViewById(R.id.image19);
        ImageView img20 = (ImageView) findViewById(R.id.image20);
        ImageView img21 = (ImageView) findViewById(R.id.image21);
        ImageView img22 = (ImageView) findViewById(R.id.image22);
        ImageView img23 = (ImageView) findViewById(R.id.image23);
        ImageView img24 = (ImageView) findViewById(R.id.image24);

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
        else if (option==10)
            img10.setImageResource(image_lc[count]);
        else if (option==11)
            img11.setImageResource(image_lc[count]);
        else if (option==12)
            img12.setImageResource(image_lc[count]);
        else if (option==13)
            img13.setImageResource(image_lc[count]);
        else if (option==14)
            img14.setImageResource(image_lc[count]);
        else if (option==15)
            img15.setImageResource(image_lc[count]);
        else if (option==16)
            img16.setImageResource(image_lc[count]);
        else if (option==17)
            img17.setImageResource(image_lc[count]);
        else if (option==18)
            img18.setImageResource(image_lc[count]);
        else if (option==19)
            img19.setImageResource(image_lc[count]);
        else if (option==20)
            img20.setImageResource(image_lc[count]);
        else if (option==21)
            img21.setImageResource(image_lc[count]);
        else if (option==22)
            img22.setImageResource(image_lc[count]);
        else if (option==23)
            img23.setImageResource(image_lc[count]);
        else if (option==24)
            img24.setImageResource(image_lc[count]);
    }

    public void win() {
        if(count1 == 1 && count2 == 2 && count3 == 3 && count4 == 4 && count5 == 5 && count6 == 6 && count7 == 7 && count8 == 8 && count9 == 9 && count10 == 10 && count11 == 11 && count12 == 12 && count13 == 13 && count14 == 14 && count15 == 15 && count16 == 16 && count17 == 17 && count18 == 18 && count19 == 19 && count20 == 20 && count21 == 21 && count22 == 22 && count23 == 23 && count24 == 0){
            Win = true;
            Intent intent = new Intent(this, YouWin.class);
            intent.putExtra("level", "আপনি পাচটি  লেভেল অতিক্রম করেছেন");
            intent.putExtra("score", ("এবং আপনি মোট " + score + " বার পাজল সরিয়েছেন"));
            intent.putExtra("lebel", "5");
            startActivity(intent);
        }
    }

    int score=0;
    public void setTextScore() {
        TextView idScore = (TextView)findViewById(R.id.idScore);
        idScore.setText("Moves : " + (++score));
    }
}
