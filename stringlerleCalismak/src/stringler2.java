
public class stringler2 {


    public static void main(String[] args) {
        String mesaj = "  Bugün hava çok güzel.";
        System.out.println(mesaj);
        
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);
        
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,4));
        
        int sayac = 0;
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
            sayac++;
        }
        System.out.println(sayac + " tane kelime vardır");
        
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        
        System.out.println(mesaj.trim());
    }
    
}
