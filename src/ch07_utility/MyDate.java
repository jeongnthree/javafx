package ch07_utility_classes;

public class MyDate {
    private int year ;
    private int month ;
    private int day ;

    @Override
    public boolean equals(Object obj) {
        // 비교 하는 두 객체의 날짜 필드 각각을 비교하도록 합니다.
        MyDate mydate = (MyDate)obj ;
        boolean result =
                this.year == mydate.year &&
                this.month == mydate.month &&
                this.day == mydate.day  ;

        return result ;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
