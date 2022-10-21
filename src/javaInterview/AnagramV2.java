package javaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnagramV2 {



    public static boolean isAnagram(String s,String t){

        if (s.length()!=t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }


        }

        //if (mapS.size()!=mapT.size()) return false;
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }

        Set<Character> chars = map.keySet();
        for (Character aChar : chars) {
            if (map.get(aChar)!=0) return false;
        }

        return true;
    }


    public static void main(String[] args){
        String s = "hhbywxfzydbppjxnbhezsxepfexkzofxyqdvcgdvgnjbvihgufvgtuxtpioxgjuwawkbaerbsirrktcjcesepcocaglbassivfbjhikynfsvlbtkawstrclbkpuldshfgfvwjawownulsggsxhhqglbhjlgltfrqyjntgldlgorgatnjrsywlyngxrcwfojkmydmjbzuquqnzbpwlcbdzgdicctpkgtbdjgywkyrkityvohjbuvmzdfyicyplmrpygdhaeqbuxnehfybsysnnmzbhprsyjmtpcrzeqqbirofzjtlsyofdyeffkvpuhzaflwjfhnsuyryetjuajjnjwvlvrhvpenaarnzoafztixjrisfzdlepcwhxudjpsiirtofymnovacjmpdjtethjqfwduekczlqhsfjgqesyoxcfooagrdhyvsmssbhsclnlblhobvhwtpyftolneozlhbtjagpgqnnapktyevdvjfwdnbwsbelweoflhyhifprieuvfcdkavqxkygjlaegqfmzndgxbsccjgpclxmlpstrqjtqyvlqcopnahqvnpvkjimfdlosvletmamqjvotqwhadutmfvlgldniixvdkmymfadckuaglgbuttymoqmzkaeqxugsrnfyxzcamwxujgzupefretsvbdweuwwcizjvhcowtmwgkdafcpzctpsjwdocgofivyshwdinbdhbxdfhjsrrsfchxkeqndgzauyprwfnrbmunanqnhmjhrufoinakwaciaoerioqffmipfqujfxwofqdyjbhagkyvmnxcwomgnmwlaodxgkgthnuctoozxrebjiynjwohtgukyneyofabpfdrxklopmxxiwjuxqpaazknscagfiaetmmwnwpzceglupqvlctywtpluoqbzdultcsudubqclbwlxyfboimfwriugfulbntvdwnxgiycxvennakpodorvpiknkridcumsovvfziki", t = "rmhdxtymfgxjluxmeeerhxrrtjgecmyfdhevakyosvvuwgbwmxiakbmtqjjpgctjojdqatuelqmfeldgoprxbzcylajhhjngqlmporofjpoyhrkptrbpzvvnkrqjovfzmmqybqxzjxarhguqcyvlugwmnzwtffanzuajraqbvjflgalgcwuhmrkblobybwouffzptbvkmwoklczfhvkqsirkqvhkryyxpkyfnwnjudvllmznupldkpoplwdlfzncwxdlgvgkehpcudqybnyhofpjnjmahnsrntxjtgocwsrnukejehwzxdetglgahdvzyypdztqwbnfrnytxprhtqjgobzjyewuasgnryjoyvwhdmemppixqcowgmicbmsukgodwgnsdieuqyzuysedmsphmritlqtnvnvfnmgnghxdsmmnzdhdalhfsfsppupteyrlajxrlbyqteaytgpsckottqnibbxhmkwuqfftwvibzsnaumsbohxeoaulsmwuvjcimscyqhtioekembdwfozglussscbzejqnvmcpfwdmxshhrkquacplctruyklkxcfovcbqllmyghdbkhdmawpmalrsgymgmbleftwtvldxkqprcbcbneyyluoyydtcvkimqjoinwntfxfbwqjbufqansdlgrgauzfwxpzrjxpesmozcsczbfzfeziedqzwywtxhyfnpbxfgbqcsfwdiplegcsrseqsagvkpjrupkaxffrddebpntocmkbarvdrhvujedwnktsdimzcbqlqyizozxcexqpoefjpznegsrtbfanqdyqaaudcklplvxojfuzccmtauaxurbwbexulqbxooadcrlxbtggxcycadratsuqavwwkdqtutptdpbnxeicmackhyvjhkfbayjmymjwejybhoryyqjjmwqzhpgulovxaccychffcplvkqfqghmgmdsigkugsevwkvzgpxiolhtzocdiphokfitgg";


        System.out.println(isAnagram(s,t));

    }



}
