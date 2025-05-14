public class ProductInfo {

    static  String listOfProductNames[]={null,null,null};//declaration
    static int index = 0;

    public static void saveProductName(String productName){
        //logic to store the product name into array
        System.out.println("invoking Product Save method");
        if(index<listOfProductNames.length){
            listOfProductNames[index] = productName;
            System.out.println("saved successfully");
            index++;
        }else{
            System.out.println("array is full");
        }
    }
    public static void readProducts(){
        System.out.println("reading product details from array");
        for(int index=0;index<listOfProductNames.length;index++){
            System.out.println(listOfProductNames[index]);
        }
    }
    //reverse product names
    public static void reverseProductNames(){
        for(int index = listOfProductNames.length; index>=0;index-- ){
            System.out.println(listOfProductNames[index]);
        }
    }
    //update method
    public static void updateByProductName(String oldProductName, String newProductName){
        for(int index=0;index<listOfProductNames.length;index++){
            //comparision
            if(listOfProductNames[index] == oldProductName){
                listOfProductNames[index] = newProductName;
                System.out.println("product name is updated successfully");
            }
        }
    }
    //delete by productname
    public static void deleteByProductName(String productName){
        for(int index=0;index<listOfProductNames.length;index++){
            if(listOfProductNames[index] == productName){
                //delete operation
                listOfProductNames[index] = null;
                System.out.println("product name is deleted successfully");
            }
        }
    }

}
