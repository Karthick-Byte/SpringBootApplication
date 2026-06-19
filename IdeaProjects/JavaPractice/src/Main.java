//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    String str = "Karthicik";
//    String str2 = "Karthick is working in the Capgemini as a java developer with java";
//    List<String> word = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
//    List<String> list = Arrays.asList("Chennai","Bangalore","Mumbai","Chennai");
//
//    List<String> digitWord = word.stream().filter(n -> Character.isDigit(n.charAt(0)))
//                   .collect(Collectors.toList());
//    //System.out.println(digitWord);
//
//    //Count the character in a string
//    long countCharacter = str.chars().count();
//    System.out.println(countCharacter);
//    long countWord = str2.chars().count();
//    System.out.println(countWord);
//    long words = Arrays.stream(str2.split(" ")).count();
//    System.out.println(words);
//
//    //Find the longest word
//    String longWord = Arrays.stream(str2.split(" "))
//            .max(Comparator.comparingInt(String :: length))
//            .orElse(null);
//    System.out.println(longWord);
//
//    //Frequency of each character
//    Map<Character, Long> freq = str.toLowerCase().chars()
//            .mapToObj(c -> (char)c)
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    Collectors.counting()
//            ));
//    System.out.println(freq);
//
//    //Frequency of each word
//    Map<String, Long> freqWord = Arrays.stream(str2.split(" "))
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    Collectors.counting()
//            ));
//    System.out.println(freqWord);
//
//    //To count the specific character in the word
//    long countChar = str.chars().filter(ch -> ch=='i')
//            .count();
//    System.out.println(countChar);
//
//    //To count the specific character in the sentence
//    long countCharSen = str2.chars().filter(ch -> ch=='t').count();
//    System.out.println(countCharSen);
//
//    //First non repeating character in a string
//    Character uniqueCharacter = str.toLowerCase().chars()
//            .mapToObj(ch -> (char)ch)
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    LinkedHashMap :: new,
//                    Collectors.counting()
//            ))
//            .entrySet()
//            .stream()
//            .filter(e->e.getValue()==1)
//            .map(Map.Entry :: getKey)
//            .findFirst()
//            .get();
//    System.out.println(uniqueCharacter);
//
//    //First unique word in the sentence
//    String uniqueWord = Arrays.stream(str2.split(" "))
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    LinkedHashMap :: new,
//                    Collectors.counting()))
//                    .entrySet()
//                    .stream()
//                    .filter(e->e.getValue()==1)
//                    .map(Map.Entry::getKey)
//                    .findFirst()
//                    .get();
//            System.out.println(uniqueWord);
//
//    //Find the duplicate with the count
//    Map<String, Long> duplicateCount = Arrays.stream(str2.split(""))
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    LinkedHashMap :: new,
//                    Collectors.counting()
//            ))
//            .entrySet()
//            .stream()
//            .filter(e -> e.getValue()>1)
//            .collect(Collectors.toMap(
//                    Map.Entry::getKey,
//                    Map.Entry::getValue,
//                    (a,b)->a,
//                    LinkedHashMap::new
//            ));
//    System.out.println(duplicateCount);
//
//    //Space after first three case
//    String spaceBetweenWord = IntStream.range(0,str.length())
//            .mapToObj(i -> String.valueOf(str.charAt(i)) + ((i+1)%3==0?" ":""))
//            .collect(Collectors.joining())
//            .trim();
//    System.out.println(spaceBetweenWord);
//
//    //group by their length
//    Map<Integer, List<String>> groupByLength = word.stream()
//            .collect(Collectors.groupingBy(String::length));
//    System.out.println(groupByLength);
//
//    //Reverse a string
//    String reverseWord = new StringBuilder(str).reverse().toString();
//    System.out.println(reverseWord);
//
//
//    List<String> lstStr = Arrays.asList("abcd","efg","jkl","rtyu");
//    //Remove vowel
//    List<String> vowel = lstStr.stream()
//            .map(n->n.replaceAll("[AEIOUaeiou]",""))
//            .collect(Collectors.toList());
//    System.out.println(vowel);
//    //remove consonant
//    List<String> consonant = lstStr.stream()
//            .map(n -> n.replaceAll("[^AEIOUaeiou]",""))
//            .collect(Collectors.toList());
//    System.out.println(consonant);
//
//    //remove negative, double, desc
//    List<Integer> elements = Arrays.asList(-1,-2,8,3,-4,2,-6,6,7);
//
//    List<Integer> descValue = elements.stream()
//            .filter(n ->n>0)
//            .map(n-> n*n)
//            .sorted(Comparator.reverseOrder())
//            .collect(Collectors.toList());
//
//    System.out.println(descValue);


        String str1 = "Karthicik";
        String str2 = "Karthick is working in the Capgemini as a java developer with java";
        List<String> word = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> list = Arrays.asList("Chennai","Bangalore","Mumbai","Chennai");

        //Print only numbers by eliminating all other characters from String.
        String s1 = "1,1,4,5@3,1{6,7,4,8,9,3,4:5:7:?5?9?3?5?6,2";
        String result = s1.replaceAll("[^0-9]","");
        System.out.println(result);

        //Count the character in a string
        Long count = str1.chars().count();
        System.out.println(count);
        //Count the word in the sentence
        Long countWord = Arrays.stream(str2.split(" ")).count();
        System.out.println(countWord);
        //Find the longest word
        String longWord = Arrays.stream(str2.split(" "))
                .max(Comparator.comparingLong(String :: length))
                .orElse(null);
        System.out.println(longWord);
        //Find the frequency of each word
        Map<Character, Long> freqChar = str1.toLowerCase().chars()
                        .mapToObj(c-> (char)c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));
        System.out.println(freqChar);

        //Find the frequency of each word
        Map<String, Long> freqWord = Arrays.stream(str2.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(freqWord);


        //to count the character ‘a’ in every string
        long cout = str2.chars().filter(n->n=='i')
                .count();
        System.out.println(cout);

        //To count the character 'a' in each word of a sentence
        Map<String, Long> wordCount = Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingLong(w -> w.chars().filter(f -> f=='a').count())
                ));
        System.out.println(wordCount);

        //first non repeating character
        Character result1 = str1.toLowerCase().chars()
                .mapToObj(n -> (char)n)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap :: new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e ->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result1);

        //first non repeating character
        String unique = Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(unique);

        //Find the duplicate the word
        Set<String> duplicate = Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicate);

        //Find the duplicate with the count
        Map<String, Long> dup = Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                        ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()>1)
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (a,b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(dup);

        String str3 = "Anuj Tela Works With Barclays";
        //count and longest word
        long countWd = Arrays.stream(str3.split(" "))
                .count();
        System.out.println(countWd);
        String longestWord = Arrays.stream(str3.split(" "))
                .max(Comparator.comparingInt(String :: length))
                .orElse(null);
        System.out.println(longestWord);

        String randomStr = "azasfdsdfsadfsdfsdfdsf";
        Map<String, Long> freqOfChar = Arrays.stream(randomStr.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(freqOfChar);

        //"c,b$a"
//        String str = "a,b$c";
//        String reve = "";
//        for(int i=str.length()-1; i>0; i--)
//        {
//            char strVal = str.charAt(i);
//            if(strVal == 'a' && strVal == 'z')
//            {
//                reve = reve + strVal;
//            }
//        }
//
//        System.out.println(reve);

    String str = "TESTKARTHIKTESTKARTHIK";
    //count of KARTHIK

            long counts = Arrays.stream(str.split("KARTHIK"))
                    .count();
            System.out.println(counts);

            String name = "TESTKARTHIKTESTKARTHIK";

            long counted = Arrays.stream(name.split("TEST"))
                    .count();
            System.out.println("The counted value : "+ counted);





        List<Integer> lists = Arrays.asList(23,87,45,23,84,11,87,45);

        Set<Integer> duplicates = lists.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(p ->p.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());




            List<Integer> lst = Arrays.asList(120,250,76,230,74,240,300);

            int high = lst.get(0);
            int countVal = 0;
            for(int val : lst)
            {
                if(val>high) {

                    countVal++;
                    high = val;
                }
            }

            System.out.println(countVal);







}
