package com.project.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("AlertDialog");

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(btnClick);
        btn2.setOnClickListener(btnClick);
    }

    View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    new AlertDialog.Builder(MainActivity.this)
                            .setIcon(R.mipmap.ic_launcher)
                            .setTitle("簡易提示訊息")
                            .setMessage("Hi")
                            .setPositiveButton("確認", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if(toast != null)
                                        toast.cancel();
                                    Toast.makeText(MainActivity.this, "確認", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if(toast != null)
                                        toast.cancel();
                                    Toast.makeText(MainActivity.this,"取消", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                    break;

                case R.id.btn2:
                    new AlertDialog.Builder(MainActivity.this)
                            .setIcon(R.drawable.images)
                            .setTitle("使用自訂 icon")
                            .setMessage("按下按鈕，分別透過Toast顯示訊息")
                            .setPositiveButton("確認", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if(toast != null)
                                        toast.cancel();
                                    Toast.makeText(MainActivity.this, "確認", Toast.LENGTH_SHORT).show();
                                }
                            })

                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if(toast != null)
                                        toast.cancel();
                                    Toast.makeText(MainActivity.this,"取消", Toast.LENGTH_SHORT).show();
                                }
                            })

                            .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if(toast != null)
                                        toast.cancel();
                                    Toast.makeText(MainActivity.this,"忽略", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                    break;
            }
        }
    };
}
