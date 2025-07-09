package itmo.java.basics.lessons.lesson14;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<PromoCode> codes = new ArrayList<>();
        codes.add(new PromoCode("SKIDKA100", false));
        codes.add(new PromoCode("SKIDKA100", true));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA100", false));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA200", true));
        codes.add(new PromoCode("SKIDKA100", false));
        codes.add(new PromoCode("SKIDKA200", true));
        codes.add(new PromoCode("SKIDKA100", true));
        codes.add(new PromoCode("SKIDKA200", true));
        codes.add(new PromoCode("SKIDKA400", false));
        codes.add(new PromoCode("SKIDKA400", false));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA500", true));
        codes.add(new PromoCode("SKIDKA500", false));
        codes.add(new PromoCode("SKIDKA100", true));
        codes.add(new PromoCode("SKIDKA100", false));
        codes.add(new PromoCode("SKIDKA100", true));
        codes.add(new PromoCode("SKIDKA200", false));
        codes.add(new PromoCode("SKIDKA200", true));
        codes.add(new PromoCode("SKIDKA100", true));
        codes.add(new PromoCode("SKIDKA100", false));


        List<PromoCode> notExpiredCodes = codes.stream().filter(code -> !code.getExpired()).collect(Collectors.toList());
//        notExpiredCodes.forEach(System.out::println);


        List<PromoCode> expiredCodes = codes.stream().filter(PromoCode::getExpired).collect(Collectors.toList());
//        expiredCodes.forEach(System.out::println);

        List<PromoCode> skidka100Codes = codes.stream().filter(code -> code.getCode().equals("SKIDKA100") && !code.getExpired()).collect(Collectors.toList());
//        skidka100Codes.forEach(System.out::println);

//        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(skidka100Codes);

        Map<String, List<PromoCode>> map = codes.stream().collect(Collectors.groupingBy(PromoCode::getCode));

//        List<PromoCode> skidka500 = map.get("SKIDKA500");
//        System.out.println(skidka500);

//        Map<String, PromoCode> collect = codes.stream().collect(Collectors.toMap(PromoCode::getCode, Function.identity())); Duplicate Keys
//        Map<String, PromoCode> collect = codes.stream().collect(Collectors.toMap(PromoCode::getCode, Function.identity(), (a, b) -> a)); bad hack
//        System.out.println(collect);

//        map.forEach((k, v) -> {
//            if (k.equals("SKIDKA400")) {
//                v.forEach(System.out::println);
//            }
//        });

//        i++ ++i
//        AtomicInteger counter = new AtomicInteger();
//
//        codes.forEach(code -> {
//            if (!code.getCode().equals("SKIDKA100")) {
//                counter.incrementAndGet();
//            }
//        });
//
//        System.out.println(counter.get());

//        Set<String> collect = codes.stream().map(PromoCode::getCode).collect(Collectors.toSet());
//        collect.forEach(System.out::println);
//
//        List<Car> cars = codes.stream().map(code -> new Car(code.getCode(), code.getExpired())).collect(Collectors.toList());
//        cars.forEach(System.out::println);


        Collection<List<PromoCode>> values = map.values();
        List<PromoCode> promoCodeList = values.stream().flatMap(Collection::stream).collect(Collectors.toList());

//        promoCodeList.sort(Comparator.comparing(PromoCode::getCode));
        promoCodeList.sort(Comparator.comparing(PromoCode::getCode, Comparator.reverseOrder()));

        promoCodeList.forEach(System.out::println);
    }
}