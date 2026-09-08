// Last updated: 08/09/2026, 12:38:30
1class Solution {
2
3    String[] ones = {
4        "", "One", "Two", "Three", "Four",
5        "Five", "Six", "Seven", "Eight", "Nine",
6        "Ten", "Eleven", "Twelve", "Thirteen",
7        "Fourteen", "Fifteen", "Sixteen",
8        "Seventeen", "Eighteen", "Nineteen"
9    };
10
11    String[] tens = {
12        "", "", "Twenty", "Thirty", "Forty",
13        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
14    };
15
16    public String numberToWords(int num) {
17
18        if (num == 0) {
19            return "Zero";
20        }
21
22        String result = "";
23
24        if (num >= 1_000_000_000) {
25            result += convert(num / 1_000_000_000) + " Billion ";
26            num %= 1_000_000_000;
27        }
28
29        if (num >= 1_000_000) {
30            result += convert(num / 1_000_000) + " Million ";
31            num %= 1_000_000;
32        }
33
34        if (num >= 1000) {
35            result += convert(num / 1000) + " Thousand ";
36            num %= 1000;
37        }
38
39        if (num > 0) {
40            result += convert(num);
41        }
42
43        return result.trim();
44    }
45
46    public String convert(int num) {
47
48        if (num < 20) {
49            return ones[num];
50        }
51
52        if (num < 100) {
53            return tens[num / 10] + 
54                   (num % 10 != 0 ? " " + ones[num % 10] : "");
55        }
56
57        return ones[num / 100] + " Hundred" +
58               (num % 100 != 0 ? " " + convert(num % 100) : "");
59    }
60}