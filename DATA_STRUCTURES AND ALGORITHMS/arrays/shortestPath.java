public class shortestPath {
    public static double shortPath(String str){
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            switch (Character.toUpperCase(str.charAt(i))) {
                case 'N': y++; break;
                case 'E': x++; break;
                case 'S': y--; break;
                case 'W': x--; break;
            }

        }
        double shortestPath = Math.sqrt( x*x + y*y );
        return shortestPath;
    }
    public static void main(String[] args) {
        // String str = "wneeNeSEnnn";
        String str = "ns";
        // System.out.println(shortPath(str));
        String str2 = new String("ns");
        System.out.println(str.equals(str2));
    }
}
