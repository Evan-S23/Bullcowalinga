package Bullcowalinga;
public class allDiff {
    public static boolean check(String n,GuessChecker l,boolean type){
        try{
        int b = Integer.parseInt(n);
        if(!(b>=0 && b<=9999)){return false;}
        if(n.length()<4){
            int needed = 4-n.length();
            while(needed>0){
                n = 0+n;
                needed--;
            }
        }
        int first = Integer.parseInt(n.substring(3));
        if(type == false){
            for(int i=0;i<=2;i++){
                int second = Integer.parseInt(n.substring(i,i+1));
                if(first == second && !(second == 0)){return false;}
            }
        }
        if(!type){l.update(n);}
        if(type){l.create(n);}
        return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
