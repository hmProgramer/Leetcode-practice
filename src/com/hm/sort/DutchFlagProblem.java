package src.com.hm.sort;

/**
 * ��Ŀ������һ��������ɫ����ɫ����ɫ��һ��n  ��Ԫ�ص����飬ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ�
 * �����պ�ɫ����ɫ����ɫ˳�����С������У�����ʹ������ �� ��  �ֱ��ʾ��ɫ����ɫ����ɫ��Ҫ�󣺽�ʹ�ó����ռ��һ��ɨ���㷨��
 * �����������⣺����һ������ nums ��һ���� mid ����С�� mid �����ŵ��������ߣ�
 * ���� mid ��������������м䣬���� mid ��������������ұߡ�
 * Ҫ��ʱ�临�Ӷ� O(N)���ռ临�Ӷ�O(1)��
 * ���⣺Ϊʲô���2  ��ִ�� cur++ ��������Ϊ�����޷��жϴ����ұ߽������������ݾ�һ��������ɫ����������һ���жϵ�ʱ������жϵ�ǰλ��
 * http://ll028.cn/62BjXS
 * //����� ===��0��1��2
 */
public class DutchFlagProblem {
    public static void main(String[] args) {
        DutchFlagProblem d = new DutchFlagProblem();
        int[] nums = {1,2,0,2,1,1,0,1,2,1,0,1,2};
        d.sortColors(nums);
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+",");
        }
    }

    public void sortColors(int[] nums) {
        final int MEDIUM = 1;

        int n = nums.length;
        // ��ʼ��ָ���λ��, һ��ʼ��Ϊ���û�к�ɫ, �ұ�û����ɫ
        int r0 = 0, last = n - 1, cur = 0;

        while (cur <= last) {
            if (nums[cur] < MEDIUM) { // ��ǰֵ�Ǻ�ɫ
                swap(nums, cur++, r0++);
            } else if (nums[cur] > MEDIUM) { // ��ǰֵ����ɫ
                swap(nums, cur, last--);
            } else { // ��ǰֵ�ǰ�ɫ
                cur++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}