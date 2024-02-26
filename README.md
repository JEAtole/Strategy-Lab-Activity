# Strategy Pattern

## Problem

Suppose we have three types of characters in a GameApp:

1. **Knight:** Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. **Wizard:** Casts spells; uses magic barrier to defend
3. **Archer:** Shoots arrows; uses dodge to to defend

Implement two types of Strategy:

**A. DefenseStrategy** <br/>
     1. Shield <br/>
     2. Dodge <br/>
     3. CreateBarrier

**B. AttackStrategy** <br/>
     1.  CastSpell <br/>
     2.  ShootArrow <br/>
     3.  SwingSword <br/>


Refactor the existing codes and provide the UML Diagram:

    public class Character {
        private String type;
    
        public Character(String type) {
            this.type = type;
        }
    
        public void attack() {
            if (type.equals("Knight")) {
                System.out.println("Knight attacks with a sword!");
            } else if (type.equals("Wizard")) {
                System.out.println("Wizard casts a spell!");
            } else if (type.equals("Archer")) {
                System.out.println("Archer shoots an arrow!");
            }
        }
    
        public void defend() {
            if (type.equals("Knight")) {
                System.out.println("Using a shield to defend!");
    	System.out.println("Dodgin to avoid attack!");
                System.out.println("Creating a magic barrier for defense!"");		
    
            } else if (type.equals("Wizard")) {
                System.out.println("Creating a magic barrier for defense!"");
            } else if (type.equals("Archer")) {
                System.out.println("Using a shield to defend!"");
            }
        }
    }

## Class Diagram

![strategyPattern_Class Diagram](https://github.com/JEAtole/Strategy-Lab-Activity/assets/126703958/8f4eaef9-bf45-4a5f-b8bd-aace09414760)

