public class newPaperPrepration {
    public static void main(String[] args) {
        char Grade='A';
        switch (Grade){
            case 'O' :
                System.out.println("marks are>90");
                break;
            case 'A' :
                System.out.println("marks are>80");
                break;
            case 'B' :
                System.out.println("marks are>70");
                break;
            case 'D' :
                System.out.println("marks are>50");
                break;
            default:
                System.out.println("invalid grade");
                break;

        }

    }
}
