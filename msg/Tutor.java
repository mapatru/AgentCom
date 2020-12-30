package msg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Tutor extends Agent {
	static Random random = new Random();
	static int randomNumber = random.nextInt(100- (-100)) + (-100);
//	static int randomNumber = 20;
	
	
	
	@Override
	protected void setup() {
		addBehaviour(new OneShotBehaviour() {
			
			@Override
			public void action() {
				// Send questions to the Pupil Agent
				for(int i=1; i<=15; i++) {
				ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
				
				// Send a random math question
				msg.setContent("Calculate: 30 + " + i + " + " + "(" + randomNumber +")");
				msg.addReceiver(new AID("Pupil", AID.ISLOCALNAME));
				System.out.println(msg.getContent());
//				System.out.println(msg);
				send(msg);
				
				
			}
			}
			
		});
		
		

	}
	
	public static int getRandom() {
		return randomNumber;
	}
	
}


