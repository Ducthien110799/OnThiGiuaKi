package thien.cntt.onthigiuaki;

public class Donut {
    private String name;
    private String info;
    private String price;
    private int img;

    public Donut(String name, String info, String price, int img) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
