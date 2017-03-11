/**
7.牌型种数
小明被劫持到X赌城，被迫与其他3人玩牌。
一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
这时，小明脑子里突然冒出一个问题：
如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？

请填写该整数，不要填写任何多余的内容或说明文字。
*/
public class BrandInteger
{
	/**
	通过蛮力法，每一张牌有0,1,2,3,4种可能一共有13张牌
	*/
	public static void main(String [] args)
	{
	int a[]=new int[13];
	int count=0;
	for(a[0]=0;a[0]<=4;a[0]++)
	{
		for(a[1]=0;a[1]<=4;a[1]++)
		{
			for(a[2]=0;a[2]<=4;a[2]++)
			{
				for(a[3]=0;a[3]<=4;a[3]++)
				{
					for(a[4]=0;a[4]<=4;a[4]++)
					{
						for(a[5]=0;a[5]<=4;a[5]++)
						{
							for(a[6]=0;a[6]<=4;a[6]++)
							{
								for(a[7]=0;a[7]<=4;a[7]++)
								{
									for(a[8]=0;a[8]<=4;a[8]++)
									{
										for(a[9]=0;a[9]<=4;a[9]++)
										{
											for(a[10]=0;a[10]<=4;a[10]++)
											{
												for(a[11]=0;a[11]<=4;a[11]++)
												{
													for(a[12]=0;a[12]<=4;a[12]++)
													{
														if(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9]+a[10]+a[11]+a[12]==13)
														{
															count++;
														}
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	System.out.println(count);

	}*/
		
	
	/**别人的代码*/
		static int sum = 0; // 记录手中的牌的数目
    static int ans = 0; // 记录结果
    private static void cal(int n){
        if (sum > 13) return;
        if (n==14){ // 13种牌型以及全部搜索
            if (sum == 13){
                ans++;
                return;
            }
        }else{
            for(int i = 0; i<5; i++){
                sum+=i;
                cal(n+1);
                sum-=i; // 还原
            }
        }
    }

    public static void main(String[] args) {
        cal(1); // 从第一个牌搜索
        System.out.println(ans);
    }
	
	
}