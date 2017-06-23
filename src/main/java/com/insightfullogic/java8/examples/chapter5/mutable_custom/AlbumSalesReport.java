package com.insightfullogic.java8.examples.chapter5.mutable_custom;

@SuppressWarnings("javadoc")
public class AlbumSalesReport {

    public AlbumSalesReport() {

    }

    public AlbumSalesReport(AlbumSale album) {
        this();
        acknowledgeSale(album);
    }

    public void acknowledgeSale(AlbumSale album) {
      //dummy
    }

    public AlbumSalesReport merge(AlbumSalesReport right) {
        return null;
    }

}
