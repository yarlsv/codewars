public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds >360000) return "";
        else {
            int hour = seconds / 3600,
                    min = seconds / 60 % 60,
                    sec = seconds % 60;
            return String.format ("%02d:%02d:%02d", hour, min, sec);
        }
    }
}
