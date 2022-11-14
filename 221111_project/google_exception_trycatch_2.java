class google_exception_trycatch_2 {

    public static void main(String[] args) {
        try {
            String[] array = null;

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (NullPointerException e) {
            String message = e.getMessage();
            System.out.println("예외 발생 " + message);
        } finally {
            System.out.println("예외 상관없이 수행 됨");
        }
        System.out.println("프로그램이 죽지 않고 수행될 것인가");
    }

}