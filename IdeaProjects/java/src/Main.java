//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

// Child obj = new Child();
// obj.play();
// obj.eat();
//
// Demo obj2 = new Demo();
// obj2.eat();

//    Parent obj = new Parent();
//    obj.working();
//    Parent obj2 = new Child();
//    obj2.working();

    Child obj = new Child();
    obj.pay();
    Parent obj2 = new Parent();
    obj2.pay();

   int age =16;
   try{
       if(age<18)
       {
           throw new ExceptionClass("The age is less then 18");
       }
   }
   catch(ExceptionClass e)
   {
       System.out.println(e.getMessage());
   }

    Thread t = new Thread(new MyThread());
    t.start();

    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.execute(()->{System.out.println("The task1 "+Thread.currentThread().getName());});
    executor.execute(()->{System.out.println("The task2 "+Thread.currentThread().getName());});
    executor.execute(()->{System.out.println("The task3 "+Thread.currentThread().getName());});
    executor.shutdown();

    List<String> names = Arrays.asList("alice", "bob", "charlie");
    Map<String, Integer> val = names.stream()
            .collect(Collectors.toMap(
                    str -> str,
                    String :: length
            ));
    System.out.println(val);

    Map<String, Long> vale = names.stream()
            .collect(Collectors.toMap(
                    str -> str,
                    n-> n.toLowerCase().chars()
                            .filter(p ->"aeiou".indexOf(p)!=-1)
                            .count()
            ));
    System.out.println(vale);

    String  str="tyuioplkhgfdaazxcvvb";

//    List<Character> word = str.chars()
//            .mapToObj(c -> (char)c)
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    Collectors.counting()))
//            .entrySet()
//            .stream()
//            .filter(f -> f.getValue()==1)
//            .map(Map.Entry::getKey)
//            .collect(Collectors.toList());
//
//    System.out.println(word);

//    IntStream.range(0,str.length())
//            .filter(i -> i%2==0)
//            .map(m -> str.toUpperCase().charAt(m))
//            .forEach(System.out::println);
//
//    String res = ()->{System.out.println("Hello");}


   //Int[] arr = {10,5,20,8,20,15};

//    List<Integer> lst = Arrays.asList(10,5,20,8,20,15);
//    Optional<Integer> result = lst.stream()
//            .sorted(Comparator.reverseOrder())
//            .distinct()
//            .skip(1)
//            .findFirst();
//            //.get();
//    System.out.println(result);


//    Optional<Integer> resl = lst.stream()
//            .filter(n -> n%2!=0)
//            .distinct()
//            .findFirst();
//    System.out.println(resl.orElse(0));
//    //resl.ifPresent(System.out::println);


    //Interview Evaluation
    List<Integer> list = Arrays.asList(5, 3, 8, 1);

    List<Integer> result = list.stream().sorted().collect(Collectors.toList());



































































}



