package 灵茶山艾府.双指针滑动窗口.双指针;

public class 给植物浇水II {

    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int a = capacityA;
        int b = capacityB;
        int left = 0;
        int right = plants.length - 1;
        int sum = 0;
        while (left < right){
            if (capacityA < plants[left] ){
                sum++;
                capacityA = a;
            }
                capacityA -= plants[left];
                left++;

            if (capacityB < plants[right]){
                sum++;
                capacityB = b;
            }
                capacityB -= plants[right];
                right--;

        }
        if (left == right && Math.max(capacityA,capacityB) < plants[left]){
            sum++;
        }
        return sum;
    }
}
