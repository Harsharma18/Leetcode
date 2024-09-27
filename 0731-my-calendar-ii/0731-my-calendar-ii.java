import java.util.*;

class MyCalendarTwo {
    private List<int[]> events; // stores the start and end times of booked events
    private List<int[]> overlaps; // stores the start and end times of overlaps

    public MyCalendarTwo() {
        events = new ArrayList<>();
        overlaps = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        // Check for overlaps with existing events
        for (int[] overlap : overlaps) {
            if (start < overlap[1] && end > overlap[0]) {
                return false; // Conflict with an existing overlap
            }
        }
        
        // Check for overlaps with existing events to create new overlaps
        for (int[] event : events) {
            if (start < event[1] && end > event[0]) {
                overlaps.add(new int[] { Math.max(start, event[0]), Math.min(end, event[1]) });
            }
        }
        
        // Add the new event
        events.add(new int[] { start, end });
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
