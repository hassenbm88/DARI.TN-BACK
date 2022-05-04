package com.bezkoder.springjwt.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.bezkoder.springjwt.repository.*;
import com.bezkoder.springjwt.interfaces.*;
import com.bezkoder.springjwt.models.*;

import java.util.List;


@Component
@Service

public class AgentService implements IAgent {




        @Autowired
        private AgentRepository agentRepository;



        public AgentService(AgentRepository agentRepository, VisiteRepository visiteRepository) {
            this.agentRepository = agentRepository;

        }


        @Override
        public List<Agent> retrieveAllAgents() {
            return agentRepository.findAll();
        }
        @Override
        public Agent createAgent(Agent agent ){

            agentRepository.save(agent);
            return null;

        }
        @Override
        public String deleteAgent(Long idAgent){
            Agent agent = agentRepository.findById(idAgent).orElseThrow(() -> new RuntimeException("agent not found"));
            agentRepository.deleteById(agent.getIdAgent());
            return null;
        }
        @Override
        public Agent updateAgent(Agent agent){
            return agentRepository.save(agent);

        }


        @Override
        public Agent retrieveAgent(Long idAgent) {
            // TODO Auto-generated method stub
            return agentRepository.findById(idAgent).orElse(null);
        }



}
