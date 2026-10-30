package Bullcowalinga;
public class allDiff {
    public static boolean check(String n,GuessChecker l,boolean type,int digits){
        try{
        int b = Integer.parseInt(n);
        if(!(b>=0 && b<=Math.pow(10,digits)-1)){return false;}
        if(n.length()<digits){
            int needed = digits-n.length();
            while(needed>0){
                n = 0+n;
                needed--;
            }
        }
        int first = Integer.parseInt(n.substring(digits-1));
        if(type == false){
            for(int i=0;i<=digits-2;i++){
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
