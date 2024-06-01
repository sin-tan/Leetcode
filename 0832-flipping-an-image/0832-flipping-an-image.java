class Solution {
    //aproach
    // first reverse all the elements of the rows
    //then find the XOR of all the elements

    public int[][] flipAndInvertImage(int[][] image) {
        int l=image[0].length;
        int ll=image.length;

         for (int i = 0; i < l; i++) {
            for (int j = 0; j < (ll+1) / 2; j++) {
                int temp = image[i][j]^1;
                image[i][j] = image[i][l - 1 - j]^1;
                image[i][l - 1 - j] = temp;
            }
            }

   return image;
    }
}