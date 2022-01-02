public class Wall {
    private double height;
    private double width;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }

}
