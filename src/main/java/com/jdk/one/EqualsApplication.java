package com.jdk.one;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class EqualsApplication {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EqualsApplication(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EqualsApplication equalsApplication = new EqualsExtendApplication("通话");
        EqualsApplication equalsApplication1 = new EqualsExtendApplication("重地");

        System.out.println(equalsApplication.hashCode() + "  " + equalsApplication1.hashCode());
        System.out.println(equalsApplication.equals(equalsApplication1));

        String str1 = "通话";
        String str21 = "重地";
        String str321 = new String("使用的");
        String str321dd = new String("使用的");

        System.out.println(new StringBuffer(str1).reverse());

        System.out.println(str1.hashCode() == str21.hashCode());
        System.out.println(str1.equals(str21));
        System.out.println(str321.equals(str321dd));

        EqualsExtendApplication equalsExtendApplication = new EqualsExtendApplication("通话");
        equalsExtendApplication.setName("eerere");
        EqualsExtendApplication equalsExtendApplication1 = new EqualsExtendApplication("重地");

        System.out.println(equalsExtendApplication1.equals(equalsExtendApplication));

        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(1.5));


        System.out.println(str1.valueOf(1)); //指定字符的索引
        System.out.println(str1.charAt(1));//指定索引处的字符

    }
}
