public class RainWaterTrapping {

	public static void main(String[] args) {
		int[] towerHeights = { 1, 5, 2, 3, 1, 7, 2, 4 };
		int[] rightMaxHeight = new int[towerHeights.length];//This array used to store right side maximum height respective 
								     //to every building
		int maxHeightTillNow = 0;

		//THe right most building don't have any building right after that,we are taking right most building height as
					//his right max height.
		for (int i = towerHeights.length - 1; i >= 0; i--) {
			if (towerHeights[i] > maxHeightTillNow) {
				maxHeightTillNow = towerHeights[i];
			}
			rightMaxHeight[i] = maxHeightTillNow;
		}

		int rainWater = 0;
		int maxHeightLeft = 0;
		for (int i = 0; i < towerHeights.length; i++) {
			rainWater = rainWater
					+ Math.max(Math.min(maxHeightLeft, rightMaxHeight[i])
							- towerHeights[i], 0);

			if (towerHeights[i] > maxHeightLeft) {
				maxHeightLeft = towerHeights[i];
			}
		}
		System.out.println(rainWater);
	}
}
