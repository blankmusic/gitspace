package offer_1;
//���ӣ�https://www.nowcoder.com/questionTerminal/45327ae22b7b413ea21df13ee7d6429c
//��Դ��ţ����

/*
    ��������Ҫ��������ϸ�о���������������˺ö�β����׵ġ�
    ���ȣ��������������
         1>�����ַ�����Ϊ�գ�����true
         2>����һ���ַ������գ����ڶ����ַ������ˣ�����false����Ϊ���������޷�
            ƥ��ɹ���,�������һ���ַ������ˣ��ڶ����ַ����ǿգ����ǿ���ƥ���
            ���ģ�����ڶ����ַ����ǡ�a*a*a*a*��,���ڡ�*��֮ǰ��Ԫ�ؿ��Գ���0�Σ�
            �����п���ƥ��ɹ���
    ֮��Ϳ�ʼƥ���һ���ַ������������ֿ��ܣ�ƥ��ɹ���ƥ��ʧ�ܡ������ǵ�pattern
    ��һ���ַ������ǡ�*���� �������Ƿ�����������ۣ�pattern��һ���ַ�Ϊ��*����
    ��Ϊ��*����
          1>pattern��һ���ַ���Ϊ��*������������Ƚϼ򵥣�ֱ��ƥ�䵱ǰ�ַ������
            ƥ��ɹ�������ƥ����һ�������ƥ��ʧ�ܣ�ֱ�ӷ���false��ע�������
            ��ƥ��ɹ��������������ַ���ͬ������⣬����һ�����������pattern��
            ��ǰ�ַ�Ϊ��.��,ͬʱstr�ĵ�ǰ�ַ���Ϊ��\0����
          2>pattern��һ���ַ�Ϊ��*��ʱ����΢����һЩ����Ϊ��*�����Դ���0��������
            �������Щ��������ǵ���
               a>����*��ƥ��0���ַ�ʱ��str��ǰ�ַ����䣬pattern��ǰ�ַ�������λ��
                ���������*�����ţ�
               b>����*��ƥ��1������ʱ��str��ǰ�ַ�������һ����pattern��ǰ�ַ�
                ���䡣������ƥ��1���������Կ���һ���������Ϊ����ƥ��һ��ʱ��
                ����str�Ƶ�����һ���ַ�����pattern�ַ����䣬�ͻص����ϱߵ����a��
                ��ƥ�����һ���ַ�ʱ���൱�ڴ�str����һ���ַ�������ʼƥ�䣩
    ֮����д����ͺܼ��ˡ�
*/

public class Offer_19 {

	 public boolean match(char[] str, char[] pattern)
	    {int m = str.length, n = pattern.length;
	    boolean[][] dp = new boolean[m + 1][n + 1];

	    dp[0][0] = true;
	    for (int i = 1; i <= n; i++)
	        if (pattern[i - 1] == '*')
	            dp[0][i] = dp[0][i - 2];

	    for (int i = 1; i <= m; i++)
	        for (int j = 1; j <= n; j++)
	            if (str[i - 1] == pattern[j - 1] || pattern[j - 1] == '.')
	                dp[i][j] = dp[i - 1][j - 1];
	            else if (pattern[j - 1] == '*')
	                if (pattern[j - 2] == str[i - 1] || pattern[j - 2] == '.') {
	                    dp[i][j] |= dp[i][j - 1]; // a* counts as single a
	                    dp[i][j] |= dp[i - 1][j]; // a* counts as multiple a
	                    dp[i][j] |= dp[i][j - 2]; // a* counts as empty
	                } else
	                    dp[i][j] = dp[i][j - 2];   // a* only counts as empty

	    return dp[m][n];
	        
	    }
	
	
	
	 public boolean match2(char[] str, char[] pattern) {
		    if (str == null || pattern == null) {
		        return false;
		    }
		    int strIndex = 0;
		    int patternIndex = 0;
		    return matchCore(str, strIndex, pattern, patternIndex);
		}
		  
		public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		    //��Ч�Լ��飺str��β��pattern��β��ƥ��ɹ�
		    if (strIndex == str.length && patternIndex == pattern.length) {
		        return true;
		    }
		    //pattern�ȵ�β��ƥ��ʧ��
		    if (strIndex != str.length && patternIndex == pattern.length) {
		        return false;
		    }
		    //ģʽ��2����*�����ַ�����1����ģʽ��1��ƥ��,��3��ƥ��ģʽ���粻ƥ�䣬ģʽ����2λ
		    if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
		        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
		            return matchCore(str, strIndex, pattern, patternIndex + 2)//ģʽ����2����Ϊx*ƥ��0���ַ�
		                    || matchCore(str, strIndex + 1, pattern, patternIndex + 2)//��Ϊģʽƥ��1���ַ�
		                    || matchCore(str, strIndex + 1, pattern, patternIndex);//*ƥ��1������ƥ��str�е���һ��
		        } else {
		            return matchCore(str, strIndex, pattern, patternIndex + 2);
		        }
		    }
		    //ģʽ��2������*�����ַ�����1����ģʽ��1��ƥ�䣬�򶼺���1λ������ֱ�ӷ���false
		    if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
		        return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
		    }
		    return false;
		    }
		        
	
	
	
	public static void main(String[] args) {
	Offer_19 offer=new Offer_19();
	char[] str= {'a','a','a'};
	char[] pattern= {'a','b','*','a','c','*','a'};
	System.out.println(offer.match(str, pattern));
     
	}

}
