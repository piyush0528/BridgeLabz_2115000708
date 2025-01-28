public class ques7 {
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    public static boolean areOTPUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("OTP Numbers: ");
        for (int otp : otps) {
            System.out.println(otp);
        }
        System.out.println("Are OTPs unique? " + areOTPUnique(otps));
    }
}
