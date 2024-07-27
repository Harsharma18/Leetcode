class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {
            // Flip the image horizontally
            for (int j = 0; j < cols / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][cols - 1 - j];
                image[i][cols - 1 - j] = temp;
            }
            // Invert the image
            for (int j = 0; j < cols; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}
