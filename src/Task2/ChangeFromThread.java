package Task2;

public class ChangeFromThread {
    private int limit;
    private volatile int count;
    private   String  result;

    public int getLimit() {
        return limit;
    }

    public String getResult() {
        return result;
    }

    public int getCount() {
        return count;
    }

    public ChangeFromThread(int limit) {
        this.limit = limit;
        count = 1;
        result = new String();
    }

    public void fizz() {
        if(count % 3 == 0 && count % 5 !=0 && count <= limit){
           // result += "fizz";
           // System.out.println(count + " fizz");
            result +=  count == limit?  "fizz." : "fizz, ";
            count++;
        }
    }

    public void buzz() {
        if(count % 5 == 0 && count % 3 != 0 && count <= limit){
           // result += "buzz";
           // System.out.println(count + " buzz");
            result +=  count == limit?  "buzz." : "buzz, ";
            count++;
        }
    }

    public void fizzbuzz() {
        if(count % 5 == 0 && count % 3 == 0 && count <= limit){
           // result += "fizzbuzz";
           // System.out.println(count + " fizzbuzz");
            result +=  count == limit?  "fizzbuzz." : "fizzbuzz, ";
            count++;
        }
    }
    public void number(){
        if(count % 5 != 0 && count % 3 !=0 && count <= limit){
          //  result += count;
           // System.out.println( count + " number");
            result +=  count == limit?  count + "." : count + ", ";
            count++;
        }
    }

}
