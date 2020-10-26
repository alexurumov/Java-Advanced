import java.util.*;

public class Room {
    private String name;
    private int capacity;
    private List<Integer> bookings;

    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Integer> getBookings() {
        return bookings;

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String result = this.name + " -> ";
        for (int i = 0; i < bookings.size(); i++) {
            result += bookings.get(i);
            if (i != bookings.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int capacity = Integer.parseInt(in.nextLine());

        String[] input = in.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();
        List<Room> rooms = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
        }

        while (!stack.isEmpty()) {

            String current = stack.peek();

            if (Character.isDigit(current.charAt(0))) {

                if (!rooms.isEmpty()) {

                    int booking = Integer.parseInt(current);

                    if (rooms.get(0).capacity >= booking) {
                        rooms.get(0).getBookings().add(booking);
                        rooms.get(0).setCapacity(rooms.get(0).getCapacity() - booking);

                        stack.pop();

                        if (rooms.get(0).getCapacity() <= 0) {
                            printAndRemoveRoom(rooms);
                        }

                    } else {
                        printAndRemoveRoom(rooms);
                    }

                } else {
                    stack.pop();
                }

            } else {
                Room room = new Room(stack.pop(), capacity);
                rooms.add(room);
            }

        }

    }

    private static void printAndRemoveRoom(List<Room> rooms) {
        System.out.println(rooms.get(0).toString());
        rooms.remove(0);
    }
}
