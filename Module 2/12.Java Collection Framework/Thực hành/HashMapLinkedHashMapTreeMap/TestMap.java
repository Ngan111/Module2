package HashMapLinkedHashMapTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Anna", 9);
        hashMap.put("Ida", 10);
        hashMap.put("Kevin", 4);
        hashMap.put("Mike", 7);
        System.out.println("Display entries in hashMap");
        System.out.println(hashMap + "\n");
        //hashMap tối ưu cho các thao tác tìm kiếm, thêm, xóa

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        //Tối ưu cho các thao tác duyệt qua các entry theo trật tự sắp xếp của các key

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(5,0.75f,true);
        linkedHashMap.put("Tina",11);
        linkedHashMap.put("Rosie",12);
        linkedHashMap.put("Ken",5);
        linkedHashMap.put("Oliu",7);
        linkedHashMap.put("Paul",4);
        System.out.println(linkedHashMap);
        //Kế thừa hashMap, hỗ trợ sắp xếp các entry.
        }
    }
