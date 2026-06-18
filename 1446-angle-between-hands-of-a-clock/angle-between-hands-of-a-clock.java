class Solution {
    public double angleClock(int hour, int minutes) {
        double ahour = (30 * (hour%12)) + (0.5 * minutes);
        double aminute = 6 * minutes;

        double ans = Math.min(ahour-aminute , aminute-ahour);
        if(ans < 0)ans *= -1;
        ans = Math.min(ans , 360 - ans);      

        return ans;
    }
}