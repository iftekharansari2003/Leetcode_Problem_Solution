class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
         // ADD HERE
        if (xCenter >= x1 && xCenter <= x2 &&
            yCenter >= y1 && yCenter <= y2) {
            return true;
        }

        //down to up

        for(int j=y1;j<=y2;j++){

            int x=xCenter-x1;
            int y=yCenter-j;

            double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

            if(dist<=radius){
                return true;
            }
        }

        //left to right
        for(int i=x1;i<=x2;i++){

            int x=xCenter-i;
            int y=yCenter-y1;

            double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

            if(dist<=radius){
                return true;
            }
        }

        //right to down

        for(int j=y2;j>=y1;j--){

            int x=xCenter-x2;
            int y=yCenter-j;

            double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

            if(dist<=radius){
                return true;
            }
        }

        //right to left
        for(int i=x2;i>=x1;i--){

            int x=xCenter-i;
            int y=yCenter-y2;

            double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

            if(dist<=radius){
                return true;
            }
        }
        return false;
    }
}