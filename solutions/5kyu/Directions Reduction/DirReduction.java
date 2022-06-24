import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        Stack <String> stack = new Stack<>();

        for(String direction : arr) {

            String last = stack.size() > 0 ? stack.lastElement() : null;
            switch (direction) {
                case "NORTH":
                    if ("SOUTH".equals(last)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    } break;
                case "SOUTH":
                    if ("NORTH".equals(last)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    } break;

                case "EAST":
                    if ("WEST".equals(last)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    } break;
                case "WEST":
                    if ("EAST".equals(last)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    }break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
}