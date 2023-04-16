package Laptop;

public class Laptop {

    /**Модель ноутбука */
    String model;
    /**Оперативная память */
    Integer ram;
    /**Объем жесткого диска */
    Integer hd;
    /**Операционная система */
    String os;
    /**цвет ноутбука */
    String color;  

    /**
     * это конструктор
     * @param model модель ноутбука
     * @param i   оперативная память
     * @param j    объем жесткого диска
     * @param os    оперативная система
     * @param color цвет ноутбука
     */
    public Laptop(String model, int i, int j, String os, String color ) {
        this.model = model;
        this.ram = i;
        this.hd = j;
        this.os = os;
        this.color = color;
    }

    // /**
    // * конструктор ноутбука 1 параметр
    // * @param model модель ноутбука
    // */
    // public Laptop(String model) {
    //     this.model = model;
    // }
    
    /**Вывод информации о ноутбуке */
    public String getInfo() {
        return String.format("Laptop -> model: %s  ram: %d hd:  %d ГБ OS: %s color: %s",
                this.model, this.ram, this.hd, this.os, this.color);
    }
    /** получаем модель ноутбука */
    public String getModel(){ 
        return model; 
    } 

    /** получаем ОЗУ ноутбука */
    public Integer getRam(){ 
        return ram; 
    } 
    
    /** получаем объем жесткого диска */
    public Integer getHd(){ 
        return hd; 
    }      

    /** получаем ОС ноутбука */
    public String getOs(){ 
        return os; 
    } 
    
    /** получаем цвет ноутбука */
    public String getColor(){ 
        return color; 
    }     

}
