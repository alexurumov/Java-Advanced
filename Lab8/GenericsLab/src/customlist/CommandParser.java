package customlist;

public class CommandParser {

    private CustomList<String> customList;

    public CommandParser() {
        this.customList = new CustomList<>();
    }

    public void execute(String command) {

        String[] tokens = command.split(" ");

        switch (tokens[0]) {
            case "Add":
                this.customList.add(tokens[1]);
                break;
            case "Remove":
                this.customList.remove(Integer.parseInt(tokens[1]));
                break;
            case "Contains":
                System.out.println(this.customList.contains(tokens[1]));
                break;
            case "Swap":
                this.customList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                break;
            case "Greater":
                System.out.println(this.customList.greater(tokens[1]));
                break;
            case "Max":
                System.out.println(this.customList.getMax());
                break;
            case "Min":
                System.out.println(this.customList.getMin());
                break;
            case "Print":
                for (String s : this.customList) {
                    System.out.println(s);
                }
                break;
            case "Sort":
                Sorter.sort(this.customList);
                break;
            default:
                break;
        }
    }
}
