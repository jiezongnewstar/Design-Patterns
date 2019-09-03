package com.xibei.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.xibei.designpatterns.adapter.ChargeAdapter;
import com.xibei.designpatterns.adapter.ChinaCharge;
import com.xibei.designpatterns.adapter.USA;
import com.xibei.designpatterns.appearance.ImageLoad;
import com.xibei.designpatterns.factory.Api;
import com.xibei.designpatterns.factory.ApiImpl;
import com.xibei.designpatterns.factory.ParameterFactory;
import com.xibei.designpatterns.factory.PropertiesFactory;
import com.xibei.designpatterns.factory.SimpleFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_common, btn_simple_factory,
            btn_parmas_factory, btn_opt_factory,
            btn_appearance,btn_simple_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_common = findViewById(R.id.btn_common);
        btn_simple_factory = findViewById(R.id.btn_simple_factory);
        btn_parmas_factory = findViewById(R.id.btn_parmas_factory);
        btn_opt_factory = findViewById(R.id.btn_opt_factory);
        btn_appearance = findViewById(R.id.btn_appearance);
        btn_simple_adapter = findViewById(R.id.btn_simple_adapter);
        btn_common.setOnClickListener(this);
        btn_simple_factory.setOnClickListener(this);
        btn_parmas_factory.setOnClickListener(this);
        btn_opt_factory.setOnClickListener(this);
        btn_appearance.setOnClickListener(this);
        btn_simple_adapter.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_common:
                //常规编码
                Api api = new ApiImpl();
                api.create();
                break;
            case R.id.btn_simple_factory:
                //简单工厂
                Api api_simple = SimpleFactory.creatApi();
                api_simple.create();
                break;
            case R.id.btn_parmas_factory:
                //根据参数来配置
                Api api_parmas = ParameterFactory.createApi("name&age");
                api_parmas.create();
                break;
            case R.id.btn_opt_factory:
                Api api_properties = PropertiesFactory.createApi(this);
                api_properties.create();
                break;
            case R.id.btn_appearance:
                new ImageLoad("xibei").loadImage();
                break;
            case R.id.btn_simple_adapter:
                ChinaCharge chinaCharge = new ChargeAdapter(new USA());
                chinaCharge.chinaCharge();
                break;


        }
    }
}
