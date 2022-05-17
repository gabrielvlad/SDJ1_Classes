import java.util.Objects;

public class Address {

    private String town;
    private String street;
    private int number;
    private char letter;
    private int floor;
    private String door;

    public Address(){
        // this("", "", 0, (char) 0, 0, "");
    }

    public Address(String town, String street, int number, char letter, int floor, String door) {
        this.town = town;
        this.street = street;
        this.number = number;
        this.letter = letter;
        this.floor = floor;
        this.door = door;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getFullNumber(){
        return number + letter + " " + floor + ". floor " + door;
    }

    public String getFullAddress(){
        return street + " " + getFullNumber() + " " + town;
    }

    @Override
    public String toString() {
        return "Address:\n" +
                "town: " + town + '\n' +
                "street: " + street + " " + number + letter + '\n' +
                "floor: " + floor + " door: " + door;
    }

}
