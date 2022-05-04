package com.bezkoder.springjwt.interfaces;

import com.bezkoder.springjwt.models.Agent;

import java.util.List;

public interface IAgent {
    public Agent retrieveAgent(Long idAgent) ;
    public Agent updateAgent(Agent agent) ;
    public String deleteAgent(Long idAgent) ;
    public Agent createAgent(Agent agent);
    public List<Agent> retrieveAllAgents();
}
