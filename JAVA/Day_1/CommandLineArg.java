class CommandLineArg {

    public static void main(String[] args) {
        System.out.println("Input : ");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + args[i]);
        }
    }

}
