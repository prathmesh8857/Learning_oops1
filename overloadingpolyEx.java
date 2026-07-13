class PropertyTax {

    public double calculateTax(double areaInSqFt){
        return areaInSqFt * 10;
        
    }
    public double calculateTax(int propertyvalue){
        return propertyvalue * 0.02;

    }
    public double calculateTax(double areaInSqFt, double ratePerSqFt){
        return areaInSqFt * ratePerSqFt;

    }
    public double calculateTax(double propertyvalue, int serviceCharge){
        return (propertyvalue * 0.015) + serviceCharge;

    }
    
}

public class overloadingpolyEx {

    public static void main(String[] args) {
        PropertyTax tax = new PropertyTax();

        System.out.println("Tax(by area) :" + tax.calculateTax(1500.0));

        System.out.println("Tax(by value) :" + tax.calculateTax(5000000));

        System.out.println("Tax(by area + rate) :" + tax.calculateTax(2000.0,12));

        System.out.println("Tax(by value + charge) :" + tax.calculateTax(8000000.5000));
        
    }

}
