package LV01;


public class VideoPlayer {
    public static void main(String[] args) {
        String video_len = "34:33";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands = {"next", "prev"};

        String result = solution(video_len, pos, op_start, op_end, commands);

        System.out.println(result);  // 예상 출력: 00:10
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int videoLenSec = toSeconds(video_len);
        int current = toSeconds(pos);
        int opStartSec = toSeconds(op_start);
        int opEndSec = toSeconds(op_end);

        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                current = Math.max(0, current - 10);
            } else if (cmd.equals("next")) {
                current = Math.min(videoLenSec, current + 10);
            }

            if (current >= opStartSec && current <= opEndSec) {
                current = opEndSec;
            }
        }

        return toTimeFormat(current);
    }
    public static int toSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    public static String toTimeFormat(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
