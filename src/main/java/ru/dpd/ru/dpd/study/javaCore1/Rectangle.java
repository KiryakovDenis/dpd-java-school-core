package ru.dpd.ru.dpd.study.javaCore1;

public class Rectangle {
    private Long width;
    private Long height;

    public Rectangle(Long width, Long height){
        this.width = width;
        this.height = height;
    }

    public Long getArea(){
        return this.width * this.height;
    }

    public Long getPerimetr(){
        return (this.width + this.height) * 2;
    }

    public Long getWidth() {
        return width;
    }

    public Long getHeight() {
        return height;
    }
}
