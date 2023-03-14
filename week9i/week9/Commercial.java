package week9;

public class Commercial extends Property {
    private int numFloors;
    private boolean hasParkingLot;

    public Commercial() {
        super();
        this.numFloors = 0;
        this.hasParkingLot = false;
    }

    public Commercial(String streetAddress, String zip, int numFloors, boolean hasParkingLot) {
        super(streetAddress, zip);
        this.numFloors = numFloors;
        this.hasParkingLot = hasParkingLot;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public boolean hasParkingLot() {
        return hasParkingLot;
    }

    public void setHasParkingLot(boolean hasParkingLot) {
        this.hasParkingLot = hasParkingLot;
    }

    @Override
    public int calculateAppraisalPrice() {
        int basePrice = 100000;
        int floorPrice = 50000;
        int parkingLotPrice = 25000;

        int price = basePrice + (numFloors * floorPrice);

        if (hasParkingLot) {
            price += parkingLotPrice;
        }

        return price;
    }
}