class Solution {
    public double[] internalAngles(int[] sides) {
        double [] ans = new double[3];
        if(sides[0]+sides[1] <=  sides[2] || sides[1]+sides[2] <=  sides[0] || sides[0]+sides[2] <=  sides[1])
        {
            return new double [0];
        }
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        double angleA = Math.acos((b*b + c*c - a*a) / (2.0 * b * c));
        double angleB = Math.acos((a*a + c*c - b*b) / (2.0 * a * c));
        double angleC = Math.acos((a*a + b*b - c*c) / (2.0 * a * b));

        ans[0] = Math.toDegrees(angleA);
        ans[1] = Math.toDegrees(angleB);
        ans[2] = Math.toDegrees(angleC);
        Arrays.sort(ans);
        return ans;
    }
}