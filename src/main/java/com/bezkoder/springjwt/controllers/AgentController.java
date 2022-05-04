package com.bezkoder.springjwt.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.bezkoder.springjwt.Services.*;
import  com.bezkoder.springjwt.models.*;
import java.util.List;


    @RestController
    @RequestMapping("/agent")
    public class AgentController {


        @Autowired
        AgentService agentService;

        @PostMapping("/addAgent")
        public Agent createAgent(@RequestBody Agent agent ) {
            return  agentService.createAgent(agent);

        }


        @GetMapping("/retrieve-Agents")
        @ResponseBody
        public List<Agent> getAgent() {
            List<Agent> listAgent = agentService.retrieveAllAgents();
            return listAgent;
        }
        @PutMapping("/updateAgent")
        public Agent updateAgent(@RequestBody Agent agent){
            return agentService.updateAgent(agent);
        }

        @GetMapping("/retrieve-Agent/{Agent-id}")
        @ResponseBody
        public Agent getAgent(@PathVariable("Agent-id") Long idAgent ) {
            return agentService.retrieveAgent(idAgent);

        }

        @DeleteMapping("/deleteAgent/{idAgent}")
        public String deleteAgent(@PathVariable Long idAgent){

            return agentService.deleteAgent(idAgent);

        }

}
