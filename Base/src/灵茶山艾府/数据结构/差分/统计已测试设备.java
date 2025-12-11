package 灵茶山艾府.数据结构.差分;

public class 统计已测试设备 {
    public int countTestedDevices(int[] batteryPercentages) {
        int dec = 0;
        for (int x : batteryPercentages) {
            if (x - dec > 0){
                dec++;
            }
        }
        return dec;
    }
}
