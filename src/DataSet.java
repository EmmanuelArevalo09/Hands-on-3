public class DataSet{
    // static double sumaPublicidad = 0;
    // static double publicidad[] = new double[9]; //Arreglo independiente

    private double[] publicidad; // variable independiente x
    private double[] ventas; // Variable dependiente y

    //Inicializar los arreglos de "Sales" y de "Advertasing"
    public DataSet(){
        publicidad = new double[]{-1.5,0,2.5,5,7,10,12,15,17,20,22,25,27,30};  //Datos desconocidos (4, 5, 6)
        ventas = new double[]{33,46,55,80,87,93,95,91,89,77,72,54,46,34}; // Desconocidos (18, 27, 34)
    }

    double[] desco = {4, 5, 6, 9, 11};//Arreglo de datos independientes para dependientes desconocidos

    public double[] getX(){
        return this.publicidad;
    }
    public double[] getY(){
        return this.ventas;
    }
    public double[] getDesco(){
        return this.desco;
}
}
