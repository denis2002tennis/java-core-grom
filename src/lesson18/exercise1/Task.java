package lesson18.exercise1;

public class Task {
    public static void main(String[] args) {
        FileStorage fileStorage=new FileStorage();
        String[] fileNames={"test1","test2"};
        fileStorage.setFiles(fileNames);

        printer(fileStorage);
    }

    public static void printer(Storage storage){
       String[] names=storage.getFiles();
        try {
            System.out.println("5 th name is "+ names[4]);
        }
        catch (Exception e){
            System.err.println("5th name can not be found...");
          //  System.err.println(e.getMessage());
        }
    }
}
