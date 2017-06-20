class Man1 extends Car1{
	String name;//nameを宣言
	int age;//ageを宣言
	static int count = 0;
	static int ashi = 2;
		
		
		
		@Override //この@Overrideはなくても大丈夫なのだがあると上書きしているよということを明示するので非常にわかりやすい
		void showgass(){
		System.out.println("オーバーライドされたガソリン量の表示" + gass);
		}
		
		Man1(){
		name = "名前未設定";
		age = 10000;
		count++;
		System.out.println(count + "番目の人間です。");		
		}
		Man1(String n,int p){
		name = n;
		age = p;
		count++;
		System.out.println(count + "番目の人間です。");
		}
		
		void setname(String n){//viodは戻り値がない場合
		this.name = n;
		}
		
		void setage(int p){
		this.age = p;
		}
		
		void showman(){
		System.out.println(this.name + "はあと" + this.age + "歳の命です" + "足の数は" + ashi);
		}
		
		void ride(int r){
		
		System.out.println(this.name + "は" + r + "キロ走りました。");
		this.age = this.age - r * 10;
		if (this.age < 1){
		System.out.println(this.name + "は寿命が来ました");
		}else{
		System.out.println(this.name + "の寿命はあと" + this.age + "年です。");
		}
		}
		
		
	
}