class Sum {
int su = 0;
	public int main sum(int n){
	while(int i <=  n){
		su+=i;
		i++;
			}
		return su;
				}

public static void main(String args[]){
	Sum a = new Sum();
	System.out.println("Enter the number to sum : ");
	Scanner sc = new Scanner(System.in);
	int n1 =  sc.nextInt();
	int ans = a.sum(n1);
	sc.close();
	System.out.println("Sum of numbers is : "+ans);

					}
	}