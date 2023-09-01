public class AirPlane implements Fly{

    String name;

    public AirPlane(String name) {
        this.name = name;
    }

    @Override
    public void flying() {
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}
