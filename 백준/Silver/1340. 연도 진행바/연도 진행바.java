import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        String input = scanner.nextLine();
        scanner.close();
        
        // 각 달의 일수 (평년 기준)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 월 이름을 숫자로 매핑
        String[] monthNames = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        
        // 입력 파싱
        String[] parts = input.split(" ");
        String monthName = parts[0];
        int day = Integer.parseInt(parts[1].substring(0, 2));
        int year = Integer.parseInt(parts[2].substring(0, 4));
        String[] timeParts = parts[3].split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        
        // 월을 숫자로 변환 (0-indexed)
        int month = -1;
        for (int i = 0; i < monthNames.length; i++) {
            if (monthNames[i].equals(monthName)) {
                month = i;
                break;
            }
        }
        
        // 윤년 여부 확인
        boolean isLeapYear = isLeapYear(year);
        
        // 윤년일 경우 2월의 일수를 29일로 수정
        if (isLeapYear) {
            daysInMonth[1] = 29;
        }
        
        // 이번 연도까지 지난 시간 (분 단위)
        long totalMinutesPassed = getTotalMinutesPassed(year, month, day, hour, minute, daysInMonth);
        
        // 해당 연도의 전체 분 수
        long totalMinutesInYear = getTotalMinutesInYear(year, daysInMonth);
        
        // 진행률 계산
        double progressPercentage = (totalMinutesPassed / (double) totalMinutesInYear) * 100;
        
        // 결과 출력
        System.out.println(progressPercentage);
    }
    
    // 윤년 계산 함수
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    // 해당 연도의 총 분 수 계산
    public static long getTotalMinutesInYear(int year, int[] daysInMonth) {
        long totalMinutes = 0;
        for (int i = 0; i < 12; i++) {
            totalMinutes += daysInMonth[i] * 24 * 60;
        }
        return totalMinutes;
    }
    
    // 해당 시점까지 지난 총 분 수 계산
    public static long getTotalMinutesPassed(int year, int month, int day, int hour, int minute, int[] daysInMonth) {
        long totalMinutes = 0;
        
        // 1월부터 지난 월까지의 분 수 합산
        for (int i = 0; i < month; i++) {
            totalMinutes += daysInMonth[i] * 24 * 60;
        }
        
        // 해당 월의 일수를 고려하여 날짜까지의 분 수 추가
        totalMinutes += (day - 1) * 24 * 60;
        
        // 해당 날의 시간과 분 추가
        totalMinutes += hour * 60 + minute;
        
        return totalMinutes;
    }
}
