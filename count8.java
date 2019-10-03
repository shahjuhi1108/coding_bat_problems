public int count8(int n) {

        return count(n, false);

    }

    private int count(int x, boolean flag){

        if(x == 0)
            return 0;

        else {
            if (x % 10 == 8)
                return ((flag) ? 2 : 1) + count(x / 10, true);
            
            else
                return count(x / 10, false);
        }
        
    }


/*

Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.

*/
