class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        List<String> days = Arrays.asList(
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday");
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int c = year / 100;
        year = year % 100;
        int h = (c / 4 - 2 * c + year + year / 4 + 13 * (month + 1) / 5 + day - 1) % 7;
        return days.get((h + 7) % 7);
    }
}