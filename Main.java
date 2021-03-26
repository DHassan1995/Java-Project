
// Work on Daisy Case: 4 Next Time

import java.util.Scanner;
import java.util.HashMap;

class Main{
	static String input;
	public void display_menu(){
		String character1 = "Aivor";
		String character2 = "Daisy";
		String character3 = "Forren";
		String character4 = "Nathaniel";
		String character5 = "Solva";
		String character6 = "Uthal";
		String character7 = "Utzu";
		
			
		System.out.println("Which member of the Stormfang company would you like to play as? " + character1 + "? " + character2 + "? " + character3 + "? " + character4 + "? " + character5 + "? " + character6 + "? " + "Or, " + character7 + "?");

		System.out.println("Selection: ");	
	}
	public void display_menu2(){
		System.out.println("What are you going to do on your turn? 1) Attack\n2) Cast Inflict Wounds (4th Level)\n3) Cast Cure Wounds (4th Level)\n4) Cast Healing Word (4th Level) and Toll the Dead\n5) Cast Flame Strike\n6) Cast Healing Word (5th Level) and Toll the Dead\n7) Forfeit");
		System.out.println("Selection: ");
	}
	public void display_menu3(){
		System.out.println("What are you going to do on your turn? 1) All-out Precision Attack (Multi-Attack + Offhand Flintlock) !!! \n2) Multi-Attack and Second Wind \n3) All-out Attack Action Surge!\n4) Forfeit");
		System.out.println("Selection: ");			
	}
	//public void display_menu4(){
		
		
		//System.out.println("What 4th Level spell would you like to cast? 1) Inflict Wounds; 2) Cure Wounds; or 3) Healing Word and Toll the Dead?");
		//System.out.println("Selection: ");
	//}
	//public void display_menu5(){
		
		
		//System.out.println("What 5th Level spell would you like to cast? 1) Flame Strike; or 2) Healing Word and Toll the Dead?");
		//System.out.println("Selection: ");
	//}
	public Main(){

		
		
	int d20 = (int)(Math.random() * 20 +1);	
	HashMap<String, Integer> aivorStats = new HashMap<String, Integer>();
	aivorStats.put("Strength", 3);
	aivorStats.put("Dexterity", 3);
	aivorStats.put("Constitution", 4);
	aivorStats.put("Intelligence", -1);
	aivorStats.put("Wisdom", 5);
	aivorStats.put("Charisma", 1);
	aivorStats.put("HP", 97);
	aivorStats.put("AC", 18);	
	
	HashMap<String, Integer> daisyStats = new HashMap<String, Integer>();
	daisyStats.put("Strength", 3);
	daisyStats.put("Dexterity", 4);
	daisyStats.put("Constitution", 1);
	daisyStats.put("Intelligence", 0);
	daisyStats.put("Wisdom", 2);
	daisyStats.put("Charisma", 3);
	daisyStats.put("HP", 87);
	daisyStats.put("Armor Class", 18);
		

		try (Scanner input = new Scanner(System.in)) {
			
			display_menu();
			switch(input.nextLine()) {
				case "Aivor":
						
					System.out.println ("You picked Aivor, the tempest cleric who wants to retire." );
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					int playerHealth = aivorStats.get("HP");
					int playerAC = aivorStats.get("AC");
					try (Scanner input2 = new Scanner(System.in)) {
						
	
						switch(input2.nextLine()) {
							case "Aivor":
								System.out.println ("A mirror match?\nWell, if you say so..." );
								int aivorHealth = aivorStats.get("HP");
								int aivorAC = aivorStats.get("AC");
									
									
									do{
												
										Scanner turn = new Scanner(System.in);
										
											
											int fd20 = (int)(Math.random() * 20 + 1);
											int dc = 17;
											int fStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
											int toll = 2 * (int)(Math.random() * 12 + 1);
											int inflictWounds = (int)(Math.random() * 64 + 7);
											int iwCritical = 2 * (int)(Math.random() * 64 + 7);
											int healFifth = 5 * (int)(Math.random() * 4 + 1) + 5;	
											int cure = 4 * (int)(Math.random() * 8 + 1) + 5;													
											int heal = 4 * (int)(Math.random() * 4 + 1) + 5;
											int tollCrit = 4 * (int)(Math.random() * 12 + 1);
											int foeStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
											int inflictWoundsFoe = (int)(Math.random() * 64 + 7);
											int iwCriticalFoe = 2 * (int)(Math.random() * 64 + 7);
											int selection;	
											display_menu2();
											selection = turn.nextInt();
											

											switch(selection) {
												
												case 1: 
													int handAxe = (int)(Math.random() * 6 + 1);
													int foeHandAxe = (int)(Math.random() * 6 + 1); 
													int damage = handAxe + 3;
													int foeDamage = foeHandAxe + 3;
													int criticalDamage = handAxe * 2 + 3;
													int foeCriticalDamage = foeHandAxe * 2 + 3;
													
													
													
													if (d20 + 7 >= aivorAC && d20 + 7 < 27){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - damage;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your foe attempts to strike you!");									
														if (fd20 + 7 >= playerAC && fd20 + 7 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															System.out.println("Your Health: " + playerHealth);
															
																
														}else if (27 == fd20 + 7){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															System.out.println("Your Health: " + playerHealth);
															
														}else{	
															System.out.println("The attack missed!");
															System.out.println("Your Health: " + playerHealth);
															
														}

														
														

													}else if (27 == d20 + 7){
														System.out.println("A critical hit!");
														aivorHealth = aivorHealth - criticalDamage;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your foe attempts to strike you!");

														if (fd20 + 7 >= playerAC && fd20 + 7 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															System.out.println("Your Health: " + playerHealth);
															
														}else if (27 == fd20 + 7){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															System.out.println("Your Health: " + playerHealth);
															
														}else{	
															System.out.println("The attack missed!");
															System.out.println("Your Health: " + playerHealth);
															
														}

														
														
													}else{
														System.out.println("The attack missed!");
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your foe attempts to strike you!");
															if (fd20 + 7 >= playerAC && fd20 + 7 < 27){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																
																
															}else if (29 == fd20 + 9){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																System.out.println("Your Health: " + playerHealth);
																
																
															}else{	
																System.out.println("The attack missed!");
																System.out.println("Your Health: " + playerHealth);
																
															}
													}
													break;
												case 2:
													
													
													if(d20 + 9 > aivorAC && d20 + 9 < 29){
														System.out.println("The attack hits!");
														aivorHealth = aivorHealth - inflictWounds;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your foe casts: Inflict Wounds!"); 
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
															System.out.println("The attack hits!");
															playerHealth = playerHealth - inflictWoundsFoe;
															System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - iwCriticalFoe;
															System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");
															System.out.println("Your Health: " + playerHealth);
															}	
													}else if (29 == d20 + 9){
														System.out.println("A critical hit!");
														aivorHealth = aivorHealth - iwCritical;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your foe casts: Inflict Wounds!");
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
															System.out.println("The attack hits!");
															playerHealth = playerHealth - inflictWoundsFoe;
															System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - iwCriticalFoe;
															System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");																				
															System.out.println("Your Health: " + playerHealth);
																			}
																			
													}else{
														System.out.println("The attack misses!");																			
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your foe casts: Inflict Wounds!");
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
														System.out.println("The attack hits!");
														playerHealth = playerHealth - inflictWoundsFoe;
														System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
														System.out.println("A critical hit!");
														playerHealth = playerHealth - iwCriticalFoe;
														System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");																				
															System.out.println("Your Health: " + playerHealth);
														}
													}
													break;

												case 3:
																		
													System.out.println("Your wounds begin to heal!");
													playerHealth = playerHealth + cure;
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Your foe casts: Inflict Wounds!");
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
															System.out.println("The attack hits!");
															playerHealth = playerHealth - inflictWoundsFoe;
															System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - iwCriticalFoe;
															System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");																				
															System.out.println("Your Health: " + playerHealth);
														}
													break;

												case 4:
													if(d20 + 9 > aivorAC && d20 + 9 < 29){
														System.out.println("The attack hits!");
														aivorHealth = aivorHealth - toll;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth + heal;
														System.out.println("Your wounds begin to heal!");
														System.out.println("Your Health: " + playerHealth);
														System.out.println("Your foe casts: Inflict Wounds!"); 
																			
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
															System.out.println("The attack hits!");
															playerHealth = playerHealth - inflictWoundsFoe;
															System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - iwCriticalFoe;
															System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");
															System.out.println("Your Health: " + playerHealth);
														}

													}else if (29 == d20 + 9){
														System.out.println("A critical hit!");
														aivorHealth = aivorHealth - tollCrit;
														System.out.println("Your Enemy's Health: " + playerHealth);
														playerHealth = playerHealth + heal;
														System.out.println("Your wounds begin to heal!");
														System.out.println("Your Health: " + playerHealth);
														System.out.println("Your foe casts: Inflict Wounds!"); 
																			
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
															System.out.println("The attack hits!");
															playerHealth = playerHealth - inflictWoundsFoe;
															System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - iwCriticalFoe;
															System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");
															System.out.println("Your Health: " + playerHealth);
														}
													}else{
														System.out.println("The attack missed!");
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your wounds begin to heal!");
														System.out.println("Your Health: " + playerHealth);
														System.out.println("Your foe casts: Inflict Wounds!"); 
																			
														if(fd20 + 9 > playerAC && fd20 + 9 < 29){
															System.out.println("The attack hits!");
															playerHealth = playerHealth - inflictWoundsFoe;
															System.out.println("Your  Health: " + playerHealth);
																				
														}else if (29 == fd20 + 9){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - iwCriticalFoe;
															System.out.println("Your Health: " + playerHealth);
																			
														}else{
															System.out.println("The attack misses!");
															System.out.println("Your Health: " + playerHealth);
														}	
													}
												break;	
																	
															
											case 5:
												if (fd20 + 3 < dc){
													System.out.println("Your enemy failed their saving throw.");
													aivorHealth = aivorHealth - fStrike;
													System.out.println("Your Enemy's Health: " + aivorHealth);
													System.out.println("Your foe casts: Flame Strike right back at you!");
															if (d20 + 3 < dc){
																System.out.println("You failed the saving throw.");
																playerHealth = playerHealth - foeStrike;
																System.out.println("Your Health: " + playerHealth);
															}else{
																playerHealth = playerHealth - foeStrike / 2;
																System.out.println("You passed the saving throw.");
																System.out.println("Your Health: " + playerHealth);
															}		
												}else{
													aivorHealth = aivorHealth - fStrike / 2;
													System.out.println("Your foe passed their save!");
													System.out.println("Your Enemy's Health: " + aivorHealth);
													System.out.println("Your foe casts: Flame Strike right back at you!");
													if (d20 + 3 < dc){
														System.out.println("You failed the saving throw.");
														playerHealth = playerHealth - foeStrike;
														System.out.println("Your Health: " + playerHealth);
													}else{
														playerHealth = playerHealth - foeStrike / 2;
														System.out.println("You passed the saving throw.");
														System.out.println("Your Health: " + playerHealth);
													}
												}
												break;
											case 6: 
									
												if(d20 + 9 > aivorAC && d20 + 9 < 29){
													System.out.println("The attack hits!");
													aivorHealth = aivorHealth - toll;
													System.out.println("Your Enemy's Health: " + aivorHealth);
													playerHealth = playerHealth + healFifth;
													System.out.println("Your wounds begin to heal!");
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Your foe casts: Healing word and Toll the Dead right back at you!");
																			
													if(d20 + 9 > aivorAC && d20 + 9 < 29){
																																											System.out.println("The attack hits, and their wounds heal!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth - toll;
														System.out.println("Your Health: " + playerHealth);
																				
													}else if (27 == d20 + 7){
														System.out.println("A critical hit, and their wounds begin to heal as well!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth - tollCrit;
														System.out.println("Your Health: " + playerHealth);
																				
													}else{
														System.out.println("The attack missed, but their wounds heal as well!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your Health: " + playerHealth);
																				
													}

												}else if (27 == d20 + 7){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - tollCrit;
													System.out.println("Your Enemy's Health: " + aivorHealth);
													playerHealth = playerHealth + healFifth;
													System.out.println("Your wounds begin to heal!");
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Your foe casts: Healing word and Toll the Dead right back at you!");
													if(d20 + 9 > aivorAC && d20 + 9 < 29){
																																											System.out.println("The attack hits, and their wounds heal!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth - toll;
														System.out.println("Your Health: " + playerHealth);
																				
													}else if (27 == d20 + 7){
														System.out.println("A critical hit, and their wounds begin to heal as well!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth - tollCrit;
														System.out.println("Your Health: " + playerHealth);
																				
													}else{
														System.out.println("The attack missed, but their wounds heal as well!");
																				
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your Health: " + playerHealth);
																				
													}
												}else{
													System.out.println("The attack missed!");
																			
													System.out.println("Your Enemy's Health: " + aivorHealth);
													System.out.println("Your wounds begin to heal!");
													playerHealth = playerHealth + healFifth;
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Your foe casts: Inflict Wounds!");	
													if(d20 + 9 > aivorAC && d20 + 9 < 29){
																																											System.out.println("The attack hits, and their wounds heal!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth - toll;
														System.out.println("Your Health: " + playerHealth);
																				
													}else if (27 == d20 + 7){
														System.out.println("A critical hit, and their wounds begin to heal as well!");
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														playerHealth = playerHealth - tollCrit;
														System.out.println("Your Health: " + playerHealth);
																				
													}else{
														System.out.println("The attack missed, but their wounds heal as well!");
																				
														aivorHealth = aivorHealth + healFifth;
														System.out.println("Your Enemy's Health: " + aivorHealth);
														System.out.println("Your Health: " + playerHealth);
																				
													}
												}
												break;			
														
											case 7:
												playerHealth = 0;
												System.out.println("Pathetic...");
												break;
											default:
												System.err.println ("Please make a valid selection next time.");
												break;
													
												
											}
																		
											}while(aivorHealth > 0 && playerHealth > 0);	
											if (aivorHealth < 1 && playerHealth > 0){
												System.out.println("Congratulations! You...beat yourself up???");
											}else if (aivorHealth > 0 && playerHealth < 1){
												System.out.println("How embarassing, you've lost to yourself! You couldn't even manage a draw?");
											}else{
												System.out.println("A draw? Guess you'll just have to try again.");
											}
								break;
								
							case "Daisy":
								System.out.println ( "You picked Daisy, the battlemaster pirate seeking revenge.");
								int daisyHealth = daisyStats.get("HP");
								int daisyAC = daisyStats.get("Armor Class");
								
								do{
												
										Scanner turn = new Scanner(System.in);
										
											int fd20 = (int)(Math.random() * 20 + 1);
											int dc = 17;
											int fStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
											int toll = 2 * (int)(Math.random() * 12 + 1);
											int inflictWounds = (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1);
											int iwCritical = 2 * ((int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1));
											int healFifth = (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + 5;	
											int cure = (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + 5;													
											int heal = (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + 5;
											int tollCrit = 4 * (int)(Math.random() * 12 + 1);
											int handAxe = (int)(Math.random() * 6 + 1);
											int damage = handAxe + 3;
											int criticalDamage = handAxe * 2 + 4;
											int devilsTongue = (int)(Math.random() * 8 + 1) + (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1);
											int foeDamage = devilsTongue + 4;
											int foeCriticalDamage = devilsTongue * 2 + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + 4;
											int secondWind = (int)(Math.random() * 10 + 1) + 11;
											int selection;	
											display_menu2();
											selection = turn.nextInt();
											

											switch(selection) {
												case 1: 
													if (d20 + 7 >= daisyAC && d20 + 7 < 27){
														System.out.println("Your attack hits!");
														daisyHealth = daisyHealth - damage;
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Your foe attempts to strike you, and activates second wind!");																	daisyHealth = daisyHealth + secondWind;
														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

														
														

													}else if (27 == d20 + 7){
														System.out.println("A critical hit!");
														daisyHealth = daisyHealth - criticalDamage;
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Your foe attempts to strike you!");

														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
														
														
													}else{
														System.out.println("The attack missed!");
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Your foe attempts to strike you!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																		System.out.println("Foe's attack hits!");
																		playerHealth = playerHealth - foeDamage;
																		System.out.println("Your Health: " + playerHealth);
																
																
																	}else if (28 == fd20 + 8){
																		System.out.println("A critical hit!");
																		playerHealth = playerHealth - foeCriticalDamage;
																		System.out.println("Your Health: " + playerHealth);
															
																	}else{	
																		System.out.println("The attack missed!");
																		System.out.println("Your Health: " + playerHealth);
															
																	}
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																		System.out.println("Foe's attack hits!");
																		playerHealth = playerHealth - foeDamage;
																		System.out.println("Your Health: " + playerHealth);
																
																
																	}else if (28 == fd20 + 8){
																		System.out.println("A critical hit!");
																		playerHealth = playerHealth - foeCriticalDamage;
																		System.out.println("Your Health: " + playerHealth);
															
																	}else{	
																		System.out.println("The attack missed!");
																		System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
													}
													break;
												case 2:
													
													
													if(d20 + 9 > daisyAC && d20 + 9 < 29){
														System.out.println("The attack hits!");
														daisyHealth = daisyHealth - inflictWounds;
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
													}else if (29 == d20 + 9){
														System.out.println("A critical hit!");
														daisyHealth = daisyHealth - iwCritical;
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
																			
													}else{
														System.out.println("The attack misses!");																			
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
													}
													break;

												case 3:
																		
													System.out.println("Your wounds begin to heal!");
													playerHealth = playerHealth + cure;
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
													break;

												case 4:
													if(d20 + 9 > daisyAC && d20 + 9 < 29){
														System.out.println("The attack hits!");
														aivorHealth = daisyHealth - toll;
														System.out.println("Your Enemy's Health: " + daisyHealth);
														playerHealth = playerHealth + heal;
														System.out.println("Your wounds begin to heal!");
														System.out.println("Your Health: " + playerHealth);
														System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

													}else if (29 == d20 + 9){
														System.out.println("A critical hit!");
														daisyHealth = daisyHealth - tollCrit;
														System.out.println("Your Enemy's Health: " + daisyHealth);
														playerHealth = playerHealth + heal;
														System.out.println("Your wounds begin to heal!");
														System.out.println("Your Health: " + playerHealth);
														System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

													}else{
														System.out.println("The attack missed!");
														System.out.println("Your Enemy's Health: " + daisyHealth);
														System.out.println("Your wounds begin to heal!");
														System.out.println("Your Health: " + playerHealth);
														System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

													}
												break;	
																	
															
											case 5:
												if (fd20 + 3 < dc){
													System.out.println("Your enemy failed their saving throw.");
													daisyHealth = daisyHealth - fStrike / 2;
													System.out.println("Your Enemy's Health: " + daisyHealth);
													System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}
		
												}else{
													daisyHealth = daisyHealth - fStrike / 4;
													System.out.println("Your foe passed their save!");
													System.out.println("Your Enemy's Health: " + daisyHealth);
													System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

												}
												break;
											case 6: 
									
												if(d20 + 9 > daisyAC && d20 + 9 < 29){
													System.out.println("The attack hits!");
													daisyHealth = daisyHealth - toll;
													System.out.println("Your Enemy's Health: " + daisyHealth);
													playerHealth = playerHealth + healFifth;
													System.out.println("Your wounds begin to heal!");
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}


												}else if (29 == d20 + 9){
													System.out.println("A critical hit!");
													daisyHealth = daisyHealth - tollCrit;
													System.out.println("Your Enemy's Health: " + daisyHealth);
													playerHealth = playerHealth + healFifth;
													System.out.println("Your wounds begin to heal!");
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Your foe casts: Healing word and Toll the Dead right back at you!");
													System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

												}else{
													System.out.println("The attack missed!");
																			
													System.out.println("Your Enemy's Health: " + daisyHealth);
													System.out.println("Your wounds begin to heal!");
													playerHealth = playerHealth + healFifth;
													System.out.println("Your Health: " + playerHealth);
													System.out.println("Daisy returns your spell with a flurry of blows!"); 
														if (fd20 + 8 >= playerAC && fd20 + 8 < 27){		
															System.out.println("Foe's attack hits!");
															playerHealth = playerHealth - foeDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
																
														}else if (28 == fd20 + 8){
															System.out.println("A critical hit!");
															playerHealth = playerHealth - foeCriticalDamage;
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																System.out.println("Your Health: " + playerHealth);
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
															
														}else{	
															System.out.println("The attack missed!");
															if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																System.out.println("Foe's attack hits!");
																playerHealth = playerHealth - foeDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
																
															}else if (28 == fd20 + 8){
																System.out.println("A critical hit!");
																playerHealth = playerHealth - foeCriticalDamage;
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															
															}else{	
																System.out.println("The attack missed!");
																if (fd20 + 8 >= playerAC && fd20 + 8 < 28){		
																	System.out.println("Foe's attack hits!");
																	playerHealth = playerHealth - foeDamage;
																	System.out.println("Your Health: " + playerHealth);
																
																
																}else if (28 == fd20 + 8){
																	System.out.println("A critical hit!");
																	playerHealth = playerHealth - foeCriticalDamage;
																	System.out.println("Your Health: " + playerHealth);
															
																}else{	
																	System.out.println("The attack missed!");
																	System.out.println("Your Health: " + playerHealth);
															
																}
															}
														}

												}
												break;			
													
										case 7:
											playerHealth = 0;
											System.out.println("Pathetic...");
											break;
										}
								}while(daisyHealth > 0 && playerHealth > 0);
								if(daisyHealth <= 0 && playerHealth > 0){
									System.out.println("\"For the glory of Aegir!\"");
								}else if (playerHealth <= 0 && daisyHealth > 0){
									System.out.println("\"Not even a challenge.\"");
								}else{
									System.out.println("Who's gunna clean up this mess now that you're both unconscious?");
								}
								break;

							case "Forren":
								System.out.println ( "You picked Forren, the circle of the shephard druid looking for adventure.");
								break;
							case "Nathaniel":
								System.out.println ( "You picked Nathaniel, the monster hunter driven from his home.");
								break;
							case "Solva":
								System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
								break;
							case "Uthal":
								System.out.println ( "You picked Uthal, the berserker from the ice rim mountains.");
								break;	
							case "Utzu":
								System.out.println ( "You picked Utzu, the wily hexblade who is up to no good.");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}	
					}
				
					break;

				case "Daisy":
					System.out.println ( "You picked Daisy, the battlemaster pirate seeking revenge.");
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					int playerHealth1 = daisyStats.get("HP");
					int playerAC1 = daisyStats.get("Armor Class");
					
					Scanner input3 = new Scanner(System.in);
						
						switch(input3.nextLine()) {
							case "Aivor":
								System.out.println ("You picked Aivor, the tempest cleric who wants to retire.");
									int aivorHealth = aivorStats.get("HP");
									int aivorAC = aivorStats.get("AC");
									int fd20 = (int)(Math.random() * 20 + 1);
									int dc = 17;
									int healSixth = (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + (int)(Math.random() * 4 + 1) + 5;	
									int toll = (int)(Math.random() * 12 + 1) + (int)(Math.random() * 12 + 1) + (int)(Math.random() * 12 + 1);
									int tollCrit = 2 * toll;
									int foeStrike = (int)(Math.random() * 27 + 4) + (int)(Math.random() * 27 + 4);
									int inflictWoundsFoe = (int)(Math.random() * 74 + 7);
									int iwCriticalFoe = 2 * (int)(Math.random() * 74 + 7);
									int d4 = (int)(Math.random() * 4 + 1);
									
							do{
								display_menu3();				
								int selection;
								Scanner turn = new Scanner(System.in);
								selection = turn.nextInt();
								int devilsTongue = (int)(Math.random() * 8 + 1) + (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1); 
								int damage = devilsTongue + 4;
								int criticalDamage = devilsTongue * 2 + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + 4;
								int d8 = (int)(Math.random() * 8 + 1);
								int d201 = (int)(Math.random() * 20 + 1);
								int d202 = (int)(Math.random() * 20 + 1);
								int d203 = (int)(Math.random() * 20 + 1);
								int d204 = (int)(Math.random() * 20 + 1);
								int d205 = (int)(Math.random() * 20 + 1);
								int d206 = (int)(Math.random() * 20 + 1);
								int flintlock = (int)(Math.random() * 6 + 1);
								int secondWind = (int)(Math.random() * 10 + 1) + 11;
								switch(selection) {
									case 1: 
										if (d201 + 8 + d8 - d4>= aivorAC && d201 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d202 + 8 + d8 - d4 >= aivorAC && d202 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
			
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}			
												}
																
											}else if (28 == d202 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}			
												}
															
											}else{	
												System.out.println("The attack missed!");
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
																
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}		
												}
											}
																
										}else if (28 == d201 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d202 + 8 + d8 - d4 >= aivorAC && d202 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}			
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}												
												}
																
											}else if (28 == d202 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													System.out.println("Enemy Health: " + aivorHealth);
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}		
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
												}
															
											}else{	
												System.out.println("The attack missed!");
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d202 + 8 + d8 - d4 >= aivorAC && d202 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
												}
															
											}else if (28 == d202 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
																
																
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
														
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
												}
															
											}else{	
												System.out.println("The attack missed!");
												if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
													System.out.println("Your attack hits!");
													aivorHealth = aivorHealth - damage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
															
												}else if (28 == d203 + 8){
													System.out.println("A critical hit!");
													aivorHealth = aivorHealth - criticalDamage;
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
														
												}else{	
													System.out.println("The attack missed!");
													if (d204 + 8 + d8 - d4 >= aivorAC){
														System.out.println("Your attack hits!");
														aivorHealth = aivorHealth - flintlock;
														System.out.println("Enemy Health: " + aivorHealth);
													}else{
														System.out.println("Your attack misses.");
														System.out.println("Enemy Health: " + aivorHealth);
													}
														
												}
											}
										}
										System.out.println("Your foe casts: Inflict Wounds!");
										if(fd20 + 9 + d4> playerAC1 && fd20 + 9 < 29){
											System.out.println("The attack hits!");
											playerHealth1 = playerHealth1 - inflictWoundsFoe;
											System.out.println("Your  Health: " + playerHealth1);
																				
										}else if (29 == fd20 + 9){
											System.out.println("A critical hit!");
											playerHealth = playerHealth1 - iwCriticalFoe;
											System.out.println("Your Health: " + playerHealth1);
																			
										}else{
											System.out.println("The attack misses!");
											System.out.println("Your Health: " + playerHealth1);
										}
													
										break;
								case 2:
									System.out.println("You draw on inner reserves of energy, giving yourself the will to continue forward!");
									playerHealth1 = playerHealth1 + secondWind;
									if (d201 + 8 - d4>= aivorAC && d201 + 8 < 28){		
										System.out.println("Your attack hits!");
										aivorHealth = aivorHealth - damage;
										if (d202 + 8 - d4>= aivorAC && d202 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d203 + 8 - d4>= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
																
										}else if (28 == d202 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
																
									}else if (28 == d201 + 8){
										System.out.println("A critical hit!");
										aivorHealth = aivorHealth - criticalDamage;
										if (d202 + 8 - d4 >= aivorAC && d202 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);												
											}
																
										}else if (28 == d203 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
															
									}else{	
										System.out.println("The attack missed!");
										if (d202 + 8 - d4 >= aivorAC && d202 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
																
										}else if (28 == d202 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d203 + 8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																	
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
									}
									System.out.println("Your foe casts healing word and toll the dead!");
									aivorHealth = aivorHealth + healSixth;
									System.out.println("Your Enemy's Health: " + aivorHealth);
									if(fd20 + 9 + d4> playerAC1 && fd20 + 9 < 29){
										System.out.println("The attack hits, and their wounds heal!");
										playerHealth = playerHealth1 - toll;
										System.out.println("Your Health: " + playerHealth1);
																				
									}else if (29 == fd20 + 9){
										System.out.println("A critical hit, and their wounds begin to heal as well!");
										playerHealth = playerHealth1 - tollCrit;
										System.out.println("Your Health: " + playerHealth1);
																				
									}else{
										System.out.println("The attack missed, but their wounds heal as well!");			
										System.out.println("Your Health: " + playerHealth1);
									}
									break;
								case 3:
									if (d201 + 8 + d8 - d4 >= aivorAC && d201 + 8 < 28){		
										System.out.println("Your attack hits!");
										aivorHealth = aivorHealth - damage;
										if (d202 + 8 + d8 - d4 >= aivorAC && d202 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
																
										}else if (28 == d202 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
																
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
																
									}else if (28 == d201 + 8){
										System.out.println("A critical hit!");
										aivorHealth = aivorHealth - criticalDamage;
										if (d202 + 8 + d8 - d4 >= aivorAC && d202 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);												
											}
																
										}else if (28 == d202 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
															
									}else{	
										System.out.println("The attack missed!");
										if (d202 + 8 + d8 - d4 >= aivorAC && d202 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
																
										}else if (28 == d202 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																									
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d203 + 8 + d8 - d4 >= aivorAC && d203 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
									}
									System.out.println("You push forward, temporarily exceeding your limits!");
									if (d204 + 8 - d4>= aivorAC && d204 + 8 < 28){		
										System.out.println("Your attack hits!");
										aivorHealth = aivorHealth - damage;
										if (d205 + 8 - d4>= aivorAC && d205 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d206 + 8 - d4>= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
																
										}else if (28 == d205 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
																
									}else if (28 == d204 + 8){
										System.out.println("A critical hit!");
										aivorHealth = aivorHealth - criticalDamage;
										if (d205 + 8 - d4 >= aivorAC && d205 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);												
											}
																
										}else if (28 == d205 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d203 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
															
									}else{	
										System.out.println("The attack missed!");
										if (d205 + 8 - d4 >= aivorAC && d205 + 8 < 28){		
											System.out.println("Your attack hits!");
											aivorHealth = aivorHealth - damage;
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
																
										}else if (28 == d205 + 8){
											System.out.println("A critical hit!");
											aivorHealth = aivorHealth - criticalDamage;
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
											}
															
										}else{	
											System.out.println("The attack missed!");
											if (d206 + 8 - d4 >= aivorAC && d206 + 8 < 28){		
												System.out.println("Your attack hits!");
												aivorHealth = aivorHealth - damage;
												System.out.println("Enemy Health: " + aivorHealth);
																	
																
											}else if (28 == d206 + 8){
												System.out.println("A critical hit!");
												aivorHealth = aivorHealth - criticalDamage;
												System.out.println("Enemy Health: " + aivorHealth);
															
											}else{	
												System.out.println("The attack missed!");
												System.out.println("Enemy Health: " + aivorHealth);
															
											}
										}
									}
									System.out.println("Aivor casts Chain Lightning, invoking Aegir for max damage!");
									int chainLightning = 80;
									if (d20 + 4 - d4 > 17){
										playerHealth1 = playerHealth1 - chainLightning/2;
										System.out.println("You just barely escape the brunt of the damage!");
										System.out.println("Your Health: " + playerHealth1);
									}else{
										playerHealth1 = playerHealth1 - chainLightning;
										System.out.println("Your Health: " + playerHealth1);
										System.out.println("Yikes...that's gotta hurt!");
									}
									break;
								case 4:
									playerHealth = 0;
									System.out.println("Pathetic...");
									break;
								default:
									System.out.println("Please make a valid selection.");
								}

							}while(aivorHealth > 0 && playerHealth1 > 0);
							if(aivorHealth <= 0 && aivorHealth >= -20 && playerHealth1 > 0){
								System.out.println("\"Not even a challenge.\"");
							}else if (aivorHealth < -20 && playerHealth1 > 0){
								System.out.println("\"Wow I went a little overkill there didn't ? Sorry!\"");
							}else if (playerHealth1 <= 0 && playerHealth1 >= -20 && aivorHealth > 0){
								System.out.println("\"For the glory of Aegir!\"");
							}else if (playerHealth1 < -20 && aivorHealth > 0){
								System.out.println("\"Oh man...I'm not sure revivify can fix this...\"");
							}else{
								System.out.println("Who's gunna clean up this mess now that you're both unconscious?");
							}
								break;
							

							case "Daisy":
								System.out.println ("A mirror match? Well, if you say so..." );
								//int foeDamage = devilsTongue + 4;
								//int daisyHealth = daisyStats.get("HP");
								//int daisyAC = daisyStats.get("Armor Class");
								break;
							case "Forren":
								System.out.println ( "You picked Forren, the circle of the shephard druid looking for adventure.");
								break;
							case "Nathaniel":
								System.out.println ( "You picked Nathaniel, the monster hunter driven from his home.");
								break;
							case "Solva":
								System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
								break;
							case "Uthal":
								System.out.println ( "You picked Uthal, the berserker from the ice rim mountains.");
								break;	
							case "Utzu":
								System.out.println ( "You picked Utzu, the wily hexblade who is up to no good.");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}
					
					
					break;

				case "Forren":
					System.out.println ( "You picked Forren, the circle of the shephard druid looking for adventure.");
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					
					Scanner input4 = new Scanner(System.in);
						
						switch(input4.nextLine()) {
							case "Aivor":
								//int aivorHealth = aivorStats.get("HP");
								//int aivorAC = aivorStats.get("AC");
								//int fd20 = (int)(Math.random() * 20 + 1);
								//int dc = 17;
								//int healFifth = 5 * (int)(Math.random() * 4 + 1) + 5;	
								//int cure = 4 * (int)(Math.random() * 8 + 1) + 5;													
								//int heal = 4 * (int)(Math.random() * 4 + 1) + 5;
								//int tollCrit = 4 * (int)(Math.random() * 12 + 1);
								//int foeStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
								//int inflictWoundsFoe = (int)(Math.random() * 64 + 7);
								//int iwCriticalFoe = 2 * (int)(Math.random() * 64 + 7);
								System.out.println ("You picked Aivor, the tempest cleric who wants to retire.");
								break;
							case "Daisy":
								System.out.println ("You picked Daisy, the battlemaster pirate seeking revenge.");
								//int foeDamage = devilsTongue + 4;
								//int daisyHealth = daisyStats.get("HP");
								//int daisyAC = daisyStats.get("Armor Class");
								break;
							case "Forren":
								System.out.println ("A mirror match? Well, if you say so..." );
								break;
							case "Nathaniel":
								System.out.println ( "You picked Nathaniel, the monster hunter driven from his home.");
								break;
							case "Solva":
								System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
								break;
							case "Uthal":
								System.out.println ( "You picked Uthal, the berserker from the ice rim mountains.");
								break;	
							case "Utzu":
								System.out.println ( "You picked Utzu, the wily hexblade who is up to no good.");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}
					
					break;

				case "Nathaniel":
					System.out.println ( "You picked Nathaniel, the monster hunter drvien from his home");
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					Scanner input5 = new Scanner(System.in);
						
						switch(input5.nextLine()) {
							case "Aivor":
								System.out.println ("You picked Aivor, the tempest cleric who wants to retire.");
								int aivorHealth = aivorStats.get("HP");
								int aivorAC = aivorStats.get("AC");
								int fd20 = (int)(Math.random() * 20 + 1);
								int dc = 17;
								int healFifth = 5 * (int)(Math.random() * 4 + 1) + 5;	
								int cure = 4 * (int)(Math.random() * 8 + 1) + 5;													
								int heal = 4 * (int)(Math.random() * 4 + 1) + 5;
								int tollCrit = 4 * (int)(Math.random() * 12 + 1);
								int foeStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
								int inflictWoundsFoe = (int)(Math.random() * 64 + 7);
								int iwCriticalFoe = 2 * (int)(Math.random() * 64 + 7);
								break;
							case "Daisy":
								System.out.println ("You picked Daisy, the battlemaster pirate seeking revenge");
								//int foeDamage = devilsTongue + 4;
								//int foeCriticalDamage = devilsTongue * 2 + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + 4;
								//int daisyHealth = daisyStats.get("HP");
								//int daisyAC = daisyStats.get("Armor Class");
								break;
							case "Forren":
								System.out.println ("You picked Forren, the circle of the shephard druid looking for adventure" );
								break;
							case "Nathaniel":
								System.out.println ( "A mirror match? Well, if you say so...");
								break;
							case "Solva":
								System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
								break;
							case "Uthal":
								System.out.println ( "You picked Uthal, the berserker from the ice rim mountains.");
								break;	
							case "Utzu":
								System.out.println ( "You picked Utzu, the wily hexblade who is up to no good.");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}
					break;

				case "Solva":
					System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					Scanner input6 = new Scanner(System.in);
						
						switch(input6.nextLine()) {
							case "Aivor":
								System.out.println ("You picked Aivor, the tempest cleric who wants to retire.");
								int aivorHealth = aivorStats.get("HP");
								int aivorAC = aivorStats.get("AC");
								int fd20 = (int)(Math.random() * 20 + 1);
								int dc = 17;
								int healFifth = 5 * (int)(Math.random() * 4 + 1) + 5;	
								int cure = 4 * (int)(Math.random() * 8 + 1) + 5;													
								int heal = 4 * (int)(Math.random() * 4 + 1) + 5;
								int tollCrit = 4 * (int)(Math.random() * 12 + 1);
								int foeStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
								int inflictWoundsFoe = (int)(Math.random() * 64 + 7);
								int iwCriticalFoe = 2 * (int)(Math.random() * 64 + 7);
								break;
							case "Daisy":
								System.out.println ("You picked Daisy, the battlemaster pirate seeking revenge.");
								//int foeDamage = devilsTongue + 4;
								//int foeCriticalDamage = devilsTongue * 2 + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + 4;
								//int daisyHealth = daisyStats.get("HP");
								//int daisyAC = daisyStats.get("Armor Class");
								break;
							case "Forren":
								System.out.println ("You picked Forren, the circle of the shephard druid looking for adventure." );
								break;
							case "Nathaniel":
								System.out.println ("You picked Nathaniel, the monster hunter driven from his home.");
								break;
							case "Solva":
								System.out.println ( "A mirror match? Well, if you say so...");
								break;
							case "Uthal":
								System.out.println ( "You picked Uthal, the berserker from the ice rim mountains.");
								break;	
							case "Utzu":
								System.out.println ( "You picked Utzu, the wily hexblade who is up to no good.");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}
					
					break;

				case "Uthal":
					System.out.println ( "You picked Uthal, the berserker from the ice rim mountains.");
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					Scanner input7 = new Scanner(System.in);
						
						switch(input7.nextLine()) {
							case "Aivor":
								System.out.println ("You picked Aivor, the tempest cleric who wants to retire.");
								int aivorHealth = aivorStats.get("HP");
								int aivorAC = aivorStats.get("AC");
								int fd20 = (int)(Math.random() * 20 + 1);
								int dc = 17;
								int healFifth = 5 * (int)(Math.random() * 4 + 1) + 5;	
								int cure = 4 * (int)(Math.random() * 8 + 1) + 5;													
								int heal = 4 * (int)(Math.random() * 4 + 1) + 5;
								int tollCrit = 4 * (int)(Math.random() * 12 + 1);
								int foeStrike = (int)(Math.random() * 21 + 4) + (int)(Math.random() * 21 + 4);
								int inflictWoundsFoe = (int)(Math.random() * 64 + 7);
								int iwCriticalFoe = 2 * (int)(Math.random() * 64 + 7);
								break;
							case "Daisy":
								System.out.println ("You picked Daisy, the battlemaster pirate seeking revenge.");
								//int foeDamage = devilsTongue + 4;
								//int foeCriticalDamage = devilsTongue * 2 + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + (int)(Math.random() * 10 + 1) + 4;
								//int daisyHealth = daisyStats.get("HP");
								//int daisyAC = daisyStats.get("Armor Class");
								break;
							case "Forren":
								System.out.println ("You picked Forren, the circle of the shephard druid looking for adventure." );
								break;
							case "Nathaniel":
								System.out.println ("You picked Nathaniel, the monster hunter driven from his home.");
								break;
							case "Solva":
								System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
								break;
							case "Uthal":
								System.out.println ( "A mirror match? Well, if you say so...");
								break;	
							case "Utzu":
								System.out.println ( "You picked Utzu, the wily hexblade who is up to no good. This should be interesting...");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}
					
					break;

				case "Utzu":
					System.out.println ( "You picked Utzu, the wily hexblade who is up to no good.");
					System.out.println(" Now, which member of the Stormfang company would you like to fight against? ");
					System.out.println("Selection: ");
					Scanner input8 = new Scanner(System.in);
						
						switch(input8.nextLine()) {
							case "Aivor":
								System.out.println ("You picked Aivor, the tempest cleric who wants to retire.");
								
								break;
							case "Daisy":
								System.out.println ("You picked Daisy, the battlemaster pirate seeking revenge.");
									
										
								//int daisyHealth = daisyStats.get("HP");
								//int daisyAC = daisyStats.get("Armor Class");
								break;
							case "Forren":
								System.out.println ("You picked Forren, the circle of the shephard druid looking for adventure." );
								break;
							case "Nathaniel":
								System.out.println ("You picked Nathaniel, the monster hunter driven from his home.");
								break;
							case "Solva":
								System.out.println ( "You picked Solva, the circle of the moon druid looking to belong.");
								break;
							case "Uthal":
								System.out.println ( "You picked Uthal, the berserker from the ice rim mountains. This should be interesting...");
								break;	
							case "Utzu":
								System.out.println ( "A mirror match? Well, if you say so...");
								break;
							default:
								System.err.println ("Please choose a valid combatant next time.");
								break;
						}
					
					break;
				default:
					System.err.println ("Please choose a valid combatant next time.");
					break;
			}					
		}
	}
	public static void main(String[] args){
	new Main();
	}
}
