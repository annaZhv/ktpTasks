public class Chess {
    /*2. Функция, которая принимает имя шахматной фигуры, ее положение и
  целевую позицию. Функция должна возвращать true, если фигура может двигаться
  к цели, и false, если она не может этого сделать*/
    public static void main(String[] args) {
        System.out.println(canMove("Bishop", "A7", "G1"));
        System.out.println(canMove("Queen", "C4", "D6"));
    }

    public static boolean canMove(String figure, String pos, String to) {
        int[] coords = new int[2];
        coords[0] = (int)(to.toCharArray()[0]) - (int)(pos.toCharArray()[0]);
        coords[1] = (int)(to.toCharArray()[1]) - (int)(pos.toCharArray()[1]);

        switch(figure) {
            case ("Pawn"):
                return canPawn(pos, coords);
            case ("Knight"):
                return canKnight(coords);
            case ("Bishop"):
                return canBishop(coords);
            case ("Rook"):
                return canRook(coords);
            case ("Queen"):
                return canQueen(coords);
            case ("King"):
                return canKing(coords);
            default:
                System.out.println("Фигура не существует");
                break;
        }
        return false;
    }

    /** Подфункция для пешки **/
    public static boolean canPawn(String pos, int[] coords) {
        if (coords[0] == 0) {
            if (coords[1] == 1) return true;
            else return coords[1] == 2 && pos.contains("2");
        }
        else return false;
    }

    /** Подфункция для коня **/
    public static boolean canKnight(int[] coords) {
        if (Math.abs(coords[0]) == 1 && Math.abs(coords[1]) == 2) return true;
        else return Math.abs(coords[0]) == 2 && Math.abs(coords[1]) == 1;
    }

    /** Подфункция для слона **/
    public static boolean canBishop(int[] coords) {
        return Math.abs(coords[0]) == Math.abs(coords[1]);
    }

    /** Подфункция для Ладьи **/
    public static boolean canRook(int[] coords) {
        return coords[0] == 0 || coords[1] == 0;
    }

    /** Подфункция для Ферзя **/
    public static boolean canQueen(int[] coords) {
        return canRook(coords) || canBishop(coords);
    }

    /** Подфункция для Короля **/
    public static boolean canKing(int[] coords) {
        return Math.abs(coords[0]) <= 1 && Math.abs(coords[1]) <= 1;
    }
}
