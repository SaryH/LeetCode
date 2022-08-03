class MyCalendar {
    LinkedList<int[]> calendar;
    public MyCalendar() {
        calendar=new LinkedList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] test:calendar){
            if(test[0]<end && start<test[1])
                return false;
        }
        calendar.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */