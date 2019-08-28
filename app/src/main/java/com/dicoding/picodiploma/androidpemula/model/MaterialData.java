package com.dicoding.picodiploma.androidpemula.model;

import java.util.ArrayList;

public class MaterialData {
    public static String[][] data = new String[][]{
            {"Semen Tiga Roda", "Rp. 46.000", "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/1/15/5001811/5001811_0dc42132-8269-48f9-ad9a-fec65e32a578_400_400.jpg"},
            {"Kran Air Plastik 3/4\"", "Rp. 13.500", "http://sinlogkran.com/wp-content/uploads/2015/06/SL.2020-plastik-pp-0.75-inch-biru-675x448.jpg"},
            {"Kran Air Plastik 1/2\"", "Rp. 12.000", "http://sinlogkran.com/wp-content/uploads/2015/06/SL.2020-plastik-pp-0.75-inch-biru-675x448.jpg"},
            {"Kain Majun 1KG", "Rp. 9.000", "http://www.centralterpal.com/images/produk/kain-lap/kain-majun/kain-majun-1.www.centralterpal.com.jpg"},
            {"Lem Pipa Isarplas", "Rp. 9.000", "https://s3.bukalapak.com/img/371231948/w-1000/Lem_Pipa_PVC_Paralon_Isarplas_45_gram.jpg"},
            {"Lem Putih Rajawali", "Rp. 14.500", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/12/5/45197635/45197635_5523f6c5-f128-4092-a974-ce74322b2f7d_700_700.jpg"},
            {"Lem G", "Rp. 6.500", "https://ecs7.tokopedia.net/img/cache/700/product-1/2015/12/23/618908/618908_95275146-731f-4a39-a77d-19cc322cbe6b.jpg"},
            {"Palu Blitz", "Rp. 30.000", "https://i0.wp.com/www.klikteknik.com/wp-content/uploads/2016/05/Blitz-Palu-Konde.jpg?fit=800%2C973&ssl=1"},
            {"Sarung Tangan Tukang", "Rp. 4.000", "http://www.entersafety.co.id/image-product/img283-1442107942.jpg"},
            {"Kawat Bendrat 1KG", "Rp. 20.000", "https://s2.bukalapak.com/img/2992794482/w-1000/KAWAT_BETON_KAWAT_BENDRAT_BANGUNAN.jpg"},
    };

    public static ArrayList<Material> getListData(){
        ArrayList<Material> list = new ArrayList<>();

        for (String[] aData : data){
            Material material = new Material();
            material.setName(aData[0]);
            material.setPrice(aData[1]);
            material.setPhoto(aData[2]);

            list.add(material);
        }

        return list;
    }
}
