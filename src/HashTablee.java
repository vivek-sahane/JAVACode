import java.util.*;
class Hash {

    private int currentSize, maxSize;
    private String[] keys;
    private String[] vals;

    public Hash(int capacity)
    {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    private int hash(String k)
    {
        return Integer.parseInt(k)%maxSize;
    }

    public void insert(String k, String v){
        int temp = hash(k);
        int i = temp;
        do {
            if (keys[i] == null) {
                keys[i] = k;
                vals[i] = v;
                currentSize++;
                return;
            }

            if (keys[i].equals(k)) {
                vals[i] = v;
                return;
            }

            i = (i + 1) % maxSize;
        }
        while (i != temp);
    }

    public int getSize(){
        return currentSize;
    }

    public boolean isFull(){
        return currentSize==maxSize;
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public String get(String k){
        int i = hash(k);
        while (keys[i] != null) {
            if (keys[i].equals(k))
                return vals[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }


    public boolean contain(String k){
        return get(k)!=null;
    }

    public void makeEmpty(){
        currentSize = 0;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    public void printHashTable(){
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
            if (keys[i] != null)
                System.out.println(i+" "+keys[i] + " " + vals[i]);
        System.out.println();
    }

    public void remove(String k)
    {
        if (!contain(k)){
            return;
        }
        int i = hash(k);
        while (!k.equals(keys[i])){
            i = (i + 1) % maxSize;
        }
        keys[i] = vals[i] = null;

        for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize)
        {
            String temp1 = keys[i], temp2 = vals[i];
            keys[i] = vals[i] = null;
            currentSize--;
            insert(temp1, temp2);
        }
        currentSize--;
    }

}

class HashTablee {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size");

        Hash l = new Hash(sc.nextInt());

        char again;

        do
        {
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. get");
            System.out.println("4. clear");
            System.out.println("5. size");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter key and value");
                    l.insert(sc.next(), sc.next());
                    break;

                case 2:
                    System.out.println("Enter key");
                    l.remove(sc.next());
                    break;

                case 3:
                    System.out.println("Enter key");
                    System.out.println("Value = "+ l.get(sc.next()));
                    break;

                case 4:
                    l.makeEmpty();
                    System.out.println("Hash Table Cleared\n");
                    break;

                case 5:
                    System.out.println("Size = "+ l.getSize());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            l.printHashTable();	

            System.out.println("\nDo you want to continue (Type y or n) \n");

            again = sc.next().charAt(0);
        } while (again == 'Y' || again == 'y');
    }
}