public class main {
	public static void main(String[] args) {
	    
	    System.out.println("どらぐんくえすと");
	    System.out.println("まず、あなたの年齢を教えてください");
	    
	    int age = 0;

	    
	    for(int a = 0; a < 100; a++){
	        age = new java.util.Scanner(System.in).nextInt();
	        
	        if (age >= 20 && age <= 49){
	            System.out.println("このゲームを始めるにはオジさん過ぎます。やり直してください。");
	            System.out.println("");
	        
	        } else if (age <= 12) {
	            System.out.println("このゲームを始めるにはガキすぎます。やり直してください。");
	            System.out.println("");
	            
	        } else if (age <= 17) {
	            System.out.println("思春期なので このゲームをプレイできません。やり直してください。");
	            System.out.println("");
	        
	        } else if (age == 18) {
	            System.out.println("車の免許が取れる年齢ですね。");
	            System.out.println("こんなクソゲーをする時間があるなら免許を取りに行ってください");
	            System.out.println("");
	        
	        } else if (age >= 45) {
	            System.out.println("面白くない年齢ボケをしたので終了します。");
	            System.out.println("GAME OVER");
	            System.out.println("");
	            System.exit(0);
	            break;
	        
	        } else if (age == 19) {
	            System.out.println("素晴らしい！");
	            break;
	        
	        }
	    }

        System.out.println("次に勇者となって冒険に出る");
	    System.out.println("あなたの名前を ひらがなで入力してください");
	    System.out.println("");

        String hero = new java.util.Scanner(System.in).nextLine();
        int hp = 100;

System.out.println("冒険を始めます。");
System.out.println("あなたのステータスはコチラです。");
System.out.println("【名前】勇者" + hero);
System.out.println("【ＨＰ】" + hp);
System.out.println("【寝不足】");
System.out.println("【腰痛持ち】");
System.out.println("【５３連勤中】");
System.out.println("");
System.out.println("");

System.out.println("どこに行きますか？");
System.out.println("数字で入力してください");
System.out.println("1：魔物の森    2：黒見の部屋　　3:道具屋");
System.out.println("");
System.out.println("");

int behave1 = new java.util.Scanner(System.in).nextInt();

int m = 0;

for (m = 0; m < 50; m++){
    if (behave1 == 1) {
    System.out.println(hero + "は魔物の森へ進んだ！");
    System.out.println("");
    System.out.println("");
    break;
        
    } else if (behave1 == 2) {
    System.out.println("勇者" +hero +"は、黒見の部屋で寝た！");
    System.out.println("勇者" +hero +"のHPが20増えた！");
    hp = hp + 20;
    System.out.println("残りHP：" +hp);
    System.out.println("");

    System.out.println("もう一度寝ますか？");
    System.out.println("1：もう一度寝る    2：魔物の森へ向かう");
    System.out.println("");
    int behave2 = new java.util.Scanner(System.in).nextInt();
    
     if (behave2 == 1) {
         System.out.println("勇者" +hero +"は、寝過ぎて逆に頭が痛くなった！");
         System.out.println("GAME OVER");
         System.out.println("");
         System.out.println("");
         System.exit(0);
	     break;
         
     } else if (behave2 == 2) {
         System.out.println("勇者" +hero +"は魔物の森へ向かった！");
         System.out.println("");
         break;
     } else {
         System.out.println("選択肢以外の数字を入力したので死んだ！");
         System.out.println("GAME OVER");
         System.out.println("");
         System.exit(0);
	     break;
     }
    
        
    } else if (behave1 ==3) {
    System.out.println("何を買いますか？");
    System.out.println("1:勇者の剣　　2:木刀　　3：NARUTOの単行本４２巻　　4:何も買わない");
    System.out.println("");

    int behave5 = new java.util.Scanner(System.in).nextInt();

    switch(behave5){
        case 1:
        System.out.println("重たすぎて腕の骨が折れた！");
        System.out.println("勇者" +hero +"に10ダメージ");
          hp = hp - 10;
        System.out.println("残りHP：" +hp);
        System.out.println("");
        System.out.println("勇者" +hero +"は魔物の森へ向かった。");
        break;

        case 2:
        System.out.println("木刀で店主を殴ってしまった！");
        System.out.println("GAME OVER");
        System.out.println("");
        System.exit(0);
        break;

        case 3:
        System.out.println("４２巻は自来也が亡くなってしまう話だ。");
        System.out.println("自来也が亡くなったショックで" +hero +"は寝込んでしまった！");
        System.out.println("GAME OVER");
        System.out.println("");
        System.exit(0);
        break;

        case 4:
        System.out.println("道具屋を出て魔物の森に向かった！");
        break;

        default:
        System.out.println("選択肢以外の数字を入力したので死んだ！");
         System.out.println("GAME OVER");
         System.out.println("");
         System.exit(0);
	     break;
    }
    break;

  }
}



System.out.println("【魔物の森】");
System.out.println("スライムが現れた！");
System.out.println("勇者" +hero +"はどうする？");
System.out.println("数字で入力してください");
System.out.println("1：殴る    2：蹴る    3：噛み付く    4：逃げる");
System.out.println("");
System.out.println("");



for (int b = 0; b < 30; b++) {
    
    int behave3 = new java.util.Scanner(System.in).nextInt();
    
    if(behave3 == 1){
            System.out.println("勇者" +hero +"の腕の骨が折れた！");
            System.out.println("勇者" +hero +"に10ダメージ");
            hp = hp - 10;
            if (hp > 0){
                System.out.println("残りHP：" +hp);
                System.out.println("");
                System.out.println("1：殴る    2：蹴る    3：噛み付く    4：逃げる");
                System.out.println("");
            } else {
                System.out.println("HPがなくなってしまった！");
                System.out.println("GAMEOVER");
                System.exit(0);
	            break;
            }
            //hpを10下げる
        }else if(behave3 == 2){
            System.out.println("勇者" +hero +"の脚の骨が折れた！");
            System.out.println("勇者" +hero +"に20ダメージ");
            hp = hp - 20;
            if (hp > 0){
                System.out.println("残りHP：" +hp);
                System.out.println("");
                System.out.println("1：殴る    2：蹴る    3：噛み付く    4：逃げる");
                System.out.println("");
            } else {
                System.out.println("HPがなくなってしまった！");
                System.out.println("GAMEOVER");
            }
            //hpを20下げる
        }else if (behave3 == 3){
            System.out.println("勇者" +hero +"の口からバイ菌が入った！");
            System.out.println("勇者" +hero +"に50ダメージ");
            hp = hp - 50;
            if (hp > 0){
                System.out.println("残りHP：" +hp);
                System.out.println("");
                System.out.println("1：殴る    2：蹴る    3：噛み付く    4：逃げる");
                System.out.println("");
            } else {
                System.out.println("HPがなくなってしまった！");
                System.out.println("GAMEOVER");
            }
            //hpを50下げる
        }else if(behave3 == 4){
            System.out.println("勇者" +hero +"は逃げきった！");
            System.out.println("");
            break;
        }else{
            System.out.println("選択肢以外の数字を入力したので死んだ！");
            System.out.println("GAME OVER");
            System.out.println("");
            System.exit(0);
            break;
        }
    }


System.out.println("どちらの城に向かいますか？");
            System.out.println("1：魔王の城    2：岸和田城");
            System.out.println("");

int behave4 = new java.util.Scanner(System.in).nextInt();

if (behave4 == 1){
    
    System.out.println("【魔王が現れた】");
System.out.println("目の前に魔王がいます。倒しますか？");
System.out.println("数値で入力してください。");
System.out.println("1：倒す    2：倒さない");
System.out.println("");


for (int n = 0; n < 20; n++){
    int lastBattle = new java.util.Scanner(System.in).nextInt();
    
    if (lastBattle == 1) {
        System.out.println("魔王「ぎゃーーーー！！！」");
        System.out.println("おめでとう！あなたは世界を救いました！");
        System.out.println("ゲームを終了します。");
        System.out.println("");
        System.exit(0);
        break;
        
    } else if (lastBattle == 2) {
        System.out.println("魔王「本当にいいのか？」");
        System.out.println("1：倒す    2：倒さない");
        System.out.println("");
        
    } else {
        System.out.println("他の数字を入力しないでください");
        System.out.println("1：倒す    2：倒さない");
        System.out.println("");
        
    }
    
	}
    
}else if(behave4 == 2){
    System.out.println("だんじりに轢かれてしまった！");
    System.out.println("GAME OVER");
    System.out.println("");
    System.exit(0);
}





            
    
    
    if (hp <= 0) {
        System.out.println("HPが無くなった！");
        System.out.println("勇者は倒れてしまった。。。");
        System.out.println("GAME OVER");
        System.out.println("");
        System.exit(0);
    }
}




}