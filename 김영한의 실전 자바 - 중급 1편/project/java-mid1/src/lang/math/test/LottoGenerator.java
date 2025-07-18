package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private static final Random random = new Random();
    private static final int[] nums = new int[6];
    private static final boolean[] used = new boolean[1 + 45];

    public static void generate() {
        int index = 0;

        while (index < nums.length) {
            int num = random.nextInt(45) + 1;

            if (!used[num]) {
                nums[index++] = num;
                used[num] = true;
            }
        }

        for (int num : nums) {
            used[num] = false;
        }

        System.out.println("로또 번호: " + nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3] + " " + nums[4] + " " + nums[5]);
    }
}
