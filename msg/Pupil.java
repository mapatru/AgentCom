package msg;

import javax.swing.JOptionPane;

import java.util.*;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class Pupil extends Agent {

	
	@Override
	protected void setup() {
		System.out.println("Random no received " + Tutor.getRandom());
		
		addBehaviour(new CyclicBehaviour() {
			;
			@Override
			public void action() {
				
				// Receive questions from the Teacher agent.
				ACLMessage msg =receive();
				if(msg!=null) {
					System.out.println("Answer: " + msg.getContent());
//					JOptionPane.showMessageDialog(null, "Message received " + msg.getContent());
				}else block();
			
			}
		});
		
	}
	
}
