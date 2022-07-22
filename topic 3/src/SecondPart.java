public class SecondPart {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementDoors();
        System.out.println(miCoche.numberDoors);
    }
}
class Coche {
    int numberDoors = 0;

    void incrementDoors(){
        this.numberDoors++;
    }
}